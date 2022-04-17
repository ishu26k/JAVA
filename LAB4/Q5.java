import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){ 

        System.out.println("Enter the First Name :");
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();

        System.out.println("Enter the Last Name :");
        String last = sc.nextLine();
        
        System.out.println(last + " " + first);

    }  
}
