import java.util.Scanner;

class Student { int[] roll; float[] cgpa; String[] name; int n;

Student(int[] roll, float[] CGPA, String[] Name, int N) { this.roll = roll;
cgpa = CGPA; name = Name; n = N;
}

int FindSmallest(float[] arr1) { int index = 0;
float min = arr1[index];
for (int i = 1; i < arr1.length; i++) { if (arr1[i] < min) {
min = arr1[i]; index = i;
}
}
return index;
}

void display() {
System.out.println("The Student details are : \n"); for(int i = 0;i < n;i++) {
System.out.print("\nRoll number : " + roll[i]); System.out.print("\nCGPA : "+cgpa[i]); System.out.print("\nEnter the name of student : "+name[i]); System.out.println();
}
System.out.println("\nThe Student with lowest CGPA is : "); int x = FindSmallest(cgpa);


System.out.println(name[x]);
}
}

public class q5 {
public static void main(String[] args) { System.out.print("Enter the number of students :- "); Scanner in = new Scanner(System.in);
int n = in.nextInt(); int[] roll;
float[] cgpa; String[] name;

roll = new int[n]; cgpa = new float[n];
name = new String[n]; for (int i = 0; i < n; i++) {

System.out.print("Enter the roll number of student :- "); roll[i] = in.nextInt();
System.out.print("Enter the CGPA of student :- "); cgpa[i] = in.nextFloat();
in.nextLine();
System.out.print("Enter the name of student :- "); name[i] = in.nextLine();
System.out.println();
}
Student s = new Student(roll, cgpa, name, n); s.display();
in.close();
}
}
