class MyError extends Exception {
}

class q6 {
    public static void main(String args[]) {
        try {
            if (args.length < 4) {
                throw new MyError();
            } else {
                int sum = 0;
                System.out.println("Normal execution");
                int[] arr = new int[args.length];
                for (int i = 0; i < args.length; i++) {
                    arr[i] = Integer.parseInt(args[i]);
                    System.out.println("arr[" + i + "] : " + arr[i] * arr[i]);
                    sum = sum + arr[i] * arr[i];
                }
                System.out.println("Sum of square of command line arguements : " + sum);  
            }
        } catch (MyError e) {
            System.out.println("Command line arguements are less than 4");
        }
    }
}