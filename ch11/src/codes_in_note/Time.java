package codes_in_note;


public class Time {

    private int hour;
    private int minute;
    private double second;

    //getters
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public double getSecond() {
        return this.second;
    }

    //seters
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(double second) {
        this.second = second;
    }

    //constructors
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return String.format("%02d:%02d:%04.1f\n",
                this.hour,this.minute,this.second);
    }

    public static void main(String[] args) {
        Time time = new Time(11,26,40.0);
        //System.out.println(time.hour);
        System.out.println(time.toString());
    }
}
