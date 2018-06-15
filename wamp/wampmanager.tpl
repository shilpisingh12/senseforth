<?php
$tpl = <<< EOTPL
[Config]
ImageList=images_off.bmp
ServiceCheckInterval=1
ServiceGlyphRunning=13
ServiceGlyphPaused=14
ServiceGlyphStopped=15
TrayIconAllRunning=16
TrayIconSomeRunning=17
TrayIconNoneRunning=18
ID={wampserver}
AboutHeader=WAMP5
AboutVersion=Version 1.7.0

[AboutText]
WAMP5 Version 1.7.0

Created by Romain Bourdon (romain@anaska.com)

Powered by Anaska http://www.anaska.com

Sources are available at SourceForge

http://www.wampserver.com

[Services]
Name: wampapache
Name: wampmysqld

[Messages]
AllRunningHint=WAMP5 - $w_allServicesRunning - $w_serverOffline
SomeRunningHint=WAMP5 - $w_oneServiceRunning - $w_serverOffline
NoneRunningHint=WAMP5 - $w_allServicesStopped - $w_serverOffline

[Menu.Right.Settings]
BarVisible=no
SeparatorsAlignment=center
SeparatorsFade=yes
SeparatorsFadeColor=clBtnShadow
SeparatorsFlatLines=yes
SeparatorsGradientEnd=clSilver
SeparatorsGradientStart=clGray
SeparatorsGradientStyle=horizontal
SeparatorsSeparatorStyle=shortline

[Menu.Left.Settings]
AutoLineReduction=no
BarVisible=yes
BarCaptionAlignment=bottom
BarCaptionCaption=WAMP5 1.7.0
BarCaptionDepth=1
BarCaptionDirection=downtoup
BarCaptionFont=Tahoma,16,clWhite,bold italic
BarCaptionHighlightColor=clNone
BarCaptionOffsetY=6
BarCaptionShadowColor=clNone
BarPictureHorzAlignment=center
BarPictureOffsetX=0
BarPictureOffsetY=0
BarPicturePicture=barimage.bmp
BarPictureTransparent=yes
BarPictureVertAlignment=bottom
BarBorder=clNone
BarGradientEnd=$00550000
BarGradientStart=clBlue
BarGradientStyle=horizontal
BarSide=left
BarSpace=0
BarWidth=32
SeparatorsAlignment=center
SeparatorsFade=yes
SeparatorsFadeColor=clBtnShadow
SeparatorsFlatLines=yes
SeparatorsFont=Arial,8,clWhite
SeparatorsGradientEnd=$00FFAA55
SeparatorsGradientStart=$00550000
SeparatorsGradientStyle=horizontal
SeparatorsSeparatorStyle=caption

[Menu.Right]
Type: item; Caption: "$w_about"; Action: about
;Type: item; Caption: "Reload Configur"; Action: readconfig
Type: item; Caption: "$w_helpFile"; Action: shellexecute; Filename: "c:/wamp/wamp5.chm";
Type: submenu; Caption: "$w_language"; SubMenu: language; Glyph: 3
Type: item; Caption: "$w_exit"; Action: multi; Actions: myexit;

[language]
Type: separator; Caption: "$w_language"
Type: item; Caption: "$w_refresh"; Action: multi; Actions: refresh_language;Glyph : 12
Type: separator
;start_language
;end_language

[refresh_language]
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/refresh_lang.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: readconfig;



[Menu.Left]
Type: separator; Caption: "WAMP5"
Type: item; Caption: "$w_localhost"; Action: run; FileName: "C:\Windows\explorer.exe"; Parameters: "http://localhost/"; Glyph: 5
Type: item; Caption: "$w_phpmyadmin"; Action: run; FileName: "C:\Windows\explorer.exe"; Parameters: "http://localhost/phpmyadmin/"; Glyph: 5
Type: item; Caption: "$w_sqlitemanager"; Action: run; FileName: "C:\Windows\explorer.exe"; Parameters: "http://localhost/sqlitemanager/"; Glyph: 5
Type: item; Caption: "$w_wwwDirectory"; Action: shellexecute; FileName: "c:/wamp/www"; Glyph: 2
Type: submenu; Caption: "$w_logFiles"; SubMenu: log_files; Glyph: 3
Type: submenu; Caption: "$w_configFiles"; SubMenu: conf_files; Glyph: 3
Type: submenu; Caption: "$w_apacheModules"; SubMenu: apache_mod; Glyph: 3
Type: submenu; Caption: "$w_phpSettings"; SubMenu: php_params;  Glyph: 3
Type: submenu; Caption: "$w_aliasDirectories"; SubMenu: alias_dir; Glyph: 3
;PHP4_switch_link
;webalizer_addon_link
Type: separator; Caption: "$w_services"
Type: servicesubmenu; Caption: "$w_apache"; Service: wampapache; SubMenu: apache
Type: servicesubmenu; Caption: "$w_mysql"; Service: wampmysqld; SubMenu: MySql
Type: item; Caption: "$w_startServices"; Action: multi; Actions: StartAll
Type: item; Caption: "$w_stopServices"; Action: multi; Actions: StopAll
Type: item; Caption: "$w_restartServices"; Action: multi; Actions: RestartAll
Type: item; Caption: "$w_putOnline"; Action: multi; Actions: onlineoffline



