package recursion_practice;

public class Fibonacci {
    //0, 1, 1, 2, 3, 5, 8, 13, ...
    //F(n) = F(n-1) + F(n-2)

    //F(0) = 0
    //F(1) = 1

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        return  fibonacci(n-1)+fibonacci(n-2);
    }
}
