package in.ineuron.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils {

	private static Connection connection = null;
	

	public static Connection getMySQLConnection() {
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\pwskills_advanced_java\\FirstJDBCApp\\src\\in\\ineuron\\resources\\application.properties");
			Properties properties = new Properties();
			properties.load(fis);

			// Establish the connection
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");

			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established..." + connection);
			return connection;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeResources(Statement statement, ResultSet resultSet, Connection connnection) {
		try {
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
