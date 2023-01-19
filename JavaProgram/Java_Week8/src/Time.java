public class Time {
    private int second;
    private int minute;
    private int hour;

    
    public Time(){
        this.second = this.minute = this.hour = 0;
    }    
    public Time(int second,int minute,int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour; 
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public String toString(){
        //Use fuction String.format() to formatted String
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    public void setTime(int second,int minute,int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    //Advance this Time instance by one second
    public Time nextSecond(){ //can call its own class
        ++second;
        
        if(second>=60){
            second = 0;
            ++minute;

            if(minute>=60){
                minute = 0;
                ++hour;

                if(hour>=24){
                    hour = 0;

                }//end of hour
            }//end of minute
        }//end of second
        return this; 
        //Return "this" instance, to support chaining operation
        //e.g. , t1.nextSecond().nexSecond()

    }//end of nextSecond
}
