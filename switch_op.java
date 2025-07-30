import java.util.Scanner;
public class switch_op{
    public static void main(String[] args){
Scanner day = new Scanner(System.in);
System.out.print("enter your day:");
int a = day.nextInt();
switch(a){
    case 1:
        System.out.println("Monday");
        break;

    case 2:
         System.out.println("thuesday");
        break;
    case 3:
          System.out.println("wednesday");
        break;
     case 4:
          System.out.println("tuesday");
        break;
     case 5:
          System.out.println("friday");
        break;
    case 6:
          System.out.println("saturday");
        break;
    case 7:
          System.out.println("sunday");
        break;
    default:
        System.out.println("invalid");
        break;

}
            
    }
}