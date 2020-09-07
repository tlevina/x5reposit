package ru;
// Домашнее задание 2 T.Levina

import java.util.Scanner;

public class HomeTask_II {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        int num = in.nextInt();
        if (num == 1) one();
        if (num == 2) two();
        if (num == 3) three();
        if (num == 4) four();
        if (num == 5) five();
        if (num == 6) six();
        if (num == 7) seven();
        if (num == 8) eight();
        if (num == 9) nine();
        if (num == 10) ten();
    }
   // Первое задание
    public static void one() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int l;
        l = num%10;
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
            sum+=num%10;
            num/=10;
        } while(num!=0);

        System.out.printf("CСумма цифр: %d \n", sum);
        in.close();
    }

    //третье задание
    public static void three() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        if (num>0) {
            num++;
        }
        System.out.println(num);
    }

    //четвертое задание
    public static void four(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        System.out.println("Число: " + num);
        if (num > 0){
            num++;
        } else if (num<0){
                num -= 2;
        }
        else num = 10;

        System.out.println(num);
    }

    //пятое задание
    public static void five(){
        int min = 0, num;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i<4; i++) {
            System.out.println("Введите "+i+"ое число: ");
            num = in.nextInt();
            if (i==1){
                min = num;
            }
            if (min > num){
                min=num;
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
        if (num > 0 & num % 2 == 0) {

            System.out.println("положительное четное число");
        } else if (num < 0 & num % 2 == 0) {

            System.out.println("отрицательное четное число");
        } else if (num == 0) {

            System.out.println("нулевое число");
        } else if (num % 2 == -1) {

            System.out.println("отрицательное нечетное число");
        } else if (num % 2 == 1) {

            System.out.println("положительное нечетное число");
        }
    }
    //седьмое задание
    public static void seven() {
        boolean t = false;
        int[] number = {905, 194, 491, 800};
        double[] cost = {4.15, 1.98, 2.69, 5};
        String[] city = {"Москва", "Ростов", "Краснодар","Киров"};

        Scanner in = new Scanner(System.in);
        System.out.print("Введите код: ");
        int num = in.nextInt();

        for (int i = 0; i < number.length; i++){
            if (num == number[i]){
                System.out.print("Номер города : " + number[i] +
                        "\nгород : " + city[i] +
                        "\nцена : " + cost[i]*10);
                t=true;
                break;
            }
        }
       // if (!t) {System.out.print("Код не найден");}
    }

    //восьмое задание
    public static void eight() {
        int[] mas = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int sumPlus = 0,sumMinus= 0,minN=0, max=mas[0], sumChetMinus = 0, plusN = 0;
        double sr=0;
        for (int i = 0; i < mas.length; i++){
            //максимальное значение
            if (i>0 & max<mas[i]){
                max = mas[i];

            }
            //остальное
            if (mas[i]>0){
                sumPlus += mas[i];
                plusN++;
            }
            else {
                sumMinus +=mas[i];
                if (mas[i]!=0) minN++;
                if (mas[i]%2 == 0){
                    sumChetMinus += mas[i];
                }
            }
        }
        if (minN!=0){
            sr = (double) sumMinus/minN;
        }
        System.out.print("максимальное значение = " + max +
                "\nсумму положительных элементов = " + sumPlus +
                "\nсумму четных отрицательных элементов = " + sumChetMinus +
                "\nколичество положительных элементов = " + plusN +
                "\nсреднее арифметическое отрицательных элементов = " + sr);
    }

    //девятое задание
    public static void nine(){
        int k;
        int [] mas = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        for (int i = 1; i < mas.length/2+1; i++) {
            k = mas[i-1];
            mas[i-1] = mas[mas.length-i];
            mas[mas.length-i] = k;
        }
        for (int i=0; i< mas.length; i++) {
            System.out.print(mas[i]+" ");
        }
    }

    //десятое задание
    public static void ten() {
        int k = 0;
        int[] mas = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        for (int i = 0; i < mas.length-1-k; i++){
            if (mas[i] == 0){
                for (int j = i; j < mas.length-1; j++) {
                    mas[j] = mas[j + 1];
                }
                mas[mas.length-1-k] = 0;
                k++;
            }

        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
    }
}
