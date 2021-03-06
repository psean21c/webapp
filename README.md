/************************************************************
History
************************************************************/

>> Jan-04
Tested JavaConfi

>> Next
<component-scan> 
@Conditional


1) Download & Unzip: SoapExample.rar
2) Update files: pom.xml / .classpath / .project

3) Update spring / beans file
applicationContext.xml
CamelProcessor

4) Maven build
	1) pom file
	2) run mvn clean install
	
5) Configure Servlet Container (Troubleshoot)

>> Dec-07
- Added Spring project
- Added jar file to eclipse library
 : javax.servlet-api.jar / servlet-api.jar (in the Tomcat lib)

>> Target
Integrate JAVA to JSP
Read configuration from configuration file


/************************************************************
Tomcat
************************************************************/
1) Run
$cd C:\dev\apache-tomcat-7.0.82\bin
$startup.bat

2) Deploy folder
$cd C:\dev\apache-tomcat-7.0.82\webapps
- Copy the war file to the folder - webapps

3) Manage Page
http://localhost:8080/manager/html
tomcat/s3cret

4) Landing Page
http://localhost:8080/zafinWS/

/************************************************************
Maven
************************************************************/
mvn archetype:generate

// the same
mvn package
mvn install 

// adding antrun
mvn antrun:run@zafin-deploy


/************************************************************
JAR library
************************************************************/
>> Added jar to SOAP_LIB in eclipse
camel-core-2.12.0.jar
camel-cxf-2.12.0.jar
cxf-tools-common-3.1.5.jar
javax.servlet-api-3.1.0
org.eclipse.jetty.server.jar

/************************************************************
Reference
************************************************************/
* Troubleshoot : 
'''[ERROR] Failed to execute goal org.apache.maven.plugins:maven-war-plugin:2.2:war (default-war) 
on project java_first_jaxws: Error assembling WAR: webxml attribute is required (or pre-existing WEB-INF/web.xml if executing in update mode) -> [Help 1]'''
>> Need to create WEB-INF/web.xml

* Download : 
1) SoapExample.rar
https://www.codeproject.com/Articles/867391/JAX-WS-Using-Apache-CXF-to-Create-a-Bottom-Up-Web
2) Useful for structure [ main/java ] 
https://github.com/smirzai/webServiceMockDemo/tree/master/webServiceMockDemo

* Maven CXF:
https://github.com/apache/cxf/tree/master/distribution/src/main/release/samples/java_first_jaxws

* Git: Stackoverflow
https://stackoverflow.com/questions/927358/how-to-undo-the-last-commits-in-git

* Maven Official
https://maven.apache.org/plugins/maven-compiler-plugin/

* JSP (TutorialPoint)
https://www.tutorialspoint.com/jsp/jsp_environment_setup.htm

* Spring (TutorialPoint)
https://www.tutorialspoint.com/spring/spring_hello_world_example.htm

* Java + JSP
http://o7planning.org/en/10263/java-jsp-tutorial#a38401

* JDBC + JSP
http://scis.athabascau.ca/html/server/jspdemo.htm

* REST ful
https://www.journaldev.com/2552/spring-rest-example-tutorial-spring-restful-web-services
http://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration


