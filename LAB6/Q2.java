package lab6;
import java.util.Scanner;

class Q2 {
void sub(int x, int y) { int a = x - y;
System.out.println("Subtraction : " +a);
}

void sub(double x, double y) { double b = x - y;
System.out.println("Subtraction : " + b);
}

void sub(float x, float y) { float b = x - y;
System.out.println("Subtraction : " + b);
}

public static void main(String[] args) {
System.out.println("Chose your data type :\n1 for int\n2 for float\n3 for double"); Scanner in = new Scanner(System.in);
System.out.println("Enter choice: "); int choice = in.nextInt();
if (choice == 1) {
int x = in.nextInt(); int y = in.nextInt(); Q2 s = new Q2(); s.sub(x, y);
}

if (choice == 2) {
float x = in.nextFloat(); float y = in.nextFloat(); Q2 s = new Q2(); s.sub(x, y);
}

if (choice == 3) {
double x = in.nextDouble(); double y = in.nextDouble();
Q2 s = new Q2(); s.sub(x, y);
}

in.close();
}
}