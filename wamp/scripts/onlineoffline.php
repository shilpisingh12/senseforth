<?php

//v1.1 by Romain Bourdon

$confFile = @file_get_contents('../wampmanager.conf');
$confFile = preg_match('|lang = (.*)|',$confFile,$result);
@include('../lang/'.$result[1]);



$httpdfile = "../apache2/conf/httpd.conf";
$wampinifile = "../wampmanager.ini";

$online_txt = "#   onlineoffline tag - don't remove
    Order Allow,Deny
    Allow from all";
    
$offline_txt = "#   onlineoffline tag - don't remove
    Order Deny,Allow
    Deny from all
    Allow from 127.0.0.1"; 




$myhttpd = @file_get_contents($httpdfile) or die ("httpd.conf file not found");

if ($_SERVER['argv'][1] == 'off')
{
    $myhttpd = ereg_replace($online_txt,$offline_txt,$myhttpd);
    $fphttpd = fopen($httpdfile,"w");
    fwrite($fphttpd,$myhttpd);
    fclose($fphttpd);
    $mywampini = @file_get_contents($wampinifile) or die ("wampmanager.ini file not found");
    $mywampini = ereg_replace('onlineoffline.php off','onlineoffline.php on',$mywampini);
    $mywampini = ereg_replace('images_on.bmp','images_off.bmp',$mywampini);
    if (isset($w_putOffline))
    {
        $mywampini = ereg_replace($w_putOffline,$w_putOnline,$mywampini);
        $mywampini = ereg_replace($w_serverOnline,$w_serverOffline,$mywampini);
    }
    $fpwampini = fopen($wampinifile,"w");
    fwrite($fpwampini,$mywampini);
    fclose($fpwampini);
}

if ($_SERVER['argv'][1] == 'on')
{
    $myhttpd = ereg_replace($offline_txt,$online_txt,$myhttpd);
    $fphttpd = fopen($httpdfile,"w");
    fwrite($fphttpd,$myhttpd);
    fclose($fphttpd);
    $mywampini = @file_get_contents($wampinifile) or die ("wampmanager.ini file not found");
    $mywampini = ereg_replace('onlineoffline.php on','onlineoffline.php off',$mywampini);
    $mywampini = ereg_replace('images_off.bmp','images_on.bmp',$mywampini);
    if (isset($w_putOffline))
    {
        $mywampini = ereg_replace($w_putOnline,$w_putOffline,$mywampini);
        $mywampini = ereg_replace($w_serverOffline,$w_serverOnline,$mywampini);
    }
    $fpwampini = fopen($wampinifile,"w");
    fwrite($fpwampini,$mywampini);
    fclose($fpwampini);
}


?>