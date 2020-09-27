package DZ7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        double amount;
        // Загрузка счетов
        Path p = Paths.get("C:/X5/accounts.txt");
        if (Files.exists(p) == false) {


            //   FileInputStream inputStream = new
            Files.createFile(p);
            try (PrintWriter writer = new PrintWriter(new FileWriter("c:/X5/accounts.txt"))) {
                for (int i = 1; i <= 10; i++) {
                    Account account = new Account(i + 1, "Artem" + i, (Double) (31.0 + i));
                    writer.println(account.id + "|" + account.Holder + "|" + account.Amount);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        Account[] accounts = new Account[10];
        try (BufferedReader reader = new BufferedReader(new FileReader("c:/X5/accounts.txt"))) {
            for (int i = 0; i < 10; i++) {
                String str = reader.readLine();
                System.out.println(str);
                String[] arr = str.split("\\|");

                accounts[i] = new Account(Integer.valueOf(arr[0]), arr[1], Double.valueOf(arr[2]));

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // Запрос на данные по счёту
        Scanner in = new Scanner(System.in);
        System.out.print("Input : ");
        String request = in.nextLine();
        String[] words = request.split(" ");
        int id = Integer.parseInt(words[1]);
        System.out.println(words[0] + " " + id);
        AccountService_Tmpl accountService = new AccountService_Tmpl(accounts);
        try {
            switch (words[0]) {
                case "balance":

                    accountService.balance(id);
                    break;
                case "withdraw":
                    amount = Double.parseDouble(words[2]);
                    accountService.withdraw(id, amount);
                    write_account(accounts);
                    break;

                case "depozit":
                    amount = Double.parseDouble(words[2]);
                    accountService.deposit(id, amount);
                    write_account(accounts);
                    break;
                case "transfer":
                    amount = Double.parseDouble(words[3]);
                    int id_to = Integer.parseInt(words[2]);
                    accountService.transfer(id, id_to, amount);
                    write_account(accounts);
                    break;
            }
        } catch (UnKnownAccountException e) {
            System.out.println(" Нет такого счёа: " + e);
        } catch (NotEnouthMoneyException e) {
            System.out.println(" Недостаточно денег на счёте: " + e);
        }
    }

    public static void write_account(Account[] accounts) throws IOException {

        try (PrintWriter writer = new PrintWriter(new FileWriter("c:/X5/accounts.txt"))) {
            for (Account ac : accounts) {
                //  Account account = new Account(i + 1, "Artem" + i, (Double) (31.0 + i));
                writer.println(ac.id + "|" + ac.Holder + "|" + ac.Amount);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}




