package{'tomcat7':
ensure=>installed,
}

service{'tomcat':
        ensure=>running,
        require=>Package['tomcat7'],
        }

file {'/var/lib/tomcat7/webapps/EmployeeApplication.war':
        source=>"/tmp/mywar/EmployeeApplication.war",
}