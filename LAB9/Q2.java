/*
A subclass exception must appear before super-class exception. Justify this
with suitable Java programs.
*/
package lab.pkg9;

public class Q2 {

    public static void main(String[] args) {
        int A[] = {30, 20, 10, 40, 0};

        try {
            int c = A[0] / A[4];
            System.out.println("Division is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error handled in sub class");
        } catch (Exception e) {
            System.out.println("Error handled in super class");
        }
    }

}