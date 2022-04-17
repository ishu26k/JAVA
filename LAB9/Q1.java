
package lab.pkg9;


       public class Q1 {

    public static void main(String[] args) {
         int A[] = {30, 20, 10, 40, 0};
         try {
                System.out.println(A[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is Invalid");
            }
    }

}
    
    

