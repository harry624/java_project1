package com.servlet;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.MKProduct;
import com.service.HibernateUtil;


/**
 * Servlet implementation class moneyMarketServlet
 */
@WebServlet("/moneyMarketServlet")
public class moneyMarketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public moneyMarketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction	transcation = session.beginTransaction();
		
		List<MKProduct> list = (List<MKProduct>) session.createQuery("FROM MKProduct").list();
		
		response.setContentType("text/html;charset=UTF-8");

		for (MKProduct product : list) {
			response.getWriter().write("<tr class=\"mmList\">");
			response.getWriter().write("<th scope=\"row\">" + product.getId() + "</th>");
			response.getWriter().write("<td>" + product.getName() + "</td>");
			response.getWriter().write("<td>" + product.getMinBalance() + "</td>");
			response.getWriter().write("<td>" + product.getMaxBalance() + "</td>");
			response.getWriter().write("<td>" + product.getCompound_Day() + "</td>");
			response.getWriter().write("<td>" + product.getMinimum_Deposit() + "</td>");
			response.getWriter().write("<td>" + product.getOffering_Date() + "</td>");
			response.getWriter().write("<td>" + product.getExpiration_Date() + "</td>");
			response.getWriter().write("</tr>");

		}
		
		session.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
