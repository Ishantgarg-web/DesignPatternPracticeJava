package proxyDesignPatternRMI.javaRMI;

/**
 * How to make the Remote service?
 * 1. Make a Remote interface, defines the method that a client can call remotely.
 * Both the Stub and actual service will implement this interface.
 * 2. Make a Remote implementation, that implements the Remote interface
 * and provides the actual implementation of the remote method.
 * 3. Start the RMI registry
 * 4. Start the remote service - You have to get the service object up and running.
 * Your service implementation class instantiated an instance of the service
 * and register it with the RMI registry,
 * so that clients can look it up and call its methods remotely.
 */
public class TestDrive {
}
