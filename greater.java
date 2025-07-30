import java.util.Scanner;

public class greater{
    public static void main(String[] args){
int a=10, b=20;
Scanner num = new Scanner(System.in);
System.out.print("enter your c:");
int c = num.nextInt();
if(a>b && a>c){
    System.out.print("a is greater");
    
}
else if(b>c && b>a){
    System.out.print("b is greater");
    
}
else if(c>b && c>a){
    System.out.print("c is greater");
    
}
else{
    System.out.print("invalid");
}
    }
}