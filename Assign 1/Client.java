import java.rmi.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String url = "rmi://localhost/Server";

            ServerIntf serverIntf = (ServerIntf) Naming.lookup(url);

            System.out.println("Enter num1 ");
            int a = sc.nextInt();

            System.out.println("Enter num2 ");
            int b = sc.nextInt();

            System.out.println("Addition is " + serverIntf.addition(a, b));

            System.out.println("substraction is " + serverIntf.substraction(a, b));

            System.out.println("multiplication is " + serverIntf.multiplication(a, b));

            System.out.println("division is " + serverIntf.division(a, b));

        } catch (Exception e) {
            System.out.println("Exception at Client " + e);
        }
        sc.close();
    }
}
