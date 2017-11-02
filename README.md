/************************************************************
History
************************************************************/


1) Download & Unzip: SoapExample.rar
2) Update files: pom.xml / .classpath / .project

3) Update spring / beans file
applicationContext.xml
CamelProcessor

4) Maven build
	1) pom file
	2) run mvn clean install
	
5) Configure Servlet Container (Troubleshoot)


/************************************************************
Tomcat
************************************************************/
http://localhost:8080/manager/html

/************************************************************
Maven
************************************************************/
mvn archetype:generate

// the same
mvn package
mvn install 

// Undo a commit and redo
$ git commit -m "mistake"  

$ git reset HEAD~   
<correct>
$ git commit -c ORIG_HEAD

/************************************************************
Reference
************************************************************/
* Troubleshoot : 
'''[ERROR] Failed to execute goal org.apache.maven.plugins:maven-war-plugin:2.2:war (default-war) 
on project java_first_jaxws: Error assembling WAR: webxml attribute is required (or pre-existing WEB-INF/web.xml if executing in update mode) -> [Help 1]'''
>> Need to create WEB-INF/web.xml

* Download : SoapExample.rar
https://www.codeproject.com/Articles/867391/JAX-WS-Using-Apache-CXF-to-Create-a-Bottom-Up-Web

* Maven CXF:
https://github.com/apache/cxf/tree/master/distribution/src/main/release/samples/java_first_jaxws

* Git: Stackoverflow
https://stackoverflow.com/questions/927358/how-to-undo-the-last-commits-in-git

* Maven Official
https://maven.apache.org/plugins/maven-compiler-plugin/

