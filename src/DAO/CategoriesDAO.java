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

import Model.Categories;
import Model.News;
import Model.Users;
import Pool.DataSource;

public class CategoriesDAO {
	public static final String SQL_FIND_BY_GENRE = "SELECT * FROM categories WHERE id_categories = ?";
	public static final String SQL_CREATE = "INSERT INTO categories VALUES (?,?)";
	public static final String SQL_SELECT_ALL = "SELECT * FROM categories";
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
	public List<Categories> findAll() {
		List<Categories> news = new ArrayList<>();
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
				Categories item = new Categories();
				item.setGenre(resultSet.getString("genre"));
				item.setId_categories(resultSet.getInt("id_categories"));
				news.add(item);
			}
		} catch (SQLException e) {
			System.err.println("SQL exception (request or table failed): " + e);
		} finally {
			close(st);
		}
		return news;
	}
	public Categories findEntityById(String email) {
		Categories item = new Categories();
		Connection connection = null;
		try {
			try {
				connection = DataSource.getInstance().getConnection();
			} catch (IOException | PropertyVetoException e) {
				e.printStackTrace();
			}
			PreparedStatement statement = connection.prepareStatement(SQL_FIND_BY_GENRE);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				item.setId_categories(resultSet.getInt("id_categories"));
				item.setGenre(resultSet.getString("genre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection);
		}
		return item;
	}
	public boolean create(Categories entity) {
		Connection connection = null;
		try {
			try {
				connection = DataSource.getInstance().getConnection();
			} catch (IOException | PropertyVetoException e) {
				e.printStackTrace();
			}
			PreparedStatement statement = connection.prepareStatement(SQL_CREATE, Statement.RETURN_GENERATED_KEYS);
			statement.setInt(1, entity.getId_categories());
			statement.setString(2, entity.getGenre());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(connection);
		}
		return true;
	}

}
