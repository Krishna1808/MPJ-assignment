package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentCRUD {

    public static void main(String[] args) {

        String url      = "jdbc:mysql://localhost:3306/school";
        String userName = "root";
        String password = "krishna"; 

       
        String insertQuery = "INSERT INTO students (name, age, email) " 
                           + "VALUES ('Krishnarenuse', 20, 'krishnarenuse@gmail.com')";

        String insertQuery2 = "INSERT INTO students (name, age, email) " 
                            + "VALUES ('Raj Modi', 22, 'rajmodi@gmail.com')";

        String selectQuery = "SELECT * FROM students";

        String updateQuery = "UPDATE students SET age = 21 WHERE name = 'Krishnarenuse'";

        String deleteQuery = "DELETE FROM students WHERE name = 'Raj Modi'";

        try {
            
            Connection conn = DriverManager.getConnection(url, userName, password);

       
            Statement st = conn.createStatement();

       
            st.executeUpdate(insertQuery);
            System.out.println("✅ Inserted: Krishnarenuse");

            st.executeUpdate(insertQuery2);
            System.out.println(" Inserted: Raj Modi");

          
            ResultSet rs = st.executeQuery(selectQuery);

        
            System.out.println("\n All Students:");
            while (rs.next()) {
                System.out.println(
                    "ID: "     + rs.getInt("id") +
                    " Name: "  + rs.getString("name") +
                    " Age: "   + rs.getInt("age") +
                    " Email: " + rs.getString("email")
                );
            }

            
            st.executeUpdate(updateQuery);
            System.out.println("\n Updated: Krishnarenuse age to 21");

    
            st.executeUpdate(deleteQuery);
            System.out.println(" Deleted: Raj Modi");

         
            rs = st.executeQuery(selectQuery);
            System.out.println("\n Final Students:");
            while (rs.next()) {
                System.out.println(
                    "ID: "     + rs.getInt("id") +
                    " Name: "  + rs.getString("name") +
                    " Age: "   + rs.getInt("age") +
                    " Email: " + rs.getString("email")
                );
            }

          
            conn.close();
            System.out.println("\n Connection Closed!");

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}