package codes_in_note;

public class TimeClient {

    public static void printTime(Time t) {
        System.out.printf("%02d:%02d:%04.1f\n",
                t.getHour(), t.getMinute(), t.getSecond());
    }


    public static void main(String[] args) {

        Time time = new Time(1, 59, 5.9);
        System.out.println(time.getHour());

        //time.setHour(13);
        //System.out.println(time.getHour());

        //System.out.println(time);
        //printTime(time);

        System.out.print(time.toString());
        System.out.println(time);
    }
}
