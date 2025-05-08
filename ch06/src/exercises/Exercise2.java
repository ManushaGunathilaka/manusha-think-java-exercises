package exercises;

import java.util.Scanner;

public class Exercise2 {

    public static double squareRoot(double a){
        double x1,x0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter rough guess about the answer: ");
        x0 = in.nextDouble();

        x1 = (x0 + a/x0)/2;

        return x1;
    }

    public static void main(String[] args) {

        System.out.println("answer: "+ squareRoot(9));
    }

}
