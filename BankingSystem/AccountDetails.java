import java.util.Scanner;
public class AccountDetails {
  static  Scanner sc=new Scanner(System.in);
    Account acc;
  AccountDetails(Account acc){
    this.acc=acc;
   System.out.println("__________________________________"); 
   System.out.println("Account Number"+acc.accountNumber);
   System.out.println("Name:"+acc.name);
   System.out.println("Balance:"+acc.balance );
   System.out.println("__________________________________\n"); 

  }

}
