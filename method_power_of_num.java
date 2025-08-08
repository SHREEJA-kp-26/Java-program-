import java.util.Scanner;
public class method_hello{
 
int power(int a, int b){
    int result = 1;
    for(int i =1; i<= b; i++){
        result *= a;
    }
    return result;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value to be powered");
    int a = sc.nextInt();
    System.out.println("Enter the power value");
    int b = sc.nextInt();
    method_hello obj = new method_hello();
    System.out.println(obj.power(a,b));
    
    
}

}

