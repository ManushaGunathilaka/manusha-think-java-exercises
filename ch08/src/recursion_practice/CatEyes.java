package recursion_practice;

public class CatEyes {
    public static void main(String[] args) {
        System.out.println(catEyes(3));
    }


    public static int catEyes(int n){
        if(n==0){
            return 0;
        }
        return  2+ catEyes(n-1);

        //catEyes(3) --> 2+4
        //catEyes(2) --> 2+2
        //catEyes(1) --> 2+0
        //catEyes(0) --> 0


    }
}

