package proxyDesignPatternRMI.javaRMI;

import java.rmi.Remote;

public interface MyRemote extends Remote {
    public String sayHello() throws java.rmi.RemoteException;
}
