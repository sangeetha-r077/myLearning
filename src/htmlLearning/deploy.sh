#bin/bash
chmod 777 /tmp/${APPLICATION_NAME}.ear
sudo su - wlsadmin <<EOF
cp -f /tmp/${APPLICATION_NAME}.ear /opt/app/esb/oracle/Middleware/user_projects/domains/WLS_10/servers/AdminServer/upload/
cp -f /tmp/${APPLICATION_NAME}.ear /opt/app/esb/oracle/Middleware/user_projects/domains/WLS_10/servers/AdminServer/upload/${APPLICATION_NAME}/app/
sh -x /appl/esb/apps/Common/${APPLICATION_NAME}/bin/DeploymentScript.sh
EOF
rm -rf /tmp/${APPLICATION_NAME}.ear
-----

#bin/bash
chmod 777 /tmp/${APPLICATION_NAME}.ear
sudo su - avwlsadm <<EOF
cp -f /tmp/${APPLICATION_NAME}.ear /opt/app/esb/oracle/Middleware/user_projects/domains/WLS_10/servers/AdminServer/upload/
sh -x /appl/esb/apps/Common/${APPLICATION_NAME}/bin/DeploymentScript.sh
EOF
rm -rf /tmp/${APPLICATION_NAME}.ear