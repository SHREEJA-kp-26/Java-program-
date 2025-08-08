import java.util.Scanner;
public class method_square{
//SQUARE THE NUMBER

int sq(int a){
    int b = a*a;
    System.out.println(b);
return a;
}
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
    System.out.print(" square of the value:");
   method_hello obj = new method_hello();
   obj.sq(a);
    
    System.out.println(obj.sq(3));
}
}
