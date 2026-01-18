import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc {



    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";

    
        String createTableQuery =
                "CREATE TABLE IF NOT EXISTS book (" +
                "book_id INT PRIMARY KEY AUTO_INCREMENT," +
                "title VARCHAR(150) NOT NULL," +
                "author VARCHAR(100)," +
                "category VARCHAR(50)," +
                "available_copies INT" +
                ")";
        
        String insertDataQuery =
                "INSERT INTO book (title, author, category, available_copies) VALUES " +
                "('The Great Gatsby', 'F. Scott Fitzgerald', 'Fiction', 5)," +
                "('To Kill a Mockingbird', 'Harper Lee', 'Fiction', 3)," +
                "('1984', 'George Orwell', 'Dystopian', 4)";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

            Statement stmt = con.createStatement();

        
            stmt.executeUpdate(createTableQuery);
            stmt.executeUpdate(insertDataQuery);
            System.out.println("Book table created successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
