import java.sql.*;

public class AccountService {
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public static final String sql_all = "SELECT * FROM ACCOUNTS";
    public static final String sql = "SELECT * FROM ACCOUNTS WHERE id = ?";
    public static final String sql_1 = "SELECT count(*) FROM ACCOUNTS WHERE id = ?";
    public static final String sql_2 = "UPDATE ACCOUNTS SET amount = ? WHERE id = ?";

    public AccountService(Connection connection, Statement statement, PreparedStatement preparedStatement, ResultSet resultSet) {
        this.connection = connection;
        this.statement = statement;
        this.preparedStatement = preparedStatement;
        this.resultSet = resultSet;
    }

    public void balance(int accountId) throws UnKnownAccountException, SQLException {

        try {
            preparedStatement = connection.prepareStatement(sql_1);
            preparedStatement.setInt(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            if (resultSet.getInt(1) == 0) {
                throw new UnKnownAccountException(accountId);
            } else {

            resultSet.close();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountId);
             resultSet = preparedStatement.executeQuery();
            System.out.println( "id =  " + accountId);
            if (resultSet.next()) {
                System.out.println("Баланс счета " + resultSet.getString(2) + ": " + resultSet.getInt(3));

            }
        }
        }catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void withdraw(int accountId, double amount) throws NotEnouthMoneyException, UnKnownAccountException, SQLException {

        try {
            preparedStatement = connection.prepareStatement(sql_1);
            preparedStatement.setInt(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            if (resultSet.getInt(1) == 0) {
                throw new UnKnownAccountException(accountId);
            } else {
                resultSet.close();
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, accountId);
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
                double amount_acc = resultSet.getDouble(3);
                if (amount_acc < amount) {
                    throw new NotEnouthMoneyException(amount_acc);

                } else {
                    resultSet.close();
                    preparedStatement = connection.prepareStatement(sql_2);
                    preparedStatement.setDouble(1, (amount_acc - amount));
                    preparedStatement.setInt(2, accountId);
                    preparedStatement.executeUpdate();
                    System.out.println("Остаток счёта " + (amount_acc - amount));
                    printAccounts();
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deposit(int accountId, double amount) throws UnKnownAccountException, SQLException {

        try {
            preparedStatement = connection.prepareStatement(sql_1);
            preparedStatement.setInt(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            if (resultSet.getInt(1) == 0) {
                throw new UnKnownAccountException(accountId);
            } else {
                resultSet.close();
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, accountId);
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
               double amount_acc = resultSet.getDouble(3);
                amount_acc = amount_acc + amount;
                resultSet.close();
                preparedStatement = connection.prepareStatement(sql_2);
                preparedStatement.setDouble(1, amount_acc);
                preparedStatement.setInt(2, accountId);
                preparedStatement.executeUpdate();
                System.out.println("Остаток счёта " + amount_acc );
                printAccounts();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void transfer(int from, int to, double amount) throws NotEnouthMoneyException, UnKnownAccountException, SQLException {

        try {
            preparedStatement = connection.prepareStatement(sql_1);
            preparedStatement.setInt(1, from);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            if (resultSet.getInt(1) == 0) {
                throw new UnKnownAccountException(from);
            } else {
                    resultSet.close();
                    preparedStatement = connection.prepareStatement(sql_1);
                    preparedStatement.setInt(1, to);
                    resultSet = preparedStatement.executeQuery();
                    resultSet.next();

                    if (resultSet.getInt(1) == 0) {
                        throw new UnKnownAccountException(to);
                    } else {
                        resultSet.close();
                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setInt(1, from);
                        resultSet = preparedStatement.executeQuery();
                        resultSet.next();
                        double amount_acc_1 = resultSet.getDouble(3);
                        if (amount_acc_1 < amount) {
                            throw new NotEnouthMoneyException(amount_acc_1);
                        } else {
                            resultSet.close();
                            preparedStatement = connection.prepareStatement(sql);
                            preparedStatement.setInt(1, to);
                            resultSet = preparedStatement.executeQuery();
                            resultSet.next();
                            double amount_acc_2 = resultSet.getDouble(3);
                            resultSet.close();
                            preparedStatement = connection.prepareStatement(sql_2);
                            preparedStatement.setDouble(1, (amount_acc_1 - amount));
                            preparedStatement.setInt(2, from);
                            preparedStatement.executeUpdate();
                            System.out.println("Остаток счёта " + from + " = " + (amount_acc_1 - amount));

                            preparedStatement = connection.prepareStatement(sql_2);
                            preparedStatement.setDouble(1, (amount_acc_2 + amount));
                            preparedStatement.setInt(2, to);
                            preparedStatement.executeUpdate();
                            System.out.println("Остаток счёта " + to + " = " + (amount_acc_2 + amount));
                            printAccounts();
                        }
                    }
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void printAccounts() throws SQLException {
        resultSet = statement.executeQuery(sql_all);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String holder = resultSet.getString(2);
            double amount = resultSet.getDouble(3);
            System.out.println(id + " | " + holder + " | " + amount);
        }
    }

}
