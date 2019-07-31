package com.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.MKProduct;
import com.service.DateUtil;
import com.service.HibernateUtil;

/**
 * Servlet implementation class createMKProuctServlet
 */
@WebServlet("/createMKProuctServlet")
public class createMKProuctServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createMKProuctServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction	transcation = session.beginTransaction();

//		System.out.println("DATE: " + request.getParameter("offering_Date"));
//		System.out.println("DATE: " + request.getParameter("expiration_Date"));
//		
//		System.out.println("minB: " + request.getParameter("minBalance"));
	    	
		MKProduct product = new MKProduct(Integer.parseInt(request.getParameter("minBalance")), 
				request.getParameter("name"), 
				Integer.parseInt(request.getParameter("maxBalance")), 
				Integer.parseInt(request.getParameter("compound_Day")), 
				Integer.parseInt(request.getParameter("minimum_Deposit")), 
				DateUtil.getFormattedDate(request.getParameter("offering_Date")), 
				DateUtil.getFormattedDate(request.getParameter("expiration_Date"))
				);
		
		session.save(product);
		transcation.commit();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
