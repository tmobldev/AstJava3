package org.example;

public class Main {
    public static void main(String[] args) {

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