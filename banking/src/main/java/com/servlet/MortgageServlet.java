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

import com.model.MortgageProduct;
import com.service.HibernateUtil;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;


/**
 * Servlet implementation class MortgageServlet
 */
@WebServlet("/MortgageServlet")
public class MortgageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MortgageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			List<MortgageProduct> list = session.createQuery("FROM MortgageProduct").list();
		
			response.setContentType("text/html;charset=UTF-8");

			for (MortgageProduct product : list) {
				response.getWriter().write("<tr>");
				response.getWriter().write("<th scope=\"row\">" + product.getId() + "</th>");
				response.getWriter().write("<td>" + product.isFixed_Mortgage() + "</td>");
				response.getWriter().write("<td>" + product.getDuration() + "</td>");
				response.getWriter().write("<td>" + product.getAPR() + "</td>");
				response.getWriter().write("<td>" + product.getPoints() + "</td>");
				response.getWriter().write("<td>" + product.getOrigination_Fee() + "</td>");
				response.getWriter().write("<td>" + product.getMin_payment() + "</td>");
				response.getWriter().write("<td>" + product.getMax_amount() + "</td>");
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
