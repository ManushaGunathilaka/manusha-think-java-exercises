package recursion_practice;

public class Fibonacci2 {
    public static void main(String[] args) {
        System.out.println(fibonaccci(4));
    }

    //0,1,1,2,3,5,8
    //f(n)=f(n-1)+f(n-2)

    public static int fibonaccci(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        return fibonaccci(n-1)+fibonaccci(n-2);


        //fibonaccci(3) - 1+1  = 2
        //fibonaccci(2) - 1+ 0 = 1
        //fibonaccci(1) - 1
        //fibonaccci(0) - 0
    }
}
