import java.util.Scanner; 
import java.lang.Math;
class q6 {
void area(int x, int y) { int a = x * y;
System.out.println("Area of rectangle: " + a);
}
void area(int r) { double pi = 3.14; double b = pi * r * r;
System.out.println("Area of circle: " + b);
}
void area(int a, int b, int c) {  double s = (double)(a + b + c) / 2;
double ans = Math.sqrt((s) * (s - a) * (s - b) * (s - c)); System.out.println("Area of triangle: " + ans);
}
public static void main(String[] args) {
System.out.println("1 for Rectangle \n2 for Triangle\n3 for Circle\nChose your shape : "); 
Scanner in = new Scanner(System.in);
int choice = in.nextInt(); System.out.println("Enter the values : "); q6 s = new q6();
switch (choice) { case 1 -> {
int x = in.nextInt(); int y = in.nextInt(); s.area(x, y);
}
case 2 -> {
int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt(); s.area(a, b, c);
}
case 3 -> {
int r = in.nextInt(); s.area(r);
}
}
in.close();
}
}