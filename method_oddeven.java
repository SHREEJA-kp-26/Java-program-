import java.util.Scanner;
public class method_oddeven{
  static void oddeven(int n){
    if(n%2==0)
    System.out.println(n+"is even");
    else
    System.out.println(n+"is odd");

  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number");
    int num = sc.nextInt();
    oddeven(num);
  }
}