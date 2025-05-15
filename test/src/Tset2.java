public class Tset2 {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    //fac(n)=n*fac(n-1)
    //factorial(2)
    //factorial(1)
    //factorial(0) - 1
}

