<?php

//v1.0 by Romain Bourdon

$phpinifile = "../apache2/bin/php.ini";

echo 'Please type the name of the extension to add 
(ex: php_domxml.dll) : ';
$newext_name = trim(fgets(STDIN));


if (!is_file('ext/'.$newext_name))
{
    echo '

Sorry, extension not found in your ext/ directory. Press Enter to exit...';
    trim(fgets(STDIN));
    exit();
}



$myphpini = @file_get_contents($phpinifile) or die ("php.ini file not found non trouve");

if (eregi($newext_name,$myphpini))
{
    echo '

Extension already configured in your php.ini. Press Enter to exit...';
    trim(fgets(STDIN));
    exit();

}



$myphpini = ereg_replace('
;;;;;;;;;;;;;;;;;;;
; Module Settings ;
;;;;;;;;;;;;;;;;;;;','extension='.$newext_name.'

;;;;;;;;;;;;;;;;;;;
; Module Settings ;
;;;;;;;;;;;;;;;;;;;',$myphpini);


$fpphpini = fopen($phpinifile,"w");
fwrite($fpphpini,$myphpini);
fclose($fpphpini);

echo '

Extension added in your php.ini. Press Enter to exit...';
trim(fgets(STDIN));

?>