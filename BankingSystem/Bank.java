import java.util.Scanner;
public class Bank {
    Scanner sc=new Scanner(System.in);
   Account acc;
    
   //Display bank information
   static void display(){
    System.out.println("=======================================");
    System.out.println("             BANK INFORMATION          ");
    System.out.println("=======================================");
    System.out.println("Bank Name     : Java BAnk");
    System.out.println("Bank Type     : Digital Banking System");
    System.out.println("Location      : Belgaum");
    System.out.println("Services      : Account Management\n Deposit\n Withdrawal\n Balance Inquiry");
    System.out.println("Project Type  : Console-Based Application");
    System.out.println("Technology    : JAVA");
    System.out.println("=======================================\n");
   }

   //Display total number of accounts
   void accNumbers(int n){
    if(n==0)
        System.out.println("Accounts are not created ");
    else
    System.out.print("Total Number Of Account in Our Bank:"+ n);
    System.out.println();
   
   }

   //Search an account by account number
   void search(){
      System.out.print("Enter the account number to be searched:");
      int account=sc.nextInt();
      if(acc.accountNumber==account){
        System.out.println("Account number found");
        System.out.println("Account Number: "+acc.accountNumber);
        System.out.println("Name: "+acc.name);
        System.out.println("Balance"+acc.balance);
      }else
            System.out.println("Sorry.. Account not found");
   };



   Bank(Account acc){
    this.acc=acc;
    int bankoption;
     System.out.println("--------------BANK MENU CONTROL---------------------");
   do{
   System.out.println("1.Display bank information");
   System.out.println("2.Display total number of accounts");
   System.out.println("3.Search an account by account number");
   System.out.println("4.Exit \n");
   System.out.print(" Enter your Bank option:");
    bankoption=sc.nextInt();

    switch(bankoption){
             case 1:display();
                   break;
             case 2:accNumbers(acc.noOfacc);
                   break;
             case 3:search();
                   break; 
            case 4:;
                   break ;
            default:
               System.out.println("Invalid option");                   
        }
   }while(bankoption!=4);


   }

}
