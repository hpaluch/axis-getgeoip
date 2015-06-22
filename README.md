Axis2 with WSDL2Code SOAP client demo
=====================================

Hello here is demo project that calls public Web Service
http://www.webservicex.net/WS/WSDetails.aspx?WSID=64&CATID=12
Using Axis2 and its WSDL2Code generator.

Requirements
------------
* JDK 1.7+ (tested on jdk1.7.0_79)
* Apache Maven 3.x (tested on 3.2.5)

Run
---
Just type:

	mvn test
	
You should get output like:

	For IP 8.8.8.8 got USA - United States
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
	
See src/test/java/com/github/hpaluch/axisgeoip/test/TestGeoipWS.java
for most important code of this sample.		

