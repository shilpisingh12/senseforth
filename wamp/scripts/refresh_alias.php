<?php

//v1.0 by Romain Bourdon

$httpdfile = "../apache2/conf/httpd.conf";
$wampserverini_file = '../wampmanager.ini';
$conffile_dir = '../apache2/conf/alias/';

$myhttpd = @file($httpdfile) or die ("httpd.conf file not found");

foreach($myhttpd as $line)
{
    if (preg_match('|^Include ".+/alias/(.+)"|',$line,$match))
    {
        $alias[] = $match[1];
    }
}



$mywampini = @file_get_contents($wampserverini_file) or die ("wampmanager.ini file not found");

foreach ($alias as $one_alias)
{
    $myreplace = $myreplacemenu = $mydeletemenu = '';
    


    $mypattern = ';add_alias';
    $newalias_dir = ereg_replace('.conf','',$one_alias);
    
    
    $alias_contents = @file_get_contents ($conffile_dir.$one_alias);
    preg_match('|^Alias /'.$newalias_dir.'/ "(.+)"|',$alias_contents,$match);
    $newalias_dest = $match[1]; 
    
    $myreplace = 'Type: submenu; Caption: "http://localhost/'.$newalias_dir.'/"; SubMenu: alias_'.ereg_replace(' ','_',$newalias_dir).'; Glyph: 3
;add_alias';
    $mywampini = ereg_replace($mypattern,$myreplace,$mywampini);
    $myreplacemenu = ';start_'.ereg_replace(' ','_',$newalias_dir).'_menu
[alias_'.ereg_replace(' ','_',$newalias_dir).']
Type: separator; Caption: "'.$newalias_dir.'"
Type: item; Caption: "Edit alias"; Glyph: 6; Action: multi; Actions: edit_'.ereg_replace(' ','_',$newalias_dir).'
Type: item; Caption: "Edit .htaccess"; Glyph: 6; Action: run; FileName: "notepad.exe"; parameters: "'.$newalias_dest.'.htaccess"
Type: item; Caption: "Delete alias"; Glyph: 6; Action: multi; Actions: delete_'.ereg_replace(' ','_',$newalias_dir).'
;end_'.ereg_replace(' ','_',$newalias_dir).'_menu
;add_menu_alias';

    $mywampini = ereg_replace(';add_menu_alias',$myreplacemenu,$mywampini);
    $mypattern = ';add_delete_alias';
    $mydeletemenu = ';start_'.ereg_replace(' ','_',$newalias_dir).'_delete
[delete_'.ereg_replace(' ','_',$newalias_dir).']
Action: run; FileName: "c:/wamp/php/php.exe";Parameters: "-c . ../scripts/delete_alias.php '.ereg_replace(' ','-whitespace-',$newalias_dir).'";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;
[edit_'.ereg_replace(' ','_',$newalias_dir).']
Action: run; FileName: "notepad.exe"; parameters:"'.$conffile_dir.$newalias_dir.'.conf"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;

;end_'.ereg_replace(' ','_',$newalias_dir).'_delete
'.$mypattern;

    $mywampini = ereg_replace($mypattern,$mydeletemenu,$mywampini);

}
@file_put_contents($wampserverini_file,$mywampini) or die ("wampmanager.ini file not found");




?>
