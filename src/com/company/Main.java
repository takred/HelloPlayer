package com.company;

public class Main {
    static String hello(int lastLog, int currentLog){
        int dayLastLog = (currentLog - lastLog) / 86400;
        if (dayLastLog >= 7){
            return "Здравствуйте! Вы отсутствовали больше недели - НЕ НАДО ТАК!";
        }
        return "Проходи, не задерживайся.";
    }
    static String helloTimesOfDay(int currentLog){
        int dayTime = (currentLog % 86400) / 3600;
        System.out.println(dayTime);
        if (dayTime < 6){
            return "Доброй ночи.";
        } else if (dayTime < 12){
            return "Доброе утро.";
        } else if (dayTime < 18){
            return "Добрый день.";
        } else if (dayTime < 24){
            return "Добрый вечер.";
        }
        return "Что-то фигня какая-то";
    }
    static String oneHelloInDay(int lastLog, int currentLog){
        int lastLogDay = lastLog / 86400;
        int currentLogDay = currentLog / 86400;
        if (lastLogDay != currentLogDay){
            return "Ну здорова!";
        }
        return "";
    }

    public static void main(String[] args) {
	// write your code here
        int lastLog = 100;
        int currentLog = 379045;
        System.out.println(hello(lastLog, currentLog));
        System.out.println(helloTimesOfDay(currentLog));
        for (int i = 0; i < 10; i++){
            System.out.println(oneHelloInDay(lastLog, currentLog));
            lastLog = currentLog;
            currentLog = currentLog + 10000;
        }
    }
}