

public class arraylargest{
    public static void main(String[] args) {
        int[] num = {10,70,50,40,70};
        int max = num[0];
 for(int i =1; i<num.length; i++){
    if(num[i] > max){
        max = num[i];
    }
 }
 System.out.print("the largest element in the array is:"+max);
    }
}