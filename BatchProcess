import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcess {

	public static void main(String[] args) throws SQLException {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	 
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","1234Java");
		 
		 Statement stmt=con.createStatement();
		 
		 String insertquery="insert into student values(401,'2025-03-25',25)";
		 stmt.addBatch(insertquery);
		 
		 String updatequery="update student set name='kia' where usn=201";
		 stmt.addBatch(updatequery);
		 
		 String deletequery="delete from student where usn=101";
		 stmt.addBatch(deletequery);
		 
		 int[] res=stmt.executeBatch();
		 
		 System.out.println("executed");
		
	 } catch (ClassNotFoundException e) {
		e.printStackTrace();
	 }
	}
}
