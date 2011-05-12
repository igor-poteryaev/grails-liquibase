The LiquiBase Grails plugin is designed to allow ActiveRecord::Migration-like functionality via the LiquiBase project.

The following commands are currently available:
changelog-sync
changelog-sync-sql
clear-checksums
db-diff
db-doc
drop-all
future-rollback-sql
generate-changelog
generate-changelog-sql
list-locks
migrate
migrate-sql
release-locks
rollback <tag>
rollback-count <num>
rollback-count-sql <num>
rollback-sql <tag>
rollback-to-date <datetime in iso 8601 format>
rollback-to-date-sql <datetime in iso 8601 format>
status
tag <tag>
validate-changelog

Set up your database using the standard grails-app/conf/DataSource.groovy file

Add your database changes to the grails-app/migrations/changelog.xml file

A starting changelog.xml is:

<?xml version="1.0" encoding="UTF-8"?>

<databaseChangeLog
        xmlns="http://www.liquibase.org/xml/ns/dbchangelog/1.9"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog/1.9 http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-1.9.xsd">

</databaseChangeLog>

For more information on the LiquiBase project, see http://www.liquibase.org