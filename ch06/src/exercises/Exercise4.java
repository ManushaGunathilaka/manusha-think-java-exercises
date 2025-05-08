package exercises;

public class Exercise4 {

    public static boolean isAbecedarian(String word){

        //a b c d
        //0 1 2 3

        for (int i =0; i<word.length()-1; i++){
            if(word.charAt(i) < word.charAt(i+1)){
                return true;
            }
        }

        return  false;
    }

    public static void main(String[] args) {
        System.out.println(isAbecedarian("abdest"));
    }
}
