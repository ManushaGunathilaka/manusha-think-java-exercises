package hackerrank;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter A:");
        String A = in.nextLine();
        A=A.toLowerCase();

        System.out.print("Enter B:");        String B = in.nextLine();
        B=B.toLowerCase();

        System.out.println(A.length()+B.length());
        String newA = A.substring(0,1).toUpperCase()+A.substring(1);
        String newB = B.substring(0,1).toUpperCase()+B.substring(1);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
            System.out.println(newA+" "+newB);
        }else {
            System.out.println("No");
            System.out.println(newA+" "+newB);
        }
    }
}

