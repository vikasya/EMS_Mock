#class { '::mysql::server':
#   override_options => { 'mysqld' => { 'max_connections' => '1024' } }
#}

#exec{'Followup scripts':
#        command=>"/usr/bin/mysql < /tmp/mywar/Dump_test.sql",
#}

package{'tomcat7':
        ensure=>installed,
        before=>Service['tomcat7'],
}


service{'tomcat7':
        ensure=>running,
        require=>Package['tomcat7'],
        }

file {'/var/lib/tomcat7/webapps/EmployeeApplication.war':
        source=>"/tmp/mywar/EmployeeApplication.war",
        require=>Service['tomcat7'],
}

