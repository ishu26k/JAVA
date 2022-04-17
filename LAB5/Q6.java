package lab5;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        int n, x, count = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements : ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element of which you want to count number of occurrences: ");
        x = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        System.out.println("Number of Occurrence : " + count);
    }

}