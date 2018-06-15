<?php

//v1.0 by Romain Bourdon

$phpinifile = "../apache2/bin/php.ini";


$confFile = @file_get_contents('../wampmanager.conf');
$confFile = preg_match('|lang = (.*)|',$confFile,$result);
@include('../lang/'.$result[1]);

$php_params = array (
                        'ze1 compatibility mode'=>'zend.ze1_compatibility_mode',
                        'short open tag' => 'short_open_tag',
                        'asp tags' => 'asp_tags',
                        'y2k compliance'=>'y2k_compliance',
                        'output buffering'=>'output_buffering',
                        'zlib output compression'=>'zlib.output_compression',
                        'implicit flush'=>'implicit_flush',
                        'allowc call time pass reference'=>'allow_call_time_pass_reference',
                        'safe mode'=>'safe_mode',
                        'expose PHP'=>'expose_php',
                        'display errors'=>'display_errors',
                        'display startup errors'=>'display_startup_errors',
                        'log errors' => 'log_errors',
                        'ignore repeated errors'=>'ignore_repeated_errors',
                        'ignore repeated source'=>'ignore_repeated_source',
                        'report memleaks'=>'report_memleaks',
                        'track errors'=>'track_errors',
                        'register globals'=>'register_globals',
                        'register long arrays'=>'register_long_arrays',
                        'register argc argv'=>'register_argc_argv',
                        'magic quotes gpc'=>'magic_quotes_gpc',
                        'magic quotes runtime'=>'magic_quotes_runtime',
                        'magic quotes sybase'=>'magic_quotes_sybase',
                        'enable dl'=>'enable_dl',
                        'file uploads'=>'file_uploads',
                        'allow url fopen'=>'allow_url_fopen');


$myphpini = @file_get_contents($phpinifile) or die ("php.ini file not found");

foreach($php_params as $next_param_name=>$next_param_text)
{
    if (preg_match('|'.$next_param_text.' = [Oo]n|',$myphpini))
    {
        $params_for_wampini[$next_param_name] = '1';
    }
    elseif (preg_match('|'.$next_param_text.' = [Oo]ff|',$myphpini))
    {   
        $params_for_wampini[$next_param_name] = '0';
    }
}

$mywampini = @file("../wampmanager.ini");
$mywampfp = fopen("../wampmanager.ini","w");
$i = 0;
while ($mywampini[$i] != ";start_php_params
")
{
    fwrite($mywampfp,$mywampini[$i]);   
    $i++;
    
}
fwrite($mywampfp,$mywampini[$i]); 
foreach ($params_for_wampini as $paramname=>$paramstatus)
{
    if ($params_for_wampini[$paramname] == 1)
        fwrite ($mywampfp,'Type: item; Caption: "'.$paramname.'"; Glyph: 13; Action: multi; Actions: '.$php_params[$paramname].'
');
    else
        fwrite ($mywampfp,'Type: item; Caption: "'.$paramname.'"; Action: multi; Actions: '.$php_params[$paramname].'
');

}

fwrite ($mywampfp,'Type: separator
Type: submenu; Caption: "'.$w_phpExtensions.'"; SubMenu: php_ext;  Glyph: 3
');

foreach ($params_for_wampini as $paramname=>$paramstatus)
{
    if ($params_for_wampini[$paramname] == 1)
    fwrite ($mywampfp,'['.$php_params[$paramname].']
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/switch_parameter_off.php '.$php_params[$paramname].'";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/refresh_php_parameters.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;
');
    else
    fwrite ($mywampfp,'['.$php_params[$paramname].']
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/switch_parameter_on.php '.$php_params[$paramname].'";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/refresh_php_parameters.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;
');
    
}

while ($mywampini[$i] != ";end_php_params
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
