public class arraysum{
    public static void main(String[] args) {
    int[] num = {10,70,50,40,70};
        int sum =0;
 for(int i =0; i<num.length; i++){
    sum = sum + num[i];
      //  max = num[i];
    
 }
 System.out.print("the sum of array is:"+sum);
    }
}