import java.util.Scanner;
public class tdrow{
    public static void main(String[] args){
        Scanner word = new Scanner(System.in);
        System.out.print("enter your rows:");
        int rows = word.nextInt();
        System.out.print("enter your columns:");
        int cols = word.nextInt();
        int[][] arr = new int[rows][cols];
       // System.out.println("enter your matrix:");
        if (rows == cols){
         for(int i=0; i<rows; i++){
    for(int j=0; j<cols;j++){
        if( i == j){
            arr[i][j]=1;
        }
      else{
        arr[i][j]=0;
      }
      }
      }
      for(int i=0; i<rows; i++){
    for(int j=0; j<cols;j++){
          System.out.print(arr[i][j]+ " ");  
    }    
   System.out.println();
      }
        }
    }
}
    