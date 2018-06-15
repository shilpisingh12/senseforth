<?php

//v1.0 by Romain Bourdon

$httpdfile = "../apache2/conf/httpd.conf";


$myhttpd = @file($httpdfile) or die ("httpd.conf file not found");

foreach($myhttpd as $line)
{
    if (preg_match('|^#LoadModule|',$line))
    {
        $mod_table = explode(' ', $line);
        $mod_name = $mod_table[1];
        $mod[$mod_name] = '0';
    }
    elseif (preg_match('|^LoadModule|',$line))
    {    
        $mod_table = explode(' ', $line);
        $mod_name = $mod_table[1];
        $mod[$mod_name] = '1';
    }
}

$mywampini = @file("../wampmanager.ini");
$mywampfp = fopen("../wampmanager.ini","w");
$i = 0;
while ($mywampini[$i] != ";start_apache_mod
")
{
    fwrite($mywampfp,$mywampini[$i]);   
    $i++;
    
}
fwrite($mywampfp,$mywampini[$i]); 
ksort($ext);
foreach ($mod as $modname=>$modstatus)
{
    if ($mod[$modname] == 1)
        fwrite ($mywampfp,'Type: item; Caption: "'.$modname.'"; Glyph: 13; Action: multi; Actions: apache_mod_'.$modname.'
');
    else
        fwrite ($mywampfp,'Type: item; Caption: "'.$modname.'"; Action: multi; Actions: apache_mod_'.$modname.'
');

}

foreach ($mod as $modname=>$modstatus)
{
    if ($mod[$modname] == 1)
    fwrite ($mywampfp,'[apache_mod_'.$modname.']
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/switch_apache_mod_off.php '.$modname.'";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/refresh_apache_mod.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;
');
    else
    fwrite ($mywampfp,'[apache_mod_'.$modname.']
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/switch_apache_mod_on.php '.$modname.'";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/refresh_apache_mod.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;
');
    
}

while ($mywampini[$i] != ";end_apache_mod
")
{
    $i++;
}

while ($mywampini[$i] != '')
{
    fwrite($mywampfp,$mywampini[$i]);
    $i++;
}


?>
