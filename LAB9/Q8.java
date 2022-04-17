package lab.pkg9;
class EmptyError extends Exception {
}

class FullError extends Exception {
}


class stack {
    int n;
    int i = 0;
    int[] arr;
    stack(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void push(int x) {
        try{
            if(i >= n){
                throw new FullError();
            } else {
                arr[i] = x;
                i++;
            }
        } catch (FullError f) {
            System.out.println("Stack is full, can't enter new element");
        }
    }
    
    public int pop() {
        try{
            if(i > 0){
                int y = arr[i-1];
                i--;
                return y;
            }
            else{
                throw new EmptyError();
            }
        } catch (EmptyError e) {
            System.out.println("Stack is empty, can't remove null element");
            return -1;
        }
    }

}


class Q8 {
    public static void main(String args[]) {
        stack s = new stack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}