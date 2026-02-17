package midterm.pp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import midterm.pp.model.MidtermApp;

import java.io.IOException;

//import com.pp.week2.assign1.Register;

/**
 * Servlet implementation class midtermServlet
 */
@WebServlet("/MidtermServlet")
public class MidtermServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MidtermServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

		
		// the information from midtermForm.jsp is request here.
		String fullName = request.getParameter("fullName");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String date = request.getParameter("dateAvailable");
		String salary = request.getParameter("salary");
		
		// just converts the string into double
		Double sal = Double.valueOf(salary);
	
		
		// the information from midtermForm.jsp is set into MidtermApp.java
		MidtermApp mt = new MidtermApp();
		mt.setFullName(fullName);
		mt.setContact(contact);
		mt.setEmail(email);
		mt.setDateAvailable(date);
		mt.setSalary(sal);
		
		
		
		
		
//		try {
//			regDao.register(rt);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		response.sendRedirect("SuccessPage.jsp");
		
		
		
		
		
		
		
		
		

		
		
		
		
	}

}
