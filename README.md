# App Engine Java Application

## Skeleton application for use with App Engine Java and Spring MVC.

[![Build Status](https://api.travis-ci.org/smulyono/gaeskeleton.png)](https://api.travis-ci.org/smulyono/gaeskeleton)


Requires [Apache Maven](http://maven.apache.org) 3.0 or greater, and JDK 6+ in order to run.

How to clone and create new project

    git clone git://github.com/smulyono/gaeskeleton.git <new_project_folder>
    cd <new_project_folder>

    # create new eclipse project (standard, but if error occured then use alternate)
    mvn eclipse:eclipse -Dwtpversion=2.0
    
    # create new eclipse project (alternate)
    mvn eclipse:eclipse
    Run eclipse -> Import folder as project
    mvn eclipse:clean
    Convert to maven project
    
    # additional configuration
    Right click into the project -> convert to Spring Project
                                 -> convert to Maven Project
                                 

To build, run

    mvn package

Building will run the tests, but to explicitly run tests you can use the test target

    mvn test

To start the app, use the [App Engine Maven Plugin](http://code.google.com/p/appengine-maven-plugin/) that is already included in this demo.  Just run the command.

    mvn appengine:devserver

For further information, consult the [Java App Engine](https://developers.google.com/appengine/docs/java/overview) documentation.

To see all the available goals for the App Engine plugin, run

    mvn help:describe -Dplugin=appengine

Appengine Version used is 1.7.6 because of problem in Mac OSx

	https://code.google.com/p/googleappengine/issues/detail?id=4712
	
All of other libraries included

	Spring 3.1.1.Release
	Jackson Mapper 1.9.12
	
All of other maven plugins included
	
	Jetty 
        Used with manual reloading
 

Copyright (C) 2010-2012 Google Inc.

Modified 6/1/2013 - Sanny M

