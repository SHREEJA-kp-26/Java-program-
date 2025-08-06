import java.util.Scanner;
public class tdsum{
    public static void main(String[] args){
         Scanner word = new Scanner(System.in);
        System.out.print("enter your rows:");
        int rows = word.nextInt();
        System.out.print("enter your columns:");
        int cols = word.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("enter your string:");
      int sum = 0;
        for(int i=0; i<rows; i++){
    for(int j=0; j<cols;j++){
        System.out.print("enter at["+i+"]["+j+"]:");
        arr[i][j]=word.nextInt();
    }
    }
      System.out.println("2d string:");
       for(int i=0; i<rows; i++){
    for(int j=0; j<cols;j++){
        System.out.print(arr[i][j]+" ");
    }

    System.out.println(sum);

        }
        int total=0;
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
                total += arr[i][j];
            }
        }
        System.out.println("sum of all elements =" + total);
}
}
    