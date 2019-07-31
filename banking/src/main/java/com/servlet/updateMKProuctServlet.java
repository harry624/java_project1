package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class updateMKProuctServlet
 */
@WebServlet("/updateMKProuctServlet")
public class updateMKProuctServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateMKProuctServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		int updatedEntities = session.createQuery("Update MKProduct set " +
												"name = :name, " + 
												"minBalance = :minBalance, " +
												"maxBalance = :maxBalance, " +
												"compound_Day = :compound_Day, " +
												"minimum_Deposit = :minimum_Deposit, " +
												"offering_Date = :offering_Date, " +
												"expiration_Date = :expiration_Date " +
												"where id = :id ")
				.setParameter("name", request.getParameter("name"))
				.setParameter("minBalance", Integer.parseInt(request.getParameter("minBalance")))
				.setParameter("maxBalance", Integer.parseInt(request.getParameter("maxBalance")))
				.setParameter("compound_Day", Integer.parseInt(request.getParameter("compound_Day")))
				.setParameter("minimum_Deposit", Integer.parseInt(request.getParameter("minimum_Deposit")))
				.setParameter("offering_Date", DateUtil.getFormattedDate(request.getParameter("offering_Date")))
				.setParameter("expiration_Date", DateUtil.getFormattedDate(request.getParameter("expiration_Date")))
				.setParameter("id", Integer.parseInt(request.getParameter("id")))
				.executeUpdate();

		session.getTransaction().commit();
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("<div class=\"alert alert-success\" role=\"alert\">update success</div>");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./moneyMarket.jsp");
		dispatcher.include(null, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
