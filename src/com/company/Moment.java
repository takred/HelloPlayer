package com.company;

public class Moment {
    int second;
    public static final int[] DAY_IN_MONTH(){
        int [] dayInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dayInMonth;
    }
public Moment(int second){this.second = second;}
public int years (int second){return (second / 86400) / 365;}
public int months(int second){
    int day = (second / 86400) % 365;
    System.out.println(day);
     int [] dayInMonth = DAY_IN_MONTH();
    for (int i = 0; i < dayInMonth.length; i++){
        if (day < dayInMonth[i]){
            return i + 1;
        }
        day = day - dayInMonth[i];
    }
    throw new RuntimeException("Kod plohoy");
}
public int days(int second){
    int day = (second / 86400) % 365;
    int [] dayInMonth = DAY_IN_MONTH();
    for (int i = 0; i < dayInMonth.length; i++){
        if (day < dayInMonth[i]){
            return day;
        }
        day = day - dayInMonth[i];
    }
    return day;
}
public int hours(int second){return (second % 86400) / 3600;}
public int minutes(int second){return (second % 3600) / 60;}
public int seconds(int second){return second % 60;}
}
