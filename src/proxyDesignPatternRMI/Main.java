package proxyDesignPatternRMI;

/**
 * problem statement:
 * Till now, Client is calling objects on local only, but if we need to call the methods on
 * Remote. In that case, we need to use RMI (Remote Method Invocation) which allows us
 * to call methods on remote objects as if they were local. However,
 * using RMI can be complex and requires a lot of boilerplate code to set up the
 * remote objects and handle the communication between the client and server.
 *
 * Note: It is something similiar to the REST and RPC.
 * In this, we will learn Java RMI, Proxy Design Pattern.
 *
 * Solution: How does RMI works?
 * We have four things -
 * 1. Client Object -> that is calling the method to get some data.
 * 2. Client Helper -> that is responsible for returning the response to the client object
 * and behaves as a proxy, its look like to client object -> that is calling some remote
 * methods to get data, but in reality, it is the calling the client helper to get the data.
 * 3. Server Helper: that is responsible for handling the request from the client helper
 * and calling the actual method.
 * 4. Server Object: that is responsible for implementing the actual method
 * and returning the response to the server helper.
 *
 * This all we can achieve by using RMI and Proxy Design Pattern.
 * How the method call works?
 * 1. Client Object calls doBigThing() on the Client Helper.
 * 2. Client helper packages up information about the call(arguments, method name, etc.)
 * and sends it over the network to the Server Helper.
 * 3. Service helper unpacks the information from the client helper, finds out
 * which method to call on the Service Object, and calls that real method.
 * 4. The method is invoked on Service object, which returns some result to service helper.
 * 5. Service helper packages up the result and sends it back over the network to the
 * Client Helper, which unpacks the result and returns it to the Client Object.
 *
 * Naming Convention in terms of RMI:
 * Client helper -> RMI Stub
 * Server helper -> RMI Skeleton
 */
public class Main {
}
