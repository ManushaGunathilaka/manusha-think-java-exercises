package codes_in_note;

public class TraversingArray2 {

    public static int search(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return-1; // not found
    }

    public static void main(String[] args) {

        double[] arr = {3.14,-55.0, 1.23,-0.8};

        int x = search(arr,3.15);
        if(x<0){
            System.out.println("not found");
        }else {
            System.out.println("found");
        }

    }

}
