
class LiquibaseGrailsPlugin {
	def version = '1.9.3.7'
	def dependsOn = [dataSource:"* > 1.0"]
	def grailsVersion = '1.0 > *'

	def author = "Nathan Voxland"
    	def authorEmail = "nathan@voxland.net"
    	def title = "LiquiBase Database Refactoring for Grails"
    	def description = '''\
Integrates LiquiBase into Grails.  LiquiBase is a database change tracking tool similar to ActiveRecord:Migration.
Major functionality includes:
- 34 Refactorings
- Extensibility to create custom refactorings
- update database to current version
- rollback last X changes to database
- rollback database changes to particular date/time
- rollback database to "tag"
- Stand-alone IDE and Eclipse plug-in
- "Contexts" for including/excluding change sets to execute
- Database diff report
- Database diff changelog generation
- Ability to create changelog to generate an existing database
- Database change documentation generation
- Ability to save SQL to be applied for approval by a DBA
- DBMS Check, user check, and SQL check preconditions
- Can split change log into multiple files for easier management
- Support for 10 database systems
'''
    def documentation = 'http://www.liquibase.org/manual/grails'
}
