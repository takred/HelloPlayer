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
    public int days(){
        return second / 86400;
    }
}
