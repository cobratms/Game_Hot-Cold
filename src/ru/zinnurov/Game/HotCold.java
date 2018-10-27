package ru.zinnurov.Game;

import java.util.Random;
import java.util.Scanner;

public class HotCold {

    public static boolean startGame() {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        String randNum = String.valueOf(rand.nextInt(100));
        String answerNum = "";
        System.out.println("Программа загадала число от 0 до 100. Попробуй отгадать!");
        System.out.println(randNum);
        int firstAnswer, secondAnswer = 0;

        while (true) {
            answerNum = in.next();

            if(answerNum.compareToIgnoreCase(randNum) == 0) {
                System.out.println("Вы победили!");
                break;
            }
            else if(answerNum.compareToIgnoreCase("Выход") == 0) {
                System.out.println("До свидания!");
                break;
            }

            firstAnswer = Integer.parseInt(answerNum);
            int  number = Integer.parseInt(randNum);
            if(Math.abs(number - firstAnswer) <= Math.abs(number - secondAnswer)) {
                System.out.println("Теплее!");
            }

            else {
                System.out.println("Холоднее!");
            }
            secondAnswer = firstAnswer;
        }

        return true;
    }



    public static void main(String[] args) {
        System.out.println("Добро пожаловать! Хочешь сыграть в игру \"Горячо-Холодно\"?");
        System.out.println("\nЕсли да - Пиши \"Да\".");

        System.out.println("Если нет - пиши \"Выход\".");

        Scanner in = new Scanner(System.in);
        String answer = "";

        while (true) {
            answer = in.next();

            if (answer.compareToIgnoreCase("Да") == 0) {
                if(startGame()) {
                    break;
                }
            }
            else if (answer.compareToIgnoreCase("Выход") == 0) { // Выход из игры
                System.out.println("Очень жаль! Будем Вас ждать!");
                break;
            }
            else {
                System.out.println("Я вас не понимаю!");
            }
        }
    }
}
