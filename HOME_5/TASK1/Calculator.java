package TASK1;

public class Calculator {
    public static void add(double A, double B, Logger logger) {

            InputLog input = logger.log("");
            input.createLog();
            System.out.println(" " + (A + B));

    }

    public static void minus(double A, double B, Logger logger) {


            InputLog input = logger.log("");
            input.createLog();
            System.out.println(" " + (A - B));

    }
    public static void multiplication(double A, double B, Logger logger) {


            InputLog input = logger.log("");
            input.createLog();
            System.out.println(" " + (A * B));

    }
    public static void division(double A, double B, Logger logger) {

            InputLog input = logger.log("");
            input.createLog();
            System.out.println(" " + (A / B));

    }

}
