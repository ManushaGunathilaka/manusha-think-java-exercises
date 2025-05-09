package codes_in_note;

public class Factorial {

    public  static  int  factoria(int n){
        if(n==0){
            return 1;
        }

        int recurse = factoria(n-1);
        int result = n*recurse;
        return result;
    }

    public static void main(String[] args) {

        int result = factoria(0);
        System.out.println("ansewr = "+result);
    }

}
