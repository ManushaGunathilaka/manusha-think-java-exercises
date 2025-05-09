package codes_in_note;

public class PrintBinary {

    public static void printBinary(int n) {
        if (n < 2) {
            System.out.print(n);  // base case
        } else {
            printBinary(n / 2);   // recursive call
            System.out.print(n % 2); // print remainder (digit)
        }
    }

    public static void main(String[] args) {
        printBinary(5);
    }

}
