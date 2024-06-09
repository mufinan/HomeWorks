package Week6;

    import java.sql.*;
    public class JDBC {
        // Veritabanı bağlantı bilgileri
        static final String DB_URL = "jdbc:mysql://localhost/mufinan"; // Veritabanı URL'si
        static final String USER = "root";
        static final String PASS = "440616";

        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try {
                // Veritabanına bağlanma
                conn = DriverManager.getConnection(DB_URL, USER, PASS);

                // SQL sorgusu
                stmt = conn.createStatement();
                String sql;
                sql = "SELECT id, name, position, salary FROM employees";
                ResultSet rs = stmt.executeQuery(sql);

                // Verileri ekrana yazdırma
                while (rs.next()) {
                    // Sütun değerlerini al
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String position = rs.getString("position");
                    double salary = rs.getDouble("salary");

                    // Verileri ekrana yazdır
                    System.out.print("ID: " + id);
                    System.out.print(", Name: " + name);
                    System.out.print(", Position: " + position);
                    System.out.println(", Salary: " + salary);
                }
                // ResultSet, Statement ve Connection nesnelerini kapat
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException se) {
                // JDBC hatalarını ele al
                se.printStackTrace();
            } catch (Exception e) {
                // Diğer hataları ele al
                e.printStackTrace();
            } finally {
                // Bağlantıyı kapat
                try {
                    if (stmt != null) stmt.close();
                } catch (SQLException se2) {
                } // nothing we can do
                try {
                    if (conn != null) conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }


