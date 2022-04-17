
/*Q1 : Illustrate the use of abstract class with the following Java classes
a) An abstract class Student with data member roll, registration and abstract method course.
b) A sub-class KIITan with course method implementation. 
*/

abstract class Student {
    int roll, reg;
    abstract void course();  
}  

class KIITan extends Student{  
    void course() {
        System.out.println("Implementation of the 'Course' function");
    }  
}  
    
class q1{  
    public static void main(String args[]){  
        KIITan s = new KIITan();
        s.course();  
    }  
} 