NET STOP wampapache
.\apache\apache.exe -u -n "wampapache"
.\apache\bin\apache.exe -k uninstall -n wampapache
.\apache2\bin\apache.exe -k uninstall -n wampapache
.\apache2\bin\httpd.exe -k uninstall -n wampapache
NET STOP wampmysqld 
.\mysql\bin\mysqld-nt.exe --remove wampmysqld
wampmanager.exe -quit -id={wampserver}