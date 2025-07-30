import java.util.Scanner;

public class leap_year{
    public static void main(String[] args){
        Scanner year = new Scanner(System.in);
System.out.print("enter your year:");
int a = year.nextInt();
if(a % 4 == 0){
    System.out.println("the year is leap year");

}
else{
    System.out.println("is not leap year");
}
    }

}