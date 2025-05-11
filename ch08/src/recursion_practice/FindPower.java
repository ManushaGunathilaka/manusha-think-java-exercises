package recursion_practice;

public class FindPower {
    public static void main(String[] args) {
        System.out.println(findPower(2,3));
    }

    public static int findPower(int base,int power){
        if(power==0){
            return 1;
        }
        return base*findPower(base,power-1);
    }
}
