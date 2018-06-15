<?php

//v1.0 by Romain Bourdon

$phpinifile = "../apache2/bin/php.ini";


$myphpini = @file($phpinifile) or die ("php.ini file not found");

foreach($myphpini as $line)
{
    if (preg_match('|^;extension=|',$line))
    {
        $ext_name=str_replace(';extension=','',$line);
        $ext_name=str_replace('.dll
','',$ext_name);
        $ext[$ext_name] = '0';
    }
    elseif (preg_match('|^extension=|',$line))
    {    
        $ext_name=str_replace('extension=','',$line);
        $ext_name=str_replace('.dll
','',$ext_name);
        $ext[$ext_name] = '1';
    }
}

$mywampini = @file("../wampmanager.ini");
$mywampfp = fopen("../wampmanager.ini","w");
$i = 0;
while ($mywampini[$i] != ";start_php_ext
")
{
    fwrite($mywampfp,$mywampini[$i]);   
    $i++;
    
}
fwrite($mywampfp,$mywampini[$i]); 
ksort($ext);
foreach ($ext as $extname=>$extstatus)
{
    if ($ext[$extname] == 1)
        fwrite ($mywampfp,'Type: item; Caption: "'.$extname.'"; Glyph: 13; Action: multi; Actions: php_ext_'.$extname.'
');
    else
        fwrite ($mywampfp,'Type: item; Caption: "'.$extname.'"; Action: multi; Actions: php_ext_'.$extname.'
');

}

foreach ($ext as $extname=>$extstatus)
{
    if ($ext[$extname] == 1)
    fwrite ($mywampfp,'[php_ext_'.$extname.']
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/switch_ext_off.php '.$extname.'";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/refresh_php_ext.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;
');
    else
    fwrite ($mywampfp,'[php_ext_'.$extname.']
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/switch_ext_on.php '.$extname.'";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/refresh_php_ext.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;
');
    
}

while ($mywampini[$i] != ";end_php_ext
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
