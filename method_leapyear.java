

import java.util.Scanner;

public class method_leapyear{
    int leap(int a){
     
if(a % 4 == 0){
    System.out.println("the year is leap year");

}
else{
    System.out.println("is not leap year");
}
return a;
    }  
    public static void main(String[] args){
          Scanner year = new Scanner(System.in);
           int a = year.nextInt();
System.out.print("enter your year:");
method_leapyear obj = new method_leapyear();
obj.leap(a);
    }
    }
