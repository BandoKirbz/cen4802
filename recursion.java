/**
* The Recursion program implements a method that
* simply returns the nth fibonacci number to the standard output.
*
* @author  Vlhasner Milord
* @since   2022-09-05 
* @param   n 
* @return  the nth fibonacci number
*/
public class recursion {
    public static int fib(int n){
        //base case
        if(n <= 1) return n;
        else
            return fib(n-1) + fib(n-2);
    }
/**
* The main method calls the fib method to return the nth number 
* @author Vlhasner Milord
* @param args
* @return a statement of the nth fibonacci number
*/

    public static void main(String[] args) {
        int n = 10; //n starts from 0
        if(n<0)
            System.out.println("Fibonacci number is not defined");
        else
            System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}
