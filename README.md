# GradleTemplate #
Current Gradle Version: 'com.android.tools.build:gradle:0.12.2'


## Overview ##
The goal of this template is to simplify gradle build configuration for Android Studio projects.  The template emphasizes configuration for testing libraries to make TDD fun and painless.

###Current Features###
Configuration for [Robolectric](https://github.com/robolectric/robolectric)

* Setup for Robolectric is located in the scripts folder, and can be updated for the needed Robolectric version
* The default Robolectric version supported is 2.3
* Robolectric tests are run from the command line with <code>./gradlew test</code>
* Results of Robolectric testing will appear in the following directory: app/build/test-report/debug/index.htm


Configuration for [Robotium](https://code.google.com/p/robotium/)

* The default Robotium version supported is 5.2
* Robotium tests are run from the commandl line with <code>./gradlew connectedAndroidTest</code>
* Results of Robotium testing will appear in the following directory: app/build/test-report/debug/index.html

Configuration for Jacoco code coverage testing

* Setup for Jacoco can be found in the scripts folder
* Jacoco test coverage can be run with <code>./gradlew jacocoTestReport</code>
* Results of jacoco code coverage testing: app/build/test-report/jacocoTestReport/html/index.html
