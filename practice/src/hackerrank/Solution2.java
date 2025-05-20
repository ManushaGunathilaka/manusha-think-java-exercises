package hackerrank;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String s = Integer.toString(n);

        if(n==Integer.parseInt(s)){
            System.out.println("Good job");
        }else {
            System.out.println("Wrong answer");
        }

    }
}
