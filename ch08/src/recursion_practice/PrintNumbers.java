package recursion_practice;

public class PrintNumbers {

    public static void main(String[] args) {
        printNubers(4);
    }

    public static void printNubers(int n){
        if(n==0){
            System.out.println("Done!");
            return;
        }
        printNubers(n-1);
        System.out.println(n);
    }

    //printNubers(4)
    //printNubers(3)
    //printNubers(2)
    //printNubers(1)
    //printNubers(0)

}
