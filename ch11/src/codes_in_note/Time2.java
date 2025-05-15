package codes_in_note;

public class Time2 {

    private int hour;
    private int minute;
    private double second;

    public Time2(){
        this.hour=0;
        this.minute=0;
        this.second=0;
    }

    public Time2(int hour,int minute,double second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }

    //custom equals method
    public boolean equals(Time2 that){
        final double DELTA = 0.001;
        return this.hour==that.hour && this.minute==that.minute
                && Math.abs(this.second-that.second) < DELTA;
    }

    public static void main(String[] args) {
        Time2 time1 = new Time2(11,25,24.0);
        Time2 time2 = time1;
        Time2 time3 = new Time2(11,25,24.0);

        System.out.println(time1==time2);
        System.out.println(time1==time3);
        System.out.println(time1.equals(time3));


    }

}
