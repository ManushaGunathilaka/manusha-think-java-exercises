package recursion_practice;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    //factorial(3) --> 3.2
    //factorial(2) -->2.1
    //factorial(1) -->1.1
    //factorial(0) --> 1
}
