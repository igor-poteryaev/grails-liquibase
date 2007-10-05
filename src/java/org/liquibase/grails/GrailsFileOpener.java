package org.liquibase.grails;

import liquibase.FileOpener;

import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class GrailsFileOpener implements FileOpener {
    public InputStream getResourceAsStream(String file) throws IOException {
        return getClass().getClassLoader().getResourceAsStream("grails-app/migrations/"+file);
    }

    public Enumeration<URL> getResources(String packageName) throws IOException {
        return getClass().getClassLoader().getResources("grails-app/migrations/"+packageName);
    }
}
