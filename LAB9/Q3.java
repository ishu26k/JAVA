

/*
Write a Java program to illustrate try..catch..finally block.
*/
class q3 {
    public static void main(String args[]) {
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("No error caught, finally block is executed");
        }

        System.out.println("Now, let's catch the error");

        try{
            int data = 25 / 0;
            System.out.println("This results in error" + data);
        } catch (ArithmeticException f) {
            System.out.println("Manually caught Arithmetic exception");
        }

        finally {
            System.out.println("Finally runs regardless");
        }

    }
}