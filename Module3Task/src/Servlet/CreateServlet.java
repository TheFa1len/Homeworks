package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.CategoriesDAO;
import DAO.NewsDAO;
import DAO.UsersDAO;
import Model.Categories;
import Model.News;
import Model.Users;

@WebServlet(name = "CreateServlet", urlPatterns = "/CreateServlet")
public class CreateServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		News item = new News();
		HttpSession session = request.getSession(false);
		CategoriesDAO dao1 = new CategoriesDAO();
		List<Categories> genres = dao1.findAll();
		request.setAttribute("genres", genres);
		String i1 = request.getParameter("headtext");
		String i2 = request.getParameter("annotation");
		String i4 = request.getParameter("maintext");
		item.setHeadtext(i1);
		/*
		 * Map<Integer,String> categories = (Map<Integer,String>)
		 * getServletContext().getAttribute("genres"); Integer id =
		 * Integer.parseInt(request.getParameter("g.id_categories")); cat =
		 * dao1.findEntityById(request.getParameter("g")); int i =
		 * cat.getId_categories();
		 */
		int id = Integer.parseInt(request.getParameter("genre"));
		item.setAnnotation(i2);
		item.setAuthor(session.getAttribute("name").toString());
		item.genDate();
		item.setId_categories(id);
		item.setMaintext(i4);
		NewsDAO dao = new NewsDAO();
		dao.create(item);
		RequestDispatcher rd = request.getRequestDispatcher("news.jsp");
		rd.forward(request, response);

		out.close();
	}
}