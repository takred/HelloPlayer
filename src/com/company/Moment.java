package com.company;

public class Moment {
    int second;
public Moment(int second){this.second = second;}
public int years (int second){return (second / 86400) / 365;}
public int months(int second){
    int month = 1;
    int day = (second / 86400) % 365;
//    System.out.println(day);
    int [] dayInMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for (int i = 0; i < dayInMonths.length; i++){
        if (day < dayInMonths[i]){
            return i + 1;
        }
        day = day - dayInMonths[i];
    }
//    if (day - 31 >= 0) {
//        day = day - 31;
//        if (day - 28 >= 0) {
//            day = day - 28;
//            month++;
//            if (day - 31 >= 0) {
//                day = day - 31;
//                month++;
//                if (day - 30 >= 0) {
//                    day = day - 30;
//                    month++;
//                    if (day - 31 >= 0) {
//                        day = day - 31;
//                        month++;
//                        if (day - 30 >= 0) {
//                            day = day - 30;
//                            month++;
//                            if (day - 31 >= 0) {
//                                day = day - 31;
//                                month++;
//                                if (day - 31 >= 0) {
//                                    day = day - 31;
//                                    month++;
//                                    if (day - 30 >= 0) {
//                                        day = day - 31;
//                                        month++;
//                                        if (day - 31 >= 0) {
//                                            day = day - 31;
//                                            month++;
//                                            if (day - 30 >= 0) {
//                                                day = day - 31;
//                                                month++;
//                                                if (day > 0) {
//                                                    month++;
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
    return month;
}
public int days(int second){
    int day = (second / 86400) % 365;
    int [] dayInMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for (int i = 0; i < dayInMonths.length; i++){
        if (day < dayInMonths[i]){
            return day;
        }
        day = day - dayInMonths[i];
    }
//    if (day - 31 >= 0) {
//        day = day - 31;
//        if (day - 28 >= 0) {
//            day = day - 28;
//            if (day - 31 >= 0) {
//                day = day - 31;
//                if (day - 30 >= 0) {
//                    day = day - 30;
//                    if (day - 31 >= 0) {
//                        day = day - 31;
//                        if (day - 30 >= 0) {
//                            day = day - 30;
//                            if (day - 31 >= 0) {
//                                day = day - 31;
//                                if (day - 31 >= 0) {
//                                    day = day - 31;
//                                    if (day - 30 >= 0) {
//                                        day = day - 31;
//                                        if (day - 31 >= 0) {
//                                            day = day - 31;
//                                            if (day - 30 >= 0) {
//                                                day = day - 31;
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
    return day;
}
public int hours(int second){return (second % 86400) / 3600;}
public int minutes(int second){return (second % 3600) / 60;}
public int seconds(int second){return second % 60;}
}
