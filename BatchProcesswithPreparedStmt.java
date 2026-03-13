import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcesswithPreparedStmt {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306//backend","root","1234Java");
			
			PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
			pstmt.setInt(1,201);
			pstmt.setString(2,"2025-02-25");
			pstmt.setString(3,"aia");			
			pstmt.addBatch();
			int[]res=pstmt.executeBatch();
			
			PreparedStatement pstmt1=con.prepareStatement("update student set usn=? where usn=?");
			
			pstmt1.setInt(1,102);
			pstmt1.setInt(2,4);
			pstmt1.addBatch();
			int[]res1=pstmt1.executeBatch();
			System.out.println("executed");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	

	}

}
