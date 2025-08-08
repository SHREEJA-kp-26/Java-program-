import java.util.Scanner;
public class method_sum{
int sum(int a , int b){
    int c = a+b;
    System.out.print(c);
    return c;
}
public static void main(String[] args){
    Scanner sc = new  Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
   System.out.print(" sum of value:");
  method_hello obj = new method_hello();
  obj.sum(a,b);
    
}
} 
