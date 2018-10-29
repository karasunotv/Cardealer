package com.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
 * Servlet implementation class CarDetails
 */
@WebServlet("/carDetails")
public class CarDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession();
		
		
		for (Car myCar : Inventory.getCarList()) {
			if(myCar.getId() == id)
			{
				LocalDate localDate = LocalDate.parse(myCar.getPurchaseDate(),
						DateTimeFormatter.ofPattern("MM/dd/yyyy"));
				LocalDate todayDate = LocalDate.now();
				LocalDate discountDate = localDate.plusDays(120);
					
				if(todayDate.isAfter(discountDate)) {
					 myCar.setPrice(myCar.getPrice()*0.9);
				}
				session.setAttribute("myCar", myCar);
				break;
			}
		}
	
		RequestDispatcher rs = request.getRequestDispatcher("myCar.jsp");
		rs.forward(request, response);
	
		
	}

	
		/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
