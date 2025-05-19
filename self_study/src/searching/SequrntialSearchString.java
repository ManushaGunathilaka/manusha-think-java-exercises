package searching;

public class SequrntialSearchString {

    public static int sequentialSearch(String[] arr, String target){
        for (int i =0; i<arr.length; i++){
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String[] arr = {"A","B","C","D","E"};

        int index = sequentialSearch(arr,"S");

        if (index>=0){
            System.out.println("target is in index "+index);
        }else {
            System.out.println("target not found!");
        }

    }
}
