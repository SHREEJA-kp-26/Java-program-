public class array{
public static void main (String[] args){
    int[] a= {1,2,3,9,0};
    int[] b= {2,3,4,5,6};
   int[] c= new int[ b.length];
   int k=0;
    for(int i=0; i<a.length; i++){
        boolean found = false;
        for(int j=0; j<b.length; j++){
      if(b[i] == a[j]){
found = true;
      }
      }
     if(!found){
        c[k++]=b[i];
     }
        }
System.out.print("uncommon:");
for(int i = 0; i<k; i++){
    System.out.print(c[i]+" ");
}
    }
}

