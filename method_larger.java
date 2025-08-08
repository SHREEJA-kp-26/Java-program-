import java.util.Scanner;
public class method_hello{
int print(int a , int b, int c){
 
   if(a>b){
     System.out.print("a is larger:");

}else if(b>c){
        System.out.print("b is larger:");
    }
    else {
        System.out.print("c is larger");
    }
    return 0;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
 method_hello obj = new method_hello();
  obj.print(a,b,c);
}
}
//}
