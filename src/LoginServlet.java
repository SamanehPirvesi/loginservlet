import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/DoLogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us=new UserService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getParameter("username"));
//		if (us.isUserCorrect(request.getParameter("username"),request.getParameter("password"))==true) {
//			response.sendRedirect(request.getContextPath()+"/Profile");
//		}
//		else {
//			response.sendRedirect(request.getContextPath()+"index.html");
//		}
//		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String s=request.getParameter("username");
		String s1=request.getParameter("password");
		if (us.isUserCorrect(s,s1)==true) {
			RequestDispatcher rds= request.getRequestDispatcher("Profile");
			rds.forward(request, response);
			}
		else {
			response.sendRedirect(request.getContextPath()+"/index.html");
		}
		
	}

}
