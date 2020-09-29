package TASK2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // Создание компьютера методом Фасад
        System.out.println(" Фасад");
        Computer computer = new Computer();
        computer.createComputer();
        System.out.println(" ");

        System.out.println("Стратегия ");
        //Стратегия
        Strategy strategy = new Strategy();
        strategy.setComponents(new CPU(2000, 8, 8192, "NONE", "ASUS"));
        strategy.createComponent();
        strategy.setComponents(new HDD("ASUS", 8192, TypeHDD.SSD, TypeFactorHDD.SFF));
        strategy.createComponent();
        strategy.setComponents(new Monitor("Samsung"));
        strategy.createComponent();
        strategy.setComponents(new VC("NONE", TypeRAMVC.DDR, 1024, Cooling.active));
        strategy.createComponent();
        strategy.setComponents(new RAM("ASUS", 2048, 1000, TypeRAM.DDR2));
        strategy.createComponent();
        System.out.println(" ");

        System.out.println("Фабрика ");
        // Фабрика
        System.out.println("\n Вводите компонент для создания:");
        Scanner comp = new Scanner(System.in);
        String component = comp.nextLine();
        FactoryComponents create = null;
        switch (component) {
            case "CPU":
                create = new CreateCPU();
                break;
            case "RAM":
                create = new CreateRAM();
                break;
            case "VC":
                create = new CreateVC();
                break;
            case "HDD":
                create = new CreateHDD();
                break;
            case "Monitor":
                create = new CreateMonitor();
                break;
            default:
                System.out.println("Компонент не найден");
        }
        if (create != null) {
            Components compon = create.createComponent();
            compon.output();
        }


    }
}
