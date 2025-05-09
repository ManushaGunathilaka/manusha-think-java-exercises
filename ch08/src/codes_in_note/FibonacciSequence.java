package codes_in_note;

public class FibonacciSequence {

    // 0,1,1,2,3,5,8

    //fibonacci(1) = 1
    //fibonacci(2) = 1
    //fibonacci(n) = fibonacci(n-1)+fibonacci(n-2)


    public static int fibonacci(int n){
        if(n==1){
            return 0;
        }else if (n==2 || n==3){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        int result = fibonacci(6);
        System.out.println(result);
    }

}
