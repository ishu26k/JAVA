package lab7;
import java.util.Scanner;

class abc {
abc(int a, int b) {
System.out.println("Base Class Parameterized"); System.out.println("a = " + a + " b = " + b);
}
}

class def extends abc { def(int a, int b, int c) {
super(a, b);
System.out.println("Derived Class Parameterized");

System.out.println("a = " + a + " b = " + b + " c = " + c);
}
}

class Q6 {
public static void main(String[] args) { Scanner input = new Scanner(System.in); def obj = new def(1, 2, 3);
input.close();
}
}