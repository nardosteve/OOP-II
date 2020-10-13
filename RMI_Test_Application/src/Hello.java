import java.rmi.Remote;
import java.rmi.RemoteException;

//Example of a remote Interface
//Hello interface extends to Remote
public interface Hello extends Remote {
    //Empty Method body
    void printMsg() throws RemoteException;
}
