package proxyDesignPatternRMI.javaRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    // to handle super class exception
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            java.rmi.Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
