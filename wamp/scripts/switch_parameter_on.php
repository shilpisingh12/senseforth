<?php

//v1.0 by Romain Bourdon


$phpinifile = "../apache2/bin/php.ini";

$myphpini = @file_get_contents($phpinifile) or die ("php.ini file not found");


$myphpini = eregi_replace($_SERVER['argv'][1].' = Off',$_SERVER['argv'][1].' = On',$myphpini);

$fpphpini = fopen($phpinifile,"w");
fwrite($fpphpini,$myphpini);
fclose($fpphpini);


?>