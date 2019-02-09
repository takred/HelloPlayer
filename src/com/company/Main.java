package com.company;

public class Main {
    static String Hello(int lastLog, int currentLog){
        int dayLastLog = (((currentLog - lastLog) / 60) / 60)/ 24;
        if (dayLastLog >= 7){
            return "Здравствуйте! Вы отсутствовали больше недели - НЕ НАДО ТАК!";
        }
        return "Проходи, не задерживайся.";
    }
    static String HelloTimesOfDay(int currentLog){
        int fullDay  = ((currentLog / 60) / 60)/ 24;
        int daySec = fullDay * 24 * 60 * 60;
        int dayTime = ((currentLog - daySec) / 60) / 60;
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
    static String OneHelloInDay (int lastLog, int currentLog){
        int lastLogDay = lastLog / 60 / 60 / 24;
        int currentLogDay = currentLog / 60 / 60 / 24;
        if (lastLogDay != currentLogDay){
            return "Ну здорова!";
        }
        return "";
    }

    public static void main(String[] args) {
	// write your code here
        int lastLog = 100;
        int currentLog = 439045;
        System.out.println(Hello(lastLog, currentLog));
        System.out.println(HelloTimesOfDay(currentLog));
        for (int i = 0; i < 10; i++){
            System.out.println(OneHelloInDay(lastLog, currentLog));
            lastLog = currentLog;
            currentLog = currentLog + 10000;
        }
    }
}