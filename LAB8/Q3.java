

/*Define an interface with 3 methods earning, deduction and bonus and define a Java class Manager which uses this interface without implementing bonus method. i.e. Manager is a subclass without bonus method. Also define another java class SubStaff which extends from Manager class and implements the bonus method.
Write the complete program to find out the earnings, deduction and bonus of a substaff with basic salary amount entered by the user as per the following guidelines :-
earning -> basic + DA(80% of basic) + HRA(50% of basic)
deduction PF -> (12% of basic) 
bonus -> 50% of basic*/
interface Pay {
    void earning();
    void bonus();
    void deduction();
}  
      
abstract class Manager implements Pay {
    float basic;

    Manager(float basic) {
        this.basic = basic;
    }

    public void earning() {
        System.out.println("Total earning of the employee : " + (basic + basic * (0.8) + basic * (0.5)));
    }

    public void deduction() {
        System.out.println("Total deductions of the employee : " + (basic * 0.12));
    }
}

class SubStaff extends Manager {
    float basic;

    SubStaff(float basic) {
        super(basic);
        this.basic = super.basic;
    }
    
    public
    void bonus() {
        System.out.println("The bonus is : " + basic * (0.5));
    }
}  
      
class q3{  
    public static void main(String args[]) {
        SubStaff d = new SubStaff(10000);
        d.earning();
        d.deduction();
        d.bonus();
    }
}  