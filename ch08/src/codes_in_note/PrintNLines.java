package codes_in_note;

public class PrintNLines {

    public static void nLines(int n){

        if(n>0){
            System.out.println("/n");
            nLines(n-1);
        }
    }

    public static void main(String[] args) {
        nLines(4);
    }

}

