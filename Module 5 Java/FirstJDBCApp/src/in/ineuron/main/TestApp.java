package in.ineuron.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.ineuron.utils.JdbcUtils;

public class TestApp {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {

			connection = JdbcUtils.getMySQLConnection();

			// Send and execute the query
			statement = connection.createStatement();
			String sqlSelectQuery = "select sid,sname,sage,saddress from student";

			// process the result
			resultSet = statement.executeQuery(sqlSelectQuery);

			System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt("sage")
						+ "\t" + resultSet.getString("saddress"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// closing the resources
			JdbcUtils.closeResources(statement, resultSet, connection);
		}

	}
}
