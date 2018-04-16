import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Home extends HttpServlet
{
	String password;
        @Override
        public void doGet(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException
{
PrintWriter out = response.getWriter();
	RequestDispatcher rq=request.getRequestDispatcher("index.html");
	rq.include(request,response);
}


}