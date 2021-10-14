# svea-admin-client
Low level client for accessing SveaWebPay Administration Service API.

Generated with wsdl2java - Apache CXF 3.3.1

wsdl2java.sh -frontend jaxws21 -p org.notima.sveawebpayadmin -d src/main/java -b src/main/resources/bindings.xml -autoNameResolution -client src/main/resources/AdminService-190401.wsdl

See also src/main/resources/bindings.xml for additional comments and the build.xml for Ant.

When regenerating, make sure that the WSDL service in the WSDL points to a https location (not http).

See also http://stackoverflow.com/questions/23011547/webservice-client-generation-error-with-jdk8

The WSDL-itself is located on https://webpayadminservice.svea.com/AdminService.svc?wsdl
