import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	public static Connection getJDBCConnection() {
		final String url = "jdbc:mysql://45.32.112.83/app?useUnicode=true&characterEncoding=utf-8";
		final String user = "root";
		final String password = "Kythong12";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main (String[] args) {
		Connection connection = getJDBCConnection();
		if (connection != null) {
			System.out.println("Connection success");
		} else {
			System.out.println("Connection False");
		}
	}
}
