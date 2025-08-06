import java.util.Scanner;
public class arrayoddeven{
    public static void main(String[] args) {
        //int [] a={1,15,22,60};
        Scanner num = new Scanner(System.in);
        System.out.println("enter size of  your array:");
int size = num.nextInt();
int[] a=new int[size];
System.err.println("enter"+size+"elements");
for(int i =0; i<size;i++){
    a[i]=num.nextInt();
}
        for (int i = 0; i <size; i++) {
            if(a[i]% 2 == 0){
                System.out.println("even:" +a[i]);
                
            }
            else{
                System.out.println("odd:"+a[i]);
            
            }
           
        }
    }
}