import java.sql.*;

public class JDBCsample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/trymimi";
        String user = "root";
        String password = "18991948";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from mimi")) {

            while (rs.next()) {

                System.out.printf("%d %s %d%n",
                
                rs.getInt("id"), rs.getString("name"),
                        //  rs.getString("type")
                        rs.getInt("age"));
            }
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
