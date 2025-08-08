import java.util.Scanner;

public class Method4C4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter your rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter your columns: ");
        int cols = scanner.nextInt();
    
        int[][] arr = new int[rows][cols];
        int sum = fill(arr, rows, cols);
        
        System.out.println("Sum of all elements: " + sum);

       
        printArray(arr);
        
       
        scanner.close();
    }

   
    static int fill(int[][] arr, int rows, int cols) {
        int a = 5;  
        int b = 0;  
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = a;  
                b += a;          
                a += 5;         
            }
        }
        return b;  

    
    static void printArray(int[][] arr) {
        System.out.println("2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");  
            }
            System.out.println();  
        }
    }
}
}
