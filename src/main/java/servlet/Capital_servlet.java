package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clientWS_NC.CapitalConverter;

/**
 * Servlet implementation class Capital_servlet
 */
@WebServlet("/Capital_servlet")
public class Capital_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Capital_servlet() {
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
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		CapitalConverter client = new CapitalConverter();

		String value = request.getParameter("value").toString();
//		String type = request.getParameter("type").toString();
		PrintWriter out = response.getWriter();
		if(value.equals("")){
			out.write("error: Please, provide a value!");  
		}else{
			String result = "";
			
			result = client.getCapital(value);
			
			out.write(result); 			
		}
					 
		out.flush();
	    out.close(); 	
	}

}