[log_files]
Type: separator; Caption: "$w_logFiles"
Type: item; Caption: "$w_apacheLog"; Glyph: 6; Action: run; FileName: "notepad.exe"; parameters:"c:/wamp/logs/apache_error.log"
Type: item; Caption: "$w_phpLog"; Glyph: 6; Action: run; FileName: "notepad.exe"; parameters: "c:/wamp/logs/php_error.log"
Type: item; Caption: "$w_mysqlLog"; Glyph: 6; Action: run; FileName: "notepad.exe"; parameters: "c:/wamp/logs/mysql_error.log"


[alias_dir]
Type: separator; Caption: "$w_aliasDirectories"
Type: item; Caption: "$w_adddAlias"; Action: multi; Actions: add_alias;Glyph : 8
Type: separator
;add_alias


;add_menu_alias


[php_params]
Type: separator; Caption: "$w_phpSettings"
Type: item; Caption: "$w_refresh"; Action: multi; Actions: refresh_php_params;Glyph : 12
Type: separator
;start_php_params
;end_php_params

[refresh_php_params]
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/refresh_php_parameters.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: resetservices
Action: readconfig;


[php_ext]
Type: separator; Caption: "$w_phpExtensions"
Type: item; Caption: "$w_refresh"; Action: multi; Actions: refresh_php_ext;Glyph : 12
Type: item; Caption: "$w_addExtension"; Action: multi; Actions: add_ext;Glyph : 8
Type: separator
;start_php_ext
;end_php_ext



;add_delete_alias



[add_alias]
Action: run; FileName: "c:/wamp/php/php.exe";Parameters: "-c . ../scripts/add_alias.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;

[refresh_php_ext]
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/refresh_php_ext.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: resetservices
Action: readconfig;


[add_ext]
Action: run; FileName: "c:/wamp/php/php.exe";Parameters: "-c . ../scripts/add_ext.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/refresh_php_ext.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;

;add_php4_switch

[conf_files]
Type: separator; Caption: "$w_configFiles"
Type: item; Caption: "httpd.conf"; Glyph: 6; Action: run; FileName: "notepad.exe"; parameters:"c:/wamp/apache2/conf/httpd.conf"
Type: item; Caption: "php.ini"; Glyph: 6; Action: run; FileName: "notepad.exe"; parameters: "c:/wamp/apache2/bin/php.ini"
Type: item; Caption: "my.ini"; Glyph: 6; Action: run; FileName: "notepad.exe"; parameters: "c:/wamp/mysql/my.ini"




[DoubleClickAction]
Action: about;

[apache]
Type: separator; Caption: "$w_apache"
Type: item; Caption: "$w_startResume"; Action: service; Service: wampapache; ServiceAction: startresume; Glyph: 9
;Type: item; Caption: "$w_pauseService"; Action: service; Service: wampapache; ServiceAction: pause; Glyph: 10
Type: item; Caption: "$w_stopService"; Action: service; Service: wampapache; ServiceAction: stop; Glyph: 11
Type: item; Caption: "$w_restartService"; Action: service; Service: wampapache; ServiceAction: restart; Glyph: 12
Type: separator
Type: item; Caption: "$w_testPort80"; Action: run; FileName: "c:/wamp/php/php.exe";Parameters: "-c . ../scripts/test_port.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated; Glyph: 9
Type: item; Caption: "$w_installService";  Action: multi; Actions: ApacheServiceInstall; Glyph: 8
Type: item; Caption: "$w_removeService"; Action: multi; Actions: ApacheServiceRemove; Glyph: 7



