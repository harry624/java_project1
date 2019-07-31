package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.service.DateUtil;
import com.service.HibernateUtil;

/**
 * Servlet implementation class updateMortgageServlet
 */
@WebServlet("/updateMortgageServlet")
public class updateMortgageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateMortgageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.println("update mortgage called");
		int updatedEntities = session.createQuery("Update MortgageProduct set" + 
												  "Fixed_Mortgage = :Fixed_Mortgage " +
												  "Duration = :Duration " + 
												  "APR = :APR " + 
												  "Points = :Points " + 
												  "Origination_Fee = :Origination_Fee " +
												  "Min_payment = :Min_payment " +
												  "Max_amount = :Max_amount" +
												  "Offering_Date = :Offering_Date " +
												  "Expiration_Date = :Expiration_Date " +
												  "where id = :id")
				.setParameter("Fixed_Mortgage", request.getParameter("fixed_Mortgage").equals("yes") ? true :false)
				.setParameter("Duration", Integer.parseInt(request.getParameter("duration")))
				.setParameter("APR", Double.parseDouble(request.getParameter("apr")))
				.setParameter("Points", Double.parseDouble(request.getParameter("points")))
				.setParameter("Origination_Fee", Double.parseDouble(request.getParameter("origination_Fee")))
				.setParameter("Min_payment", Double.parseDouble(request.getParameter("min_payment")))
				.setParameter("Max_amount", Integer.parseInt(request.getParameter("max_amount")))
				.setParameter("Offering_Date", DateUtil.getFormattedDate(request.getParameter("offering_Date")))
				.setParameter("Expiration_Date", DateUtil.getFormattedDate(request.getParameter("expiration_Date")))
				.setParameter("id", Integer.parseInt(request.getParameter("id")))
				.executeUpdate();
		
		session.getTransaction().commit();
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("<div class=\"alert alert-success\" role=\"alert\">update success</div>");
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("mortgage.jsp");
//		dispatcher.include(null, response);

		response.sendRedirect("/banking/mortgage.jsp");

						
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
