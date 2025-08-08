import java.util.Scanner;
public class method_withdraw{
    static double balance = 10000;
    public static void checkbalance(){
        System.out.println("current balance: RS."+balance);
    }
    public static void withdraw(double amount){
        if(amount <=0){
            System.out.println("invail");

        }else if(amount> balance){
           System.out.println(" insufficient balance"); 
        } else{
            balance -= amount;
            System.out.println("RS: "+ amount + " successfully");
        }

    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       checkbalance();
       System.out.println("enter amount to withdraw");
       double amt = sc.nextDouble();
       withdraw(amt);
       checkbalance();
    }

}