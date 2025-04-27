import java.rmi.*;

public class Server {

    public static void main(String[] args) {

        try {
            ServerImpl serverimpl = new ServerImpl();
            Naming.rebind("Server", serverimpl);
            System.out.println(" server started !");

        } catch (Exception e) {
            System.out.println("Eception Occurred at server!" + e.getMessage());
        }
    }

}
