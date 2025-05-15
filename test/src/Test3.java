public class Test3 {

    public static void main(String[] args) {

        int num =10;
        decimalToBinary(num);

    }

    public static void decimalToBinary(int n){
        if(n>0){
            decimalToBinary(n/2); // 10
            System.out.print(n%2); //
        }

    }

    //n/2
}
