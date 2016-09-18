package DAO;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.News;
import Model.Users;
import Pool.DataSource;

public class UsersDAO {
	public static final String SQL_SELECT_ALL = "SELECT * FROM users";
	public static final String SQL_CREATE = "INSERT INTO users VALUES (?,?,?,?,?,?)";
	public static final String SQL_FIND_BY_ID = "SELECT * FROM users WHERE email = ?";
	public void close(Statement st) {
		try {
			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {
		}
	}

	public void close(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
		}
	}
	public List<Users>  findAll(){
		List<Users> news = new ArrayList<>();
		Connection cn = null;
		Statement st = null;
		try{
			try{
				cn=DataSource.getInstance().getConnection();
			} catch (IOException | PropertyVetoException e) {
				e.printStackTrace();
			}
			st = cn.createStatement();
			ResultSet resultSet = st.executeQuery(SQL_SELECT_ALL);
			while (resultSet.next()) {
				Users item = new Users();
				item.setEmail(resultSet.getString("email"));
				item.setName(resultSet.getString("name"));
				item.setSurname(resultSet.getString("surname"));
				item.setPass(resultSet.getString("pass"));
				news.add(item);
			}
		}
		 catch (SQLException e) {
				System.err.println("SQL exception (request or table failed): " + e);
			} finally {
				close(st);
			}
			return news;
	}
	public Users findEntityById(String email) {
		Users item = new Users();
		Connection connection = null;
		try {
			try {
				connection = DataSource.getInstance().getConnection();
			} catch (IOException | PropertyVetoException e) {
				e.printStackTrace();
			}
			PreparedStatement statement = connection.prepareStatement(SQL_FIND_BY_ID);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				item.setEmail(resultSet.getString("email"));
				item.setName(resultSet.getString("name"));
				item.setSurname(resultSet.getString("surname"));
				item.setPass(resultSet.getString("pass"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection);
		}
		return item;
	}

}
