package com.company;

public class Interval {
    final int second;
    public Interval(int second){
        this.second = second;
    }
    public  int seconds(){
        return second;
    }
    public int minutes(){
        return second / 60;
    }
    public int hours(){
        return  second / 3600;
    }
    public int days(){ return second / 86400; }
    public Interval subtract(Interval lastLog){
        Interval newInterval = new Interval(second - lastLog.second);
        return newInterval;
    }
    public static Interval fromDays(int days){
        int secInDays = days * 86400;
        Interval interval = new Interval(secInDays);
        return interval;
    }
}
