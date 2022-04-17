import java.util.*;
public class Q2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        int a=sc.nextInt();
if (a>=90) {
    System.out.println("You Got O grade");

    
}
else if (a<90 && a>=81)
{
    System.out.println("You Got E grade");
}

else if (a<81 && a>=71)
{
    System.out.println("You Got A grade");
}

else if (a<71 && a>=61)
{
    System.out.println("You Got B grade");
}
else if (a<61 && a>=51)
{
    System.out.println("You Got C grade");
}
else if (a<51 && a>=41)
{
    System.out.println("You Got D grade");
}
else if (a<41 && a>=31)
{
    System.out.println("You Got E grade");
}
else if (a<31)
{
    System.out.println("You Got F grade");
}

        
    }

    
}
