import java.util.Scanner;
public class arrayfind{
    public static void main(String[] args) {
    
        int[] num = {10,70,50,40,70};
   //     int sum = 70;
 //       boolean found = false;
 //for(int i =0; i<num.length; i++){
 //if(num[i] == sum){
   // System.out.println(" index:"+i+ "element found at: " + sum);
    //found = true;
      //  break;
// }
    
 //}
 //if(!found){
 //System.out.print("element not found");
 //}
Scanner sc=new Scanner(System.in);
 int a =sc.nextInt();
 for(int i=0;i<num.length;i++){
if(num[i]==a){
System.out.print(i+""+num[i]);
return;
}
}
System.out.print("not found");
    }
}