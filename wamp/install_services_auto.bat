NET STOP wampapache
.\apache2\bin\httpd.exe -k uninstall -n wampapache
NET STOP wampmysqld 
.\mysql\bin\mysqld-nt.exe --remove wampmysqld
.\apache2\bin\httpd.exe -k install -n wampapache
.\mysql\bin\mysqld-nt.exe --install wampmysqld --defaults-file="c:\wamp\mysql\my.ini"
NET START wampapache
NET START wampmysqld