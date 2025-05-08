package exercises;

public class Exercise5 {

    public static boolean isDoubloon(String word){

        word = word.toLowerCase();

        for (int i=0; i<word.length(); i++){

            char c = word.charAt(i);
            int count = 0;

            for (int j=0; j<word.length(); j++){

                if(word.charAt(j)==c){
                    count++;
                }
            }

            if(count!=2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDoubloon("abba"));
    }
}
