package codes_in_note;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0};

        double[] b = new double[3];

        for(int i =0; i<3; i++){
            b[i]=a[i];
        }

        System.out.println(Arrays.toString(b));

        double[] c = Arrays.copyOf(a,3);

        System.out.println(Arrays.toString(c));

        System.out.println(a.length);
    }


}
