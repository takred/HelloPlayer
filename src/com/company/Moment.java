package com.company;

public class Moment {
    int second;
public Moment(int second){this.second = second;}
public int hours(int second){return (second % 86400) / 3600;}
public int minutes(int second){return (second % 3600) / 60;}
public int seconds(int second){return second % 60;}
}
