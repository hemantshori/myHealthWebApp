package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

private ValidationServices vs = new ValidationServices();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("email");
		String password = request.getParameter("password");

         if(vs.checkValidUSer(name, password))
         {
		request.setAttribute("name", request.getParameter("email"));
		request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/Views/welcome.jsp").forward(request, response);
         }else {
        	 request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
		}
        	 
        		 
        	 
		
	}

}
