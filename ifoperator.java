import java.util.Scanner;
public class ifoperator{
    public static void main(String[] args){
Scanner mark = new Scanner(System.in);
System.out.print("enter your mark:");
int a = mark.nextInt();
if( a < 40){
    System.out.println("fail");

}
else if ( a >= 40 &&  a <=  60){
    System.out.println("just pass");
}
else if ( a > 60 && a <= 80){
    System.out.println("average");

}
else if ( a > 80 && a <= 100){
    System.out.println("best");

}
else{
    System.out.println("enter corret mark");
}
    }

}