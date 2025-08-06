import java.util.Scanner;
public class tdtable{
    public static void main(String[] args){
         Scanner word = new Scanner(System.in);
        System.out.print("enter your rows:");
        int rows = word.nextInt();
        System.out.print("enter your columns:");
        int cols = word.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("enter your string:");
      int a = 5;
      int b =0;
      int c =0;
     
      //int n =0;
        for(int i=0; i<rows; i++){
    for(int j=0; j<cols;j++){
        arr[i][j] =a;
        a+=5;
        b +=a;
        //arr[i][j]=n*5;
        //ystem.out.print("enter at["+i+"]["+j+"]:");
       // arr[i][j]=word.nextInt();
    }
    }
     System.out.println(b);
       for(int i=0; i<rows; i++){
    for(int j=0; j<cols;j++){
        c++;
        System.out.print(  c +" X 5 = " +arr[i][j]+" ");
        // System.out.print(  n +" X  5 = " +arr[i][j]+" ");
    }

    System.out.println();
        
       }
    }
}
