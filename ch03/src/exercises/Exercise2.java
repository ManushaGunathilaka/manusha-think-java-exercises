package exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Celsius value: ");
        double c = in.nextDouble();

        double f= (24.0/75.2)*c;
        System.out.println(f);
    }
}
