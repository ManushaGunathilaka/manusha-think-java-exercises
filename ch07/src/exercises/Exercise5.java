package exercises;

public class Exercise5 {

    public static boolean areFactors(int n, int[] arr) {
        for (int value : arr) {
            if (n % value != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = {2,4};

        boolean answer = areFactors(8,arr);
        System.out.println(answer);
    }
}
