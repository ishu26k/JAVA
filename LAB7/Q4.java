package lab7;
import java.util.Scanner; class shape {
double area;

void showArea() { System.out.println("Area = " + area);
}
}
class circle extends shape { float radius;

void get(int r) { radius = r;
}

void calcArea() {
area = 3.14159 * radius * radius;
}
}
class rectangle extends shape { int length, breadth;

void get(int l,int r) { length = l; breadth = r;
}
void calcArea() {
area = length * breadth;
}
}
class Q4 {
public static void main(String[] args) { Scanner input = new Scanner(System.in); circle c = new circle();
c.get(10);
c.calcArea();
c.showArea();
rectangle r = new rectangle(); r.get(4,5);
r.calcArea();
r.showArea(); input.close();
}
}
