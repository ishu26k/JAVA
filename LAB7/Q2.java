package lab7;

class plate {

plate() {
System.out.println("Grandfather Class Constructor Called");
}
}

class box extends plate {

box() {
System.out.println("Father Class Constructor Called");
}
}

class wood_box extends box {

wood_box() {
System.out.println("Child Class Constructor Called");
}
}

class q2 {
public static void main(String[] args) { wood_box obj = new wood_box();

}
}