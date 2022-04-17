package lab7;
class A {
void callme() { System.out.println("Inside A's ");
}
}
class B extends A { void callme() {
System.out.println("Inside B's ");
}
}
class C extends A { void callme() {
System.out.println("Inside C's ");
}
}
public class Q3 {
public static void main(String[] args) { A a = new A();
B b = new B(); C c = new C(); A r;
r = a; r.callme(); r = b; r.callme(); r = c; r.callme();
}
}

