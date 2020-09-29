package TASK1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение:");
        double A, B;
        String in = sc.nextLine();
        String op = "";


        try {
            in = in.replaceAll("\\r+", "");
            String[] strings = in.split("\\V", 2);
            int c = in.indexOf('+');
            if (c > -1) {
                strings = in.split("\\+", 2);
                op = "+";
            }
            c = in.indexOf('-');
            if (c > -1) {
                strings = in.split("-", 2);
                op = "-";
            }
            c = in.indexOf('*');
            if (c > -1) {
                strings = in.split("\\*", 2);
                op = "*";
            }
            c = in.indexOf('/');
            if (c > -1) {
                strings = in.split("/", 2);
                op = "/";
            }
            A = Double.parseDouble(strings[0]);
            B = Double.parseDouble(strings[1]);

            System.out.println("Введите путь: ");
            TypeLogger type = null;
            try {
                type = TypeLogger.valueOf(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Неправильный путь " + e);
            }
            if (type != null) {
                Logger logger = null;
                switch (type) {
                    case DB:
                        logger = new DataBaseLogger();
                        break;
                    case File:
                        logger = new FileLogger();
                        break;
                    case Console:
                        logger = new ConsoleLogger();
                        break;
                    default:
                }

                switch (op) {
                    case "*":
                        Calculator.multiplication(A, B, logger);
                        break;
                    case "+":
                        Calculator.add(A, B, logger);
                        break;
                    case "-":
                        Calculator.minus(A, B, logger);
                        break;
                    case "/":
                        Calculator.division(A, B, logger);
                        break;
                    default:
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка данных: " + e);
        }

    }

}
