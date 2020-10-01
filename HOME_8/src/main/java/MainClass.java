import java.sql.*;
import java.util.Scanner;

public class MainClass {

    public static final String SQL = "SELECT * FROM ACCOUNTS";
    private static final String address = "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './schema.sql'\\;RUNSCRIPT FROM './data.sql'";

    public static void main(String[] args) {
        Double amount;
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.h2.Driver");

            try {
                connection = DriverManager.getConnection(address);
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SQL);
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                AccountService accountService = new AccountService(connection, statement, preparedStatement, resultSet);
                accountService.printAccounts();

                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.println("Input operation and account(Or exit ) : ");
                    String request = sc.nextLine();
                    if (request.equals("")) {
                        break;
                    }
                    if (request.equals("exit")) {
                        break;
                    }
                    String[] words = request.split(" ");
                    int id = Integer.parseInt(words[1]);
                    String acc = words[0];
                    System.out.println(words[0] + " " + id);
                  // использую else if  так как со String, case не работает почему-то
                    try {
                        if (words[0].equals("balance")) {
                            accountService.balance(id);
                        } else if (words[0].equals("withdraw")) {
                            amount = Double.parseDouble(words[2]);
                            accountService.withdraw(id, amount);
                        } else if (words[0].equals("deposit")) {
                            amount = Double.parseDouble(words[2]);
                            accountService.deposit(id, amount);
                        } else if (words[0].equals("transfer")) {
                            amount = Double.parseDouble(words[3]);
                            int id_to = Integer.parseInt(words[2]);
                            accountService.transfer(id, id_to, amount);
                        } else {
                            System.out.println("Неизвестная операция");
                        }
                    } catch (UnKnownAccountException e) {
                        System.out.println(" Нет такого счёа: " + e);
                    } catch (NotEnouthMoneyException e) {
                        System.out.println(" Недостаточно денег на счёте: " + e);
                    }
                }
            } finally {
                statement.close();
                connection.close();

            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        } catch (
                ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}



