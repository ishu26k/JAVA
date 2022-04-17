/*Write a program to create user defined exceptions called HrsException,
MinException and SecException. Create a class Time which contains data
members hours, minutes, seconds and throw the user defined exceptions if
hours (>24 & <0),minutes(>60 & <0),seconds(>60 & <0).*/
package lab.pkg9;
class HrsException extends Exception {
}

class MinException extends Exception {
}

class SecException extends Exception {
}

class time {
    int hrs, min, sec;

    time(int a, int b, int c) {
        hrs = a;
        min = b;
        sec = c;
    }
    
    public void check() {
        try {
            if (hrs < 0 || hrs > 24) {
                throw new HrsException();
            }
        } catch (HrsException h) {
            System.out.println("HrsException caught manually");
        }
        try {
            if (min < 0 || min > 60) {
                throw new MinException();
            }
        } catch (MinException m) {
            System.out.println("MinException caught manually");
        }
        try {
            if (sec < 0 || sec > 60) {
                throw new SecException();
            }
        } catch (SecException s) {
            System.out.println("SecException caught manually");
        }
    }
    
    public void show() {
        System.out.println("Hours: " + hrs + " Minutes:" + min + " Seconds: " + sec);
    }
}


public class Q5 {

    public static void main(String args[])
    {
        time t = new time(-5, 72, 89);
        t.check();
        t.show();   
    }
}