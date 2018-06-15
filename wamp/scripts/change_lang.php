<?php

$wampserverini_file = '../wampmanager.ini';
$templateFile = '../wampmanager.tpl';
$wampserverIniFile = '../wampmanager.ini';
$configurationFile = '../wampmanager.conf';
$langDir = '../lang/';
$modulesDir = 'modules/';
$defaultLang = 'english';

$mywampini = @file_get_contents($wampserverini_file) or die ("wampmanager.ini file not found");

if (ereg('images_on.bmp',$mywampini))
    $switch_online = TRUE;


if (isset($_SERVER['argv'][1]))
{
    $lang = $_SERVER['argv'][1];
}
else 
{
    $lang = $defaultLang;
}


if (is_file($langDir.$lang.'.lang'))
    {
        require($langDir.$lang.'.lang');
    }
else
    {
        require($langDir.$defaultLang.'lang');
    }



//include default lang files
if ($handle = opendir($langDir.$modulesDir)) 
{
    
   while (false !== ($file = readdir($handle))) 
   {
    if ($file != "." && $file != ".." && preg_match('|_'.$defaultLang.'|',$file)) 
       {
           include($langDir.$modulesDir.$file);
       }
   }
   closedir($handle);
}

//include language specific lang files
if ($handle = opendir($langDir.$modulesDir)) 
{
    
   while (false !== ($file = readdir($handle))) 
   {
       if ($file != "." && $file != ".." && preg_match('|_'.$lang.'|',$file)) 
       {
           include($langDir.$modulesDir.$file);
       }
   }
   closedir($handle);
}

require($templateFile);

if ($switch_online === TRUE)
{
    $tpl = ereg_replace('images_off.bmp', 'images_on.bmp',$tpl);
    $tpl = ereg_replace($w_serverOffline, $w_serverOnline,$tpl);
    $tpl = ereg_replace('onlineoffline.php on', 'onlineoffline.php off', $tpl);
    $tpl = ereg_replace($w_putOnline,$w_putOffline,$tpl);
}

$confFile = @file_get_contents($configurationFile);
$confFile = preg_replace('|lang = .*|','lang = '.$lang.'.lang',$confFile);
    {
        $fp = fopen($configurationFile,'w');
        fwrite($fp,$confFile);
        fclose($fp);
    }

$fp = fopen($wampserverIniFile,'w');
fwrite($fp,$tpl);
fclose($fp);

?>