package practice;

public class Test {

    public static void main(String[] args) {
        String name = "Alan Turing";
        name.toUpperCase();
        // ignores the return value
        System.out.println(name);


        Integer x = Integer.valueOf(123);
        Integer y = Integer.valueOf(123);
        if (x == y) {
            // false
            System.out.println("x and y are the same object");
        }
        if (x.equals(y)) {
            // true
            System.out.println("x and y have the same value");
        }

        

    }

}
