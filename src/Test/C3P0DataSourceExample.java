package Test;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Pool.DataSource;
import DAO.CategoriesDAO;
import DAO.NewsDAO;
import DAO.UsersDAO;
import Model.Categories;
import Model.News;
import Model.Users;

public class C3P0DataSourceExample {

    public static void main(String[] args) throws PropertyVetoException, SQLException, IOException {
        NewsDAO p1= new NewsDAO();
        System.out.println(p1.findAll());
        UsersDAO p2= new UsersDAO();
        System.out.println(p2.findAll());
        System.out.println(p2.findEntityById("admin@admin.com"));
        News n1 = new News();
        n1.setHeadtext("hillary falls again");
        n1.setAnnotation("yes,again");
        Date date = new Date(0);
        n1.setDate(date);
        n1.setAuthor("admin");
        n1.setMaintext("all saw how she fall again");
        n1.setId_categories(3);
        p1.create(n1);
        CategoriesDAO dao = new CategoriesDAO();
        System.out.println("genre: " + dao.findEntityById("politics"));
    }
}