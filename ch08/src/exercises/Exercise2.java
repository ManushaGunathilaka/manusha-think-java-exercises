package exercises;

public class Exercise2 {

    public static int oddSum(int n) {

        if(n==1){
            return 1;
        }

        int sum = n+ oddSum(n-2);
        return  sum;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = oddSum(n);
        System.out.println("Sum of odd numbers up to " + n + " is: " + result);
    }
}
