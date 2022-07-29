package ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ex3.do")
public class ex3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    
    public ex3() {
      
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("./ex3.html").forward(request, response);
		//getRequestDispatcher: Servlet에서 해당 파일을 로드할때. forward(요청, 답변)
		request.setCharacterEncoding("utf-8");
			String mid =request.getParameter("mid").intern();
			String mpass =request.getParameter("mpass").intern();
		response.setContentType("text/html; charset='utf-8';");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
