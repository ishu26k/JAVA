package lab5;

public class Q5 {

    static int count = 0;

    Q5() {
    }

    protected void finalize() {
        count++;
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {

        Q5 ob = new Q5();
        Q5 ob1 = new Q5();
        Q5 ob2 = new Q5();
        ob.finalize();
        ob1.finalize();
        ob2.finalize();
        System.gc();
        System.out.println("Total no. of objects Destroyed: " + count);
    }
}