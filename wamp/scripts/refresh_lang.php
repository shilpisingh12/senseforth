<?php

//v1.0 by Romain Bourdon


$langDir = '../lang/';
$wampConfFile = '../wampmanager.conf';

$wampConf = @file_get_contents($wampConfFile);
preg_match('|lang = (.*)|',$wampConf,$actualLang);
if ($handle = opendir($langDir)) 
{
    
   while (false !== ($file = readdir($handle))) 
   {
       if ($file != "." && $file != ".." && preg_match('|\.lang|',$file)) 
       {
           if ($file == $actualLang[1])
           {
                $lang[$file] = 1;
           }
           else
           {
                $lang[$file] = 0;
           }
       }
   }
   closedir($handle);
}


$mywampini = @file("../wampmanager.ini");
$mywampfp = fopen("../wampmanager.ini","w");
$i = 0;
while (isset($mywampini[$i]) &&  $mywampini[$i]!= ";start_language
")
{
    fwrite($mywampfp,$mywampini[$i]);   
    $i++;
    
}


fwrite($mywampfp,$mywampini[$i]); 
ksort($lang);
foreach ($lang as $langname=>$langstatus)
{
    $cleanLangName = str_replace('.lang','',$langname);
    if ($lang[$langname] == 1)
        fwrite ($mywampfp,'Type: item; Caption: "'.$cleanLangName.'"; Glyph: 13; Action: multi; Actions: lang_'.$cleanLangName.'
');
    else
        fwrite ($mywampfp,'Type: item; Caption: "'.$cleanLangName.'"; Action: multi; Actions: lang_'.$cleanLangName.'
');

}

foreach ($lang as $langname=>$langstatus)
{
    $cleanLangName = str_replace('.lang','',$langname);
    fwrite ($mywampfp,'[lang_'.$cleanLangName.']
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/change_lang.php '.$cleanLangName.'";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/refresh_php_ext.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/refresh_php_parameters.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/refresh_apache_mod.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/refresh_alias.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/refresh_lang.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: readconfig;

');
    
}

while ($mywampini[$i] != ";end_language
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
