public class Test {
    public static void main(String[] args) {
        String fruit = "banana";

        if(fruit.charAt(1)=='a'){
            System.out.println("yes");
        }

        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }
    }
}
