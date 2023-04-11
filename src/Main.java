import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/giodb", "developer", "developer");
            Statement statement = connection.createStatement();

            statement.executeUpdate("alter table students add column country varchar(30)");
            statement.executeUpdate("update students set country = 'italy' where student_id = 1");
            statement.executeUpdate("update students set country = 'italy' where student_id = 2");
            statement.executeUpdate("update students set country = 'germany' where student_id = 3");
            statement.executeUpdate("update students set country = 'germany' where student_id = 4");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}