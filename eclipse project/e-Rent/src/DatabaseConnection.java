import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connectionUrl = "jdbc:mysql://localhost:3306/Rent";
		String connectionUser = "root";
		String connectionPassword = "17019000";
		conn = DriverManager.getConnection(connectionUrl, connectionUser,
		connectionPassword);
		stmt = conn.createStatement();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
	}		
		

	}



