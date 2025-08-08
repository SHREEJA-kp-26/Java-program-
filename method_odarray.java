import java.util.Scanner;
public class method_odarray{
     float avg(int arr[],int a){
int sum=0;
      for(int i=0; i<arr.length; i++){
        sum += arr[i];

      }
      //float average = sum/(float)a;
      return (float) sum/a;
    }
    void display(float n){
        if(n>0&&n<=40){
            System.out.println("fail" +n);
        }
        else if(n>40&&n<=60){
           System.out.println("C" +n); 
        }
        else if (n>60 &&n<=80){
            System.out.println("B" +n);
        }
        else if(n>80&&n<=100){
         System.out.println("A" +n);
        }
        else{
            System.out.println("Invalid"+n);
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       System.out.println("enter marks:"); 
        int a = sc.nextInt();
         int[] arr= new int[5];
         
         for(int i=0; i<5;i++){
            arr[i] = sc.nextInt();

         }
         
        method_odarray obj = new method_odarray();
        float average = obj.avg(arr,5);
        int totalSum =0;
        for(int mark:arr){
            totalSum += mark;
        }
System.out.println("total mark" + totalSum);
obj.display(average);


    }
}