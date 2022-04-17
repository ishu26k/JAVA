/*Write a java program to create Account with 500 rupee minimum balance,
deposit amount, withdraw amount and also throws LessBalanceException which
returns the statement that says withdraw amount is not valid.*/
package lab.pkg9;
class AccountError extends Exception {
}

class account {
    int balance;

    account(int x) {
        balance = x;
        System.out.println("Initial account balance : " + balance);
    }

    public void check() {
        try{
            if(balance < 500) {
                throw new AccountError();
            }
        } catch (AccountError e) {
            System.out.println("Account balance is below the INR 500 threshold");
            System.out.println("Current balance is : " + balance);
        }
    }

    public void withdraw(int w) {
        System.out.println("Withdraw function called with " + w + " amount");
        balance = balance - w;
        System.out.println("Updated account balance is : " + balance);
        check();
    }

    public void deposit(int d) {
        System.out.println("Deposit function called with " + d + " amount");
        balance = balance + d;
        System.out.println("Updated account balance is : " + balance);
        check();
    }

}


class Q7 {
    public static void main(String args[]) {
        account a = new account(700);
        a.deposit(200);
        a.withdraw(800);
    }
}