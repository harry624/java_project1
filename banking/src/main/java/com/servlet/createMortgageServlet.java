package com.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.MortgageProduct;
import com.service.DateUtil;
import com.service.HibernateUtil;

/**
 * Servlet implementation class createMortgageServlet
 */
@WebServlet("/createMortgageServlet")
public class createMortgageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createMortgageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		System.out.println("DATE: " + request.getParameter("offering_Date"));
		System.out.println("DATE: " + request.getParameter("expiration_Date"));
		
		
		boolean fixed_Mortgage = request.getParameter("fixed_Mortgage").equals("yes") ? true : false;
		
		MortgageProduct product = new MortgageProduct(fixed_Mortgage, 
													Integer.parseInt(request.getParameter("duration")), 
													Double.parseDouble(request.getParameter("apr")), 
													Double.parseDouble(request.getParameter("points")),
													Double.parseDouble(request.getParameter("origination_Fee")),
													Double.parseDouble(request.getParameter("minimum_Payment")), 
													Integer.parseInt(request.getParameter("maximum_Amount")), 
													DateUtil.getFormattedDate(request.getParameter("offering_Date")), 
													DateUtil.getFormattedDate(request.getParameter("expiration_Date")));
		
		System.out.println("send direct");
		response.sendRedirect("https://www.google.com");
		
		session.save(product);
		session.getTransaction().commit();
		

		
//		response.setContentType("text/html;charset=UTF-8");
//		response.getWriter().write("<div class=\"alert alert-success\" role=\"alert\">create success</div>");
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("mortgage.jsp");
//		dispatcher.forward(null, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
