
import java.util.Scanner;
public class Account {
    Scanner sc=new Scanner(System.in);
        static int accountNumber=101;
        String name;
        double balance=0;
        int noOfacc=0;

    Account(){
        System.out.print("Enetr Name: ");
        name =sc.nextLine();
        System.out.print("Enter Initial deposite:");
        balance=sc.nextDouble();
        
        System.out.println("\n \n");

        System.out.println("Account created successfully!\n");
        System.out.print("Account Number:"+ accountNumber);
        System.out.print("\nName:"+name);
        System.out.print("\nInitial Deposite:"+balance);

        System.out.println("\n\n");
        noOfacc++;
    }
    
}
