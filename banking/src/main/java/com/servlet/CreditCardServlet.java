package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.CreditCardProduct;
import com.service.HibernateUtil;

/**
 * Servlet implementation class CreditCardServlet
 */
@WebServlet("/CreditCardServlet")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditCardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction	transcation = session.beginTransaction();
		
		List<CreditCardProduct> list = (List<CreditCardProduct>) session.createQuery("FROM CreditCardProduct").list();
		
		response.setContentType("text/html;charset=UTF-8");

		for (CreditCardProduct product : list) {
			response.getWriter().write("<tr class=\"ccList\">");
			response.getWriter().write("<th scope=\"row\">" + product.getId() + "</th>");
			response.getWriter().write("<td>" + product.getType() + "</td>");
			response.getWriter().write("<td>" + product.getAPR() + "</td>");
			response.getWriter().write("<td>" + product.getCredit_Limit() + "</td>");
			response.getWriter().write("<td>" + product.getReward_Eligible() + "</td>");
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
