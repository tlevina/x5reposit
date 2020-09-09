package ru;
// Домашнее задание 2 T.Levina

import java.util.Scanner;

public class HomeTask_II {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        int num = in.nextInt();
        switch (num) {
            case (1):
                one();
                break;
            case (2):
                two();
                break;
            case (3):
                three();
                break;
            case (4):
                four();
                break;
            case (5):
                five();
                break;
            case (6):
                six();
                break;
            case (7):
                seven();
                break;
            case (8):
                eight();
                break;
            case (9):
                nine();
                break;
            case (10):
                ten();
                break;
            default:
                System.out.print("Введен неправильный номер задания");
                break;
        }
    }

    // Первое задание
    public static void one() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int l;
        l = num % 10;
        System.out.printf("Последняя цифра: %d \n", l);
        in.close();
    }

    // Второе задание
    public static void two() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);

        System.out.printf("CСумма цифр: %d \n", sum);
        in.close();
    }

    //третье задание
    public static void three() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        if (num > 0) {
            num++;
        }
        System.out.println(num);
    }

    //четвертое задание
    public static void four() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        System.out.println("Число: " + num);
        if (num > 0) {
            num++;
        } else if (num < 0) {
            num -= 2;
        } else {
            num = 10;
        }

        System.out.println(num);
    }

    //пятое задание
    public static void five() {
        int min = 0, num;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите " + i + "ое число: ");
            num = in.nextInt();
            if (i == 1) {
                min = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("Наименьшее число :" + min);
    }

    // шестое задание
    public static void six() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        System.out.printf("Ваше число: %d \n", num);
        if (num == 0) {
            System.out.println("нулевое число");
        } else if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("положительное четное число");
            } else {
                System.out.println("положительное нечетное число");
            }
        } else {
            if (num % 2 == 0) {
                System.out.println("отрицательное четное число");
            } else {
                System.out.println("отрицательное нечетное число");
            }

        }


    }

    //седьмое задание
    public static void seven() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите код: ");
        double coast;
        int num = in.nextInt();
        switch (num) {
            case (905):
                coast = 4.15 * 10;
                System.out.print("Москва. Стоимость разгвора " + coast);
                break;

            case (194):
                coast = 1.98 * 10;
                System.out.print("Ростов. Стоимость разгвора " + coast);
                break;

            case (491):
                coast = 2.69 * 10;
                System.out.print("Краснодар. Стоимость разгвора " + coast);
                break;

            case (800):
                coast = 5.00 * 10;
                System.out.print("Киров. Стоимость разгвора " + coast);
                break;

            default:
                System.out.print("Код не найден");
                break;

        }
    }

    //восьмое задание
    public static void eight() {
        int[] ArrayList = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int sumPositive = 0, sumNegative = 0, countNegative = 0, max = ArrayList[0], sumEvenNegative = 0, countPositive = 0;
        double avgNegative = 0;
        for (int i = 0; i < ArrayList.length; i++) {
            //максимальное значение
            if (i > 0 & max < ArrayList[i]) {
                max = ArrayList[i];

            }
            //остальное
            if (ArrayList[i] > 0) {
                sumPositive += ArrayList[i];
                countPositive++;
            } else {
                sumNegative += ArrayList[i];
                if (ArrayList[i] != 0) {
                    countNegative++;
                }
                if (ArrayList[i] % 2 == 0) {
                    sumEvenNegative += ArrayList[i];
                }
            }
        }
        if (countNegative != 0) {
            avgNegative = (double) sumNegative / countNegative;
        }
        System.out.print("максимальное значение = " + max +
                "\nсумма положительных элементов = " + sumPositive +
                "\nсумма четных отрицательных элементов = " + sumEvenNegative +
                "\nколичество положительных элементов = " + countPositive +
                "\nсреднее арифметическое отрицательных элементов = " + avgNegative);
    }

    //девятое задание
    public static void nine() {
        int k;
        int[] ArrayList = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        for (int i = 1; i < ArrayList.length / 2 + 1; i++) {
            k = ArrayList[i - 1];
            ArrayList[i - 1] = ArrayList[ArrayList.length - i];
            ArrayList[ArrayList.length - i] = k;
        }
        for (int i = 0; i < ArrayList.length; i++) {
            System.out.print(ArrayList[i] + " ");
        }
    }

    //десятое задание
    public static void ten() {
        int k = 0;
        int[] ArrayList = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        for (int i = 0; i < ArrayList.length - 1 - k; i++) {
            if (ArrayList[i] == 0) {
                for (int j = i; j < ArrayList.length - 1; j++) {
                    ArrayList[j] = ArrayList[j + 1];
                }
                ArrayList[ArrayList.length - 1 - k] = 0;
                k++;
            }

        }
        for (int i = 0; i < ArrayList.length; i++) {
            System.out.print(ArrayList[i] + ", ");
        }
    }
}
