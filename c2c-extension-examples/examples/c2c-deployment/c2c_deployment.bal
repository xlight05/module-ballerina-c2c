import ballerina/http;
import ballerina/log;
import ballerina/c2c as _;

// Note that the code below is completely focused on the business logic and it does not specify anything related to operations.
listener http:Listener helloEP = new(9090);

@http:ServiceConfig {
    basePath: "/helloWorld"
}
service http:Service /helloWorld on helloWorldEP {
    resource function get sayHello(http:Caller caller) {
        var responseResult = caller->ok("Hello, World from service helloWorld ! \n");
        if (responseResult is error) {
            log:printError("error responding back to client.", err = responseResult);
        }
    }
}