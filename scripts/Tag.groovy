includeTargets << new File("${liquibasePluginDir}/scripts/LiquibaseSetup.groovy")

task('default': '''Tags the current database state for future rollback.
Example: grails tag aTag
''') {
    depends(setup)

    try {
        if (args == null) {
            throw new RuntimeException("tag requires a tag arguement");
        }
        liquibase.tag(args);
    }
    catch (Exception e) {
        e.printStackTrace()
        event("StatusFinal", ["Failed to migrate database ${grailsEnv}"])
        exit(1)
    } finally {
        liquibase.getDatabase().getConnection().close();
    }
}
