package Cache;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static DBUtils instance = null;
	private static Connection _cnn = null;

	private String url = "jdbc:sqlserver://DESKTOP-G8FN8CR\\\\SQLEXPRESS:1433;databaseName=designpattern";

	private String username = "sa";

	private String password = "123";

	private DBUtils() throws SQLException {

		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			_cnn = DriverManager.getConnection(url, username, password);
			
			System.out.println("Ket noi thanh cong!! ");

		} catch (ClassNotFoundException ex) {

			System.out.println("Database Connection Creation Failed : " + ex.getMessage());

		}

	}
	
	public static DBUtils getInstance() {
		try {
			if (instance == null || instance.getConnection().isClosed()) {
				instance = new DBUtils();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return instance;
	}

	public Connection getConnection() {
		return _cnn;
	}
}
