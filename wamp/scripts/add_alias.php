<?php

//v1.0.1 by Romain Bourdon


$httpconf_file = '../apache2/conf/httpd.conf';
$wampserverini_file = '../wampmanager.ini';
$conffile_dir = 'c:/wamp/apache2/conf/alias/';

echo '

























Enter your alias.
For example, 

\'test\'

would create an alias for the url 

http://localhost/test/

: ';
$newalias_dir = trim(fgets(STDIN));
$newalias_dir = trim($newalias_dir,'/\'');


if (is_file($conffile_dir.$newalias_dir.'.conf'))
{
    echo '

Alias already exists. Press Enter to exit...';
    trim(fgets(STDIN));
    exit();
}


if ($newalias_dir == '')
{
    echo '

Alias not created. Press Enter to exit...';
    trim(fgets(STDIN));
    exit();
}

echo '


















Enter the destination of your alias.
For example, 

\'c:/test/\'

would make http://localhost/'.$newalias_dir.'/ point to 

c:/test/

: ';
$newalias_dest = trim(fgets(STDIN));
if ($newalias_dest[strlen($newalias_dest)-1] != '/')
    $newalias_dest .= '/';
if (!is_dir($newalias_dest))
{
    echo '
This directory doesn\'t exist.
';
    $newalias_dest = '';
}

if ($newalias_dest == '')
{
    echo '

Alias not created. Press Enter to exit...';
    trim(fgets(STDIN));
    exit();
}

$newconffile_contents = 'Alias /'.$newalias_dir.'/ "'.$newalias_dest.'" 

<Directory "'.$newalias_dest.'">
    Options Indexes FollowSymLinks MultiViews
    AllowOverride all
        Order allow,deny
    Allow from all
</Directory>';
@file_put_contents($conffile_dir.$newalias_dir.'.conf',$newconffile_contents) or die ("unable to create conf file");




$httpdconf_add = '
Include "'.$conffile_dir.$newalias_dir.'.conf"';
@file_put_contents($httpconf_file,$httpdconf_add,FILE_APPEND) or die ("http.conf file not found");


$mywampini = @file_get_contents($wampserverini_file) or die ("wampmanager.ini file not found");
$mypattern = ';add_alias';
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


@file_put_contents($wampserverini_file,$mywampini) or die ("wampmanager.ini file not found");



echo '
Alias created. Press Enter to exit...';
    trim(fgets(STDIN));
    exit();


?>