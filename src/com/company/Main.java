package com.company;

public class Main {
    static String hello(int lastLog, int currentLog) {
        Interval currentLogInter = new Interval(currentLog);
        Interval lastLogInter = new Interval(lastLog);
        if (currentLogInter.subtract(lastLogInter).days() >= 7) {
            return "Здравствуйте! Вы отсутствовали больше недели - НЕ НАДО ТАК!";
        }
        return "Проходи, не задерживайся.";
    }

    static String helloTimesOfDay(int currentLogSec) {
        Interval currentLogInter = new Interval(currentLogSec);
        Interval fullDayInSec = Interval.fromDays(currentLogInter.days());
        Interval dayTime = currentLogInter.subtract(fullDayInSec);
        if (dayTime.hours() < 6) {
            return "Доброй ночи.";
        } else if (dayTime.hours() < 12) {
            return "Доброе утро.";
        } else if (dayTime.hours() < 18) {
            return "Добрый день.";
        } else if (dayTime.hours() < 24) {
            return "Добрый вечер.";
        }
        return "Что-то фигня какая-то";
    }

    static String oneHelloInDay(int lastLog, int currentLog) {
        Interval lastLogDay = new Interval(lastLog);
        Interval currentLogDay = new Interval(currentLog);
        if (lastLogDay.days() != currentLogDay.days()) {
            return "Ну здорова!";
        }
        return "";
    }

    static String helloPlayer(int lastLog, int currentLog) {
        Interval lastLogInter = new Interval(lastLog);
        Interval currentLogEnter = new Interval(currentLog);
        if (currentLogEnter.days() - lastLogInter.days() >= 7) {
            return "Здравствуйте! Вы отсутствовали больше недели - НЕ НАДО ТАК!";
        }
        if (lastLogInter.days() != currentLogEnter.days()) {
            Interval fullDaysInSec = Interval.fromDays(currentLogEnter.days());
            Interval dayTime = currentLogEnter.subtract(fullDaysInSec);
            if (dayTime.hours() < 6) {
                return "Доброй ночи.";
            } else if (dayTime.hours() < 12) {
                return "Доброе утро.";
            } else if (dayTime.hours() < 18) {
                return "Добрый день.";
            } else if (dayTime.hours() < 24) {
                return "Добрый вечер.";
            }
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
            System.out.println(helloPlayer(lastLog, currentLog));
//            System.out.println(oneHelloInDay(lastLog, currentLog));
            lastLog = currentLog;
            currentLog = currentLog + 10000;
        }
    }
}