import java.util.Scanner;
public class method_prime{
    public boolean isPrime(int n){
       if(n<=1){
        return false;
       }
       if(n ==2){
        return true;
       }
       if(n%2==0){
        return false;
       }
       for(int i=3; i<n/2;i=i+2){
        if(n%i==0){
        return false;
        }
       }
       return true;
    }

     public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int num= sc.nextInt();
 method_prime obj = new method_prime();
 if(obj.isPrime(num) == true){
    System.out.println("prime");
 }else{
    System.out.println("not a prime");
 }
     }
}
