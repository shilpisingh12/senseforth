<?php

//v1.0 by Romain Bourdon


$conffile_dir = 'c:/wamp/apache2/conf/alias/';
$wampserverini_file = '../wampmanager.ini';
$httpdconf_file = '../apache2/conf/httpd.conf';
echo '





























Do you really wanty to delete this alias?
Type \'yes\' to confirm : ';
$confirm =    trim(fgets(STDIN));
$confirm =    trim($confirm ,'\'');

if ($confirm == 'yes')
{
    $mywampini = @file($wampserverini_file);
    $i = 0;
    
    $ligne_menu = 'Type: submenu; Caption: "http://localhost/'.ereg_replace('-whitespace-',' ',$_SERVER['argv'][1]).'/"; SubMenu: alias_'.ereg_replace('-whitespace-',' ',$_SERVER['argv'][1]).'; Glyph: 3
';
    
    while (isset($mywampini[$i]))
    {
        
        if ($mywampini[$i] != $ligne_menu)
        {
            if ($mywampini[$i] == ';start_'.ereg_replace('-whitespace-',' ',$_SERVER['argv'][1]).'_menu
')
            {
                while ($mywampini[$i] != ';end_'.ereg_replace('-whitespace-',' ',$_SERVER['argv'][1]).'_menu
')
                {
                    $i++;
                }
            }
            elseif ($mywampini[$i] == ';start_'.ereg_replace('-whitespace-',' ',$_SERVER['argv'][1]).'_delete
')
            {
                while ($mywampini[$i] != ';end_'.ereg_replace('-whitespace-',' ',$_SERVER['argv'][1]).'_delete
')
                {
                    $i++;
                }
            }
            else
            {
                $mynewampini .= $mywampini[$i];
            }
        }
        $i++;
    }
    file_put_contents($wampserverini_file,$mynewampini);
    unlink ($conffile_dir.ereg_replace('-whitespace-',' ',$_SERVER['argv'][1]).'.conf');
    $myhttpd = file_get_contents($httpdconf_file);    
    $httpdline = '
Include "c:/wamp/apache2/conf/alias/'.ereg_replace('-whitespace-',' ',$_SERVER['argv'][1]).'.conf"';
    $myhttpd = ereg_replace ($httpdline,'',$myhttpd);
    file_put_contents($httpdconf_file,$myhttpd);
    echo '
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
Alias deleted. Press Enter to exit...';
    trim(fgets(STDIN));
    exit();
}
else
{
    echo'
Alias not deleted. Press Enter to exit...';
    trim(fgets(STDIN));
    exit();
}

?>
