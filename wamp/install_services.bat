.\apache2\bin\httpd.exe -k install -n wampapache
reg add HKLM\SYSTEM\CurrentControlSet\Services\wampapache /V Start /t REG_DWORD /d 3 /f
.\mysql\bin\mysqld-nt.exe --install-manual wampmysqld --defaults-file="c:\wamp\mysql\my.ini"