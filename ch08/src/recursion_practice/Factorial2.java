package recursion_practice;

public class Factorial2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        //n! = n * (n-1)!

        if(n==0 || n==1){
            return 1;
        }else {
            return n* factorial(n-1);
        }

        //factorial(3) - 3 * 2
        //factorial(2) - 2 * 1 = 2
        //factorial(1) - 1
        //factorial(0) - 1
    }
}
