grails.project.work.dir = 'target'
grails.project.source.level = 1.6

grails.project.dependency.resolution = {
	
    inherits("global")
	
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsCentral()
        mavenLocal()
        mavenCentral()
		mavenRepo "https://repository.jboss.org/nexus/content/repositories/thirdparty-releases"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.5'
		compile 'opensaml:opensaml:1.1b', 'org.apache.santuario:xmlsec:1.5.2'
    }
	plugins {
		build ':release:2.0.3'
		compile ':spring-security-cas:1.0.5'
		
		runtime(":hibernate:$grailsVersion") {
			export = false
		}
	}
}
