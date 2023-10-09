package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // Задание №1

        System.out.print("Введите число: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num > 7) {
            System.out.println("Привет");
        }
        System.out.println('\n');



        // Задание №2

        System.out.print("Введите имя: ");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String name = br2.readLine();
        if(name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println('\n');



        // Задание №3

        int[] numbers = new int[30];
        int temp;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 30 + 1);
        }

        System.out.print("Массив данных: ");
        for(int i : numbers){
            System.out.print(" " + i + " ");
        }

        System.out.print('\n' + "Элементы массива данных, кратные трем: ");
        for (int number : numbers) {
            temp = number % 3;
            if (temp == 0) {
                System.out.print(" " + number + " ");
            }
        }
    }
}