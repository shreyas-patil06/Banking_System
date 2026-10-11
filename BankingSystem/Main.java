import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
      int ch;
     do{
        System.out.println("1.Account");
        System.out.println("2.Bank");
        System.out.println("3.Account Details");
        System.out.println("4.Exit \n");
        System.out.print(" Enter your choice:");
        ch=sc.nextInt();
        
        switch(ch){
             case 1:Account account=new Account();
                   break;
             case 2:Bank bnak=new Bank();
                   break;
             case 3:AccountDetails accdetails=new AccountDetails();
                    break; 
             case 4: exit();
                   break;
             default :
                System.out.println("Invalid Choice");     
            }
   }while(ch!=4);

 }

 static void exit(){
        System.out.println("Exit Successfullys");
           

 }
}
