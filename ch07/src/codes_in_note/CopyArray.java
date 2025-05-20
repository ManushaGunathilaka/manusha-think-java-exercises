package codes_in_note;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0,4.0};

        double[] b = new double[4];

        for(int i =0; i<4; i++){
            b[i]=a[i];
        }

        System.out.println(Arrays.toString(b));

        double[] c = Arrays.copyOf(a,6);

        System.out.println(Arrays.toString(c));

        System.out.println(a.length);
    }


}
