package codes;

public class ReverseString {

    public static String reverse (String s){
        String reversed="";
        for (int i = s.length()-1; i>=0; i--){
            reversed +=s.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {

        String reversedStr= reverse("manusha");
        System.out.println(reversedStr);
    }
}
