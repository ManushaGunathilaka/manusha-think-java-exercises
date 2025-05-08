package codes;

public class StringFormatting {

    public static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12; // midnight
            }
        } else {
            ampm = "PM";
            hour = hour- 12;
        }
        return String.format("%02d:%02d %s", hour, minute, ampm);
    }

    public static void main(String[] args) {
        String time = timeString(14,15);
        System.out.println(time);
    }
}
