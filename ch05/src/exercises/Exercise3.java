package exercises;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        int a,b,c,n;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Integer a: ");
        a = in.nextInt();

        System.out.print("Enter Integer b: ");
        b = in.nextInt();

        System.out.print("Enter Integer c: ");
        c = in.nextInt();

        System.out.print("Enter Integer n: ");
        n = in.nextInt();

        boolean flag = (Math.pow(a,n)+Math.pow(b,n)) == Math.pow(c,n);

        if(n>2 && flag){
            System.out.println("Holy smokes, Fermat was wrong!");
        }else {
            System.out.println("No, that doesnt work");
        }

    }


}
