package codes_in_note;

public class Time3 {
    int hour;
    int minute;
    double second;

    public Time3(int hour, int minute, double second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public Time3(){

    }

    public String toString(){
        return String.format("%02d:%02d:%04.1f\n",this.hour,this.minute,this.second);
    }

//    public static Time3 add(Time3 time1, Time3 time2){
//        Time3 sum = new Time3();
//        sum.hour=time1.hour+ time2.hour;
//        sum.minute= time1.minute+time2.minute;
//        sum.second=time1.second+time2.second;
//        return sum;
//    }

    public Time3 add(Time3 time2){
        Time3 sum = new Time3();
        sum.hour=this.hour+ time2.hour;
        sum.minute= this.minute+time2.minute;
        sum.second=this.second+time2.second;

        if(sum.second>=60){
            sum.second-=60;
            sum.minute+=1;
        }
        if(sum.minute>=60){
            sum.minute-=60;
            sum.hour+=1;
        }
        if(sum.hour>=24){
            sum.hour-=24;
        }
        return sum;
    }

    public static void main(String[] args) {
        Time3 startTime = new Time3(18, 50, 0.0);
        Time3 runningTime = new Time3(2, 16, 0.0);

        Time3 endTime = startTime.add(runningTime);
        System.out.println(endTime);
    }
}
