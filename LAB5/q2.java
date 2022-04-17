import java.util.Scanner;

public class q2{
public static void main(String args[]) {

System.out.print("Enter a number: "); Scanner scan = new Scanner(System.in); int num = scan.nextInt();
scan.close();

if(num % 2 == 0) System.out.println(num + " is even");
else
System.out.println(num + " is odd");
}}