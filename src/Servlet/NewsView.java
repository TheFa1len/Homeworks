package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

@WebServlet(name = "NewsView", urlPatterns = "/NewsView")
public class NewsView extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoriesDAO dao1 = new CategoriesDAO();
		List<Categories> genres = dao1.findAll();
		request.setAttribute("genres",genres);
		RequestDispatcher rd = request.getRequestDispatcher("create.jsp");
		rd.include(request, response);

/*		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("username");
		String p = request.getParameter("userpass");

		HttpSession session = request.getSession(false);
		UsersDAO dao = new UsersDAO();
		Users temp = dao.findEntityById(n);
		if (session != null)
			session.setAttribute("name", temp.getName());
		
		NewsDAO news = new NewsDAO();
		if (temp.getEmail().equals(n)) {
			List result = news.findAll();
			session.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("news.jsp");
			rd.forward(request, response);
		} else {
			out.print("<p style=\"color:red\">Sorry username or password error</p>");
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
		}
		
		out.close();*/
	}
}
