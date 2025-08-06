public class arraysort{
    public static void main(String[] args) {
        int[] num = {20,77,54,92,61};
        for(int i=0;i<num.length-1;i++){
            for(int j=0; j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;

                }
            }
        }
        System.err.println("sorted arrat");
        for(int number:num){
            System.err.print(number+" ");
        }

    }
}

