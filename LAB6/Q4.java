import java.util.Scanner;

class Rectangle { int length;
int breadth;

Rectangle(int l, int b) { length = l;
breadth = b;
}

int area() {
return length * breadth;
}

int perimeter() {
return 2 * (length + breadth);
}
void display() {
System.out.println("The Area is : " + area()); System.out.println("The Perimeter is : " + perimeter());
}
}

class q4 {
public static void main(String[] args) { int l, b;
System.out.println("Enter the length & breadth of the rectangle : "); Scanner in = new Scanner(System.in);
l = in.nextInt(); b = in.nextInt(); in.close();
Rectangle rec1 = new Rectangle(l, b); rec1.display();
}
}
