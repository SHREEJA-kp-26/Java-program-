import java.util.Scanner;
public class method_matrix{
static void add(int arr[][],int rows,int cols){
    int n=cols-1;
         for(int i=0; i<rows; i++){
    for(int j=0; j<cols;j++){
        
        if( i + j == cols-1 || i == j ){
            
            arr[i][j]=1;
                     } 
      else{
        arr[i][j]=0;
      }
    }
         }

    for(int i=0; i<rows; i++){
    for(int j=0; j<cols;j++){
        System.out.print(arr[i][j]+" ");
    }
      System.out.println();   
 }
}
    public static void main(String[] args){
         Scanner word = new Scanner(System.in);     
        int rows = word.nextInt();     
        int cols = word.nextInt();
        int[][] arr = new int[rows][cols];    
       add(arr, rows, cols);       
    }
      }
        
