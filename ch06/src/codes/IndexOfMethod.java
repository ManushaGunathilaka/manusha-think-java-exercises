package codes;

public class IndexOfMethod {
    public static void main(String[] args) {

        String fruit = "banana";

      //  b a n a n a
      //  0 1 2 3 4 5   ← these are the character indices

        int index = fruit.indexOf('a',0);
        int index2 = fruit.indexOf('a', 2);
        int index3 = fruit.indexOf('a', 4);

        System.out.println(index);
        System.out.println(index2);
        System.out.println(index3);

        System.out.println();

        System.out.println(fruit.substring(0,3));
        System.out.println(fruit.substring(2,5));

        System.out.println(fruit.substring(0));
        System.out.println(fruit.substring(2));
    }
}
