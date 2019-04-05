package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbc {
	
	final static String CLASS_NAME = "com.mysql.jdbc.Driver";
	
	private static String DriverUrl = "jdbc:mysql://127.0.0.1:3306/pop_app_database";

	private static String userID = "root";

	private static String dbPassword = "";

	private static Connection con = null;

	private ConnectionJdbc() {
	}

	public static Connection getConnection() {
		try {
			if (con == null || con.isClosed()) {
				try {
					Class.forName(CLASS_NAME);
					con = DriverManager.getConnection(DriverUrl, userID, dbPassword);
					System.out.print("Database is connected !");
					System.out.println("IPv4 Address............: 192.168.1.108...lan,  192.168.1.19...wifi , new IP- 192.168.1.164...");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				return con;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection(Connection con) throws SQLException {
		if (con.isClosed() == false) {
			con.close();
		}
		con = null;
	}
}
