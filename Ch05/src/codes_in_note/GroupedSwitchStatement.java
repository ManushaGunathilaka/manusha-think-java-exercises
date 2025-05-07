package codes_in_note;

public class GroupedSwitchStatement {

    public static void main(String[] args) {

        String food="apple";

        switch (food){
            case "apple":
            case "banana":
            case "cherry":
                System.out.println("Fruit!");
                break;
            case "asparagus":
            case "broccoli":
            case "carrot":
                System.out.println("Vegitable");
                break;
        }
    }

}
