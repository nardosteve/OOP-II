import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

//Developing RMI Server Program
public class Server extends ImplExample {
    public Server(){}

    //Main method
    public static void main(String[] args){
        try{
            // Instantiating the implementation class
            //Creating an instance of the class ImplExample
            ImplExample obj = new ImplExample();

            // Exporting the object of implementation class
            // (here we are exporting the remote object to the stub)
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Binding the remote object (stub) in the registry
            Registry registry = LocateRegistry.getRegistry();

            registry.bind("Hello", stub);
            System.err.println("Server ready");

        }catch(Exception e){
            System.err.println("Server expcetion : "+e.toString());
            e.printStackTrace();
        }
    }
}
