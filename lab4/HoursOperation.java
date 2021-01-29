package com.company.lab4;

public class HoursOperation {
    public String secondsToTime(int seconds) throws Exception{
        if(seconds > 359999 || seconds < 0){
            throw new Exception("Out of bounce");
        }
        int Hours = seconds / 3600;
        int Minutes = (seconds - Hours * 3600) / 60;
        return String.format("%s:%s:%s", Hours, Minutes, seconds - (Hours * 3600 + Minutes * 60));
    }
}
