import 'tomcat_test.pp'

package { 'mysql-server':
  ensure => installed,
}

service { 'mysql':
        ensure => running,
        require => Package['mysql-server'],
}

exec {'Create db':
        command => "/usr/bin/mysql -e 'Create database test;'",
        require => Service['mysql'],
        }

exec {'Followup script':
        command => "/usr/bin/mysql test < backup.sql",
        require => Exec['Create db'],
        }