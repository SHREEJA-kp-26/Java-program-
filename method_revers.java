import java.util.Scanner;
public class method_revers{
String getinput(){
     Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    return a;
}


void print( String a){
  
    for(int i=a.length()-1;i>=0;i--){
        char ch=a.charAt(i);
        System.out.println(ch);
    }
}
public static void main(String[] args){
    method_hello obj = new method_hello();
    String a = obj.getinput();
    obj.print(a);
}

}