[MySql]
Type: separator; Caption: "$w_mysql"
Type: item; Caption: "$w_startResume"; Action: service; Service: wampmysqld; ServiceAction: startresume; Glyph: 9
;Type: item; Caption: "$w_pauseService"; Action: service; Service: mysql; ServiceAction: pause; Glyph: 10
Type: item; Caption: "$w_stopService"; Action: service; Service: wampmysqld; ServiceAction: stop; Glyph: 11
Type: item; Caption: "$w_restartService"; Action: service; Service: wampmysqld; ServiceAction: restart; Glyph: 12
Type: separator
Type: item; Caption: "$w_installService"; Action: multi; Actions: MySQLServiceInstall; Glyph: 8
Type: item; Caption: "$w_removeService"; Action: multi; Actions: MySQLServiceRemove; Glyph: 7
Type: separator
Type: item; Caption: "$w_mysqlConsole"; Action: run; FileName: "c:/wamp/mysql/bin/mysql.exe";Parameters: "-u root -p"; Glyph: 0
;mysql_admin


[StartAll]
Action: service; Service: wampapache; ServiceAction: startresume; Flags: ignoreerrors
Action: service; Service: wampmysqld; ServiceAction: startresume; Flags: ignoreerrors

[StopAll]
Action: service; Service: wampapache; ServiceAction: stop; Flags: ignoreerrors
Action: service; Service: wampmysqld; ServiceAction: stop; Flags: ignoreerrors


[RestartAll]
Action: service; Service: wampapache; ServiceAction: stop; Flags: ignoreerrors waituntilterminated
Action: service; Service: wampmysqld; ServiceAction: stop; Flags: ignoreerrors waituntilterminated
Action: service; Service: wampapache; ServiceAction: startresume; Flags: ignoreerrors waituntilterminated
Action: service; Service: wampmysqld; ServiceAction: startresume; Flags: ignoreerrors waituntilterminated


[myexit]
Action: service; Service: wampapache; ServiceAction: stop; Flags: ignoreerrors
Action: service; Service: wampmysqld; ServiceAction: stop; Flags: ignoreerrors
Action:  exit
[apache_mod]
Type: separator; Caption: "$w_apacheModules"
Type: item; Caption: "$w_refresh"; Action: multi; Actions: refresh_apache_mod;Glyph : 12
Type: separator
;start_apache_mod
;end_apache_mod

[refresh_apache_mod]
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "-c . ../scripts/refresh_apache_mod.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: resetservices
Action: readconfig;


[ApacheServiceInstall] ;1.6.2
Action: run; FileName: "c:/wamp/php/php.exe";Parameters: "-c . ../scripts/test_port_for_install.php";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: run;  FileName: "c:/wamp/Apache2/bin/httpd.exe"; Parameters: "-n wampapache -k install"; ShowCmd: hidden; Flags: waituntilterminated
Action: run; FileName: "reg"; Parameters: "add HKLM\SYSTEM\CurrentControlSet\Services\wampapache /V Start /t REG_DWORD /d 3 /f"; ShowCmd: hidden; Flags: waituntilterminated
Action: resetservices
Action: readconfig;


[ApacheServiceRemove]
Action: service; Service: wampapache; ServiceAction: stop; Flags: ignoreerrors waituntilterminated
Action: run; FileName: "c:/wamp/Apache2/bin/httpd.exe"; Parameters: "-n wampapache -k uninstall"; ShowCmd: hidden; Flags: waituntilterminated
Action: resetservices
Action: readconfig;

[MySQLServiceInstall]
Action: run; FileName: "c:/wamp/install_mysql_service.bat"; Parameters: ""; ShowCmd: hidden; Flags: waituntilterminated
Action: resetservices
Action: readconfig;



[MySQLServiceRemove]
Action: service; Service: wampmysqld; ServiceAction: stop; Flags: ignoreerrors waituntilterminated
Action: run; FileName: "c:/wamp/MySQL/bin/mysqld-nt.exe"; Parameters: "--remove wampmysqld"; ShowCmd: hidden; Flags: waituntilterminated
Action: resetservices
Action: readconfig;




[onlineoffline]
Action: run; FileName: "c:/wamp/php/php-win.exe";Parameters: "../scripts/onlineoffline.php on";WorkingDir: "c:/wamp/php"; Flags: waituntilterminated
Action: service; Service: wampapache; ServiceAction: restart;
Action: resetservices
Action: readconfig;

EOTPL;

?>