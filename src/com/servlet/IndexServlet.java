package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Car;
import com.user.Inventory;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		List<Car> carList = null;
		carList =  Inventory.init();
		HttpSession session = request.getSession();
		
		session.setAttribute("carList", carList);
		System.out.println("Car List"+carList);
		
		List<Car> carList1 = null;
		carList1 =  Inventory.init1();
		HttpSession session1 = request.getSession();
		
		session1.setAttribute("carList1", carList1);
		System.out.println("Car List"+carList1);
		
		List<Car> carList2 = null;
		carList2 =  Inventory.init3();
		HttpSession session2 = request.getSession();
		
		session2.setAttribute("carList2", carList2);
		System.out.println("Car List"+carList2);
		
		RequestDispatcher rs = request.getRequestDispatcher("myIndex.jsp");
		rs.forward(request, response);

		
		
		//delete incase 10-20
		
		
		/**
		List<Car> carList1 = null;
		carList1 =  Inventory.init1();
		HttpSession session1 = request.getSession();
		
		session1.setAttribute("carList1", carList1);
		System.out.println("Car List"+carList1);
		
		RequestDispatcher ss = request.getRequestDispatcher("myIndex.jsp");
		ss.forward(request, response);
		
		
		
		//delete incase
		/**
		List<Car> carList2 = null;
		carList1 =  Inventory.init1();
		HttpSession session2 = request.getSession();
		
		session2.setAttribute("carList2", carList2);
		System.out.println("Car List"+carList2);
		
		RequestDispatcher ts = request.getRequestDispatcher("myIndex.jsp");
		ts.forward(request, response);*/	
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
