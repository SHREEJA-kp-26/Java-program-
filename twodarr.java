//import java.util.Scanner;
public class twodarr{
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
      //  System.out.println("enter your")
int[][] arr = new int[3][3];
int a=0;
for(int i=0; i<3; i++){
    for(int j=0; j<3;j++){
       arr[i][j]=a;
      a++;
    }
}
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){

    System.out.println(arr[i][j]);
        }
    }
    }
}
