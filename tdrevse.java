//import java.util.Scanner;
public class tdrevse{
    public static void main(String[] args){
        int [][] arr = {{1,0,0,1},{0,1,1,0},{1,1,0,1},{0,0,1,1}};
         int rows = arr.length;
         int cols = arr[0].length;
         for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int start =0, end=cols-1;
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
               // System.out.print(arr[i][j]+"");
                System.out.print(arr[j][i]+"");
            }
            System.out.println();
         }
    }
}
