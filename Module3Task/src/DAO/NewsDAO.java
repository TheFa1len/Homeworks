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
import Pool.DataSource;

public class NewsDAO {
	public static final String SQL_SELECT_ALL = "SELECT * FROM news";
	public static final String SQL_CREATE = "INSERT INTO news VALUES (?,?,?,?,?,?)";

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

	public List<News> findAll() {
		List<News> news = new ArrayList<>();
		Connection cn = null;
		Statement st = null;
		try {
			try {
				cn = DataSource.getInstance().getConnection();
			} catch (IOException | PropertyVetoException e) {
				e.printStackTrace();
			}
			st = cn.createStatement();
			ResultSet resultSet = st.executeQuery(SQL_SELECT_ALL);
			while (resultSet.next()) {
				News item = new News();
				item.setHeadtext(resultSet.getString("headtext"));
				item.setAnnotation(resultSet.getString("annotation"));
				item.setAuthor(resultSet.getString("author"));
				item.setDate(resultSet.getDate("release"));
				item.setId_categories(resultSet.getInt("id_categories"));
				item.setMaintext(resultSet.getString("maintext"));
				news.add(item);
			}
		} catch (SQLException e) {
			System.err.println("SQL exception (request or table failed): " + e);
		} finally {
			close(st);
		}
		return news;
	}

	public boolean create(News entity) {
		Connection connection = null;
		try {
			try {
				connection = DataSource.getInstance().getConnection();
			} catch (IOException | PropertyVetoException e) {
				e.printStackTrace();
			}
			PreparedStatement statement = connection.prepareStatement(
					SQL_CREATE, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, entity.getHeadtext());
			statement.setString(2, entity.getAnnotation());
			statement.setString(3, entity.getAuthor());
			statement.setDate(4, entity.getDate());
			statement.setString(5, entity.getMaintext());
			statement.setInt(6, entity.getId_categories());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection);
		}
		return true;
	}
}
