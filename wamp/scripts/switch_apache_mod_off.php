<?php

//v1.0 by Romain Bourdon


$httpdfile = "../apache2/conf/httpd.conf";

$myhttpd = @file_get_contents($httpdfile) or die ("httpd.conf file not found");


$myhttpd = ereg_replace('LoadModule '.$_SERVER['argv'][1],'#LoadModule '.$_SERVER['argv'][1],$myhttpd);


$fphttpd = fopen($httpdfile,"w");
fwrite($fphttpd,$myhttpd);
fclose($fphttpd);


?>