public class methods{
    int add(int a , int b){
        System.out.println(b-a);
        System.out.println(b*a);
        System.out.println(b/a);
        return b+a;
    }
  //  int sub(int a, int b, int c) {
 //       return c-a+b;
   // }
   // int mult(int a, int b){
   //     return a*b;
 //   }

public static void main(String[]args){
System.out.println("PSNA");
methods obj = new methods();
System.out.println(obj.add(10,20));
//System.out.println(obj.sub(10,20,30));
//System.out.println(obj.mult(5,5));


}
}