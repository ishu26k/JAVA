package lab7;
import java.util.Scanner;

class account {
int acc_no, balance;

account(int a, int b) { acc_no = a; balance = b;
}


void disp() {
System.out.println("Account no. = " + acc_no); System.out.println("Balance = " + balance);
}
}

class person extends account { String name;
int aadhaar_no;

person(int a, int b, String n, int ad) { super(a, b);
name = n; aadhaar_no = ad;
}

void disp() { super.disp();
System.out.println("Name = " + name); System.out.println("Aadhaar No. = " + aadhaar_no); System.out.println();
}
}

class q5 {
public static void main(String[] args) { Scanner input = new Scanner(System.in); person obj = new person(1,10,"A",100); person obj1 = new person(2,11,"B",101); person obj2 = new person(3,12,"C",102); person obj3 = new person(4,13,"D",103); person obj4 = new person(5,14,"E",104); obj.disp();
obj1.disp();
obj2.disp();
obj3.disp();
obj4.disp(); input.close();
}
}