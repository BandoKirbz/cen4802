public class recursion {
    public static int fib(int n){
        //base case
        if(n <= 1) return n;
        else
            return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 10; //n starts from 0
        if(n<0)
            System.out.println("Fibonacci number is not defined");
        else
            System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}