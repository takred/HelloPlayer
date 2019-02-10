package com.company;

public class Main {
    static String hello(int lastLog, int currentLog){
        Interval currentLogInter = new Interval(currentLog);
        Interval lastLogInter = new Interval(lastLog);
        if (currentLogInter.subtract(lastLogInter).days() >= 7){
            return "Здравствуйте! Вы отсутствовали больше недели - НЕ НАДО ТАК!";
        }
        return helloTimesOfDay(currentLog);
    }
    static String helloTimesOfDay(int currentLogSec){
        Interval currentLogInter = new Interval(currentLogSec);
        Interval fullDayInSec = Interval.fromDays(currentLogInter.days());
        Interval dayTime = currentLogInter.subtract(fullDayInSec);
        System.out.println(dayTime);
        if (dayTime.hours() < 6){
            return "Доброй ночи.";
        } else if (dayTime.hours() < 12){
            return "Доброе утро.";
        } else if (dayTime.hours() < 18){
            return "Добрый день.";
        } else if (dayTime.hours() < 24){
            return "Добрый вечер.";
        }
        return "Что-то фигня какая-то";
    }
    static String oneHelloInDay(int lastLog, int currentLog){
        Interval lastLogDay = new Interval(lastLog);
        Interval currentLogDay = new Interval(currentLog);
        if (lastLogDay.days() != currentLogDay.days()){
            return hello(lastLog, currentLog);
        }
        return "";
    }

    public static void main(String[] args) {
	// write your code here
        int lastLog = 100;
        int currentLog = 1379045;
//        System.out.println(hello(lastLog, currentLog));
//        System.out.println(helloTimesOfDay(currentLog));
        for (int i = 0; i < 10; i++){
            System.out.println(oneHelloInDay(lastLog, currentLog));
            lastLog = currentLog;
            currentLog = currentLog + 10000;
        }
    }
}