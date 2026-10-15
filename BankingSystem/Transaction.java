
import java.util.Scanner;
public class Transaction {
  static  Scanner sc=new Scanner(System.in);
   Account acc;
  
//Deposite Amount 
  void deposite(){
   System.out.print("Enter amount to deposite:");
   double amt=sc.nextDouble();

      acc.balance+=amt;

 } 

 //Withdraw Amount
  void withdraw(){
   System.out.print("Enter amount to withdraw:");
  double amt=sc.nextDouble();
    if(amt<acc.balance)
      acc.balance-=amt;
   else 
      System.out.println("Unsufficient Balance");

 } 

 void totalBalance(){
   System.out.println("Account Number"+acc.accountNumber);
   System.out.println("Name:"+acc.name);
   System.out.println("Balance:"+acc.balance);
   System.out.println("__________________________________\n"); 

 }

 static void exit(){
   System.out.println("");
 }


Transaction(Account acc){
    this.acc = acc;
   int option;
 
     
   System.out.println("--------------MENU CONTROL---------------------");
   do{
   System.out.println("1.Deposit");
   System.out.println("2.Withdraw");
   System.out.println("3.Check Balance");
   System.out.println("4.Exit \n");
   System.out.print(" Enter your option:");
   option=sc.nextInt();

    switch(option){
             case 1:deposite();
                   break;
             case 2:withdraw();
                   break;
             case 3:totalBalance();
                   break; 
            case 4:exit();
                   break ;
            default:
               System.out.println("Invalid option");                   
        }
   }while(option!=4);

}
}  

