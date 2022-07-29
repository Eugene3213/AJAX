package ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex2.do")	//web.xml 절대 추가하면 안됨
public class ex2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ex2() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		PrintWriter pr =response.getWriter();
			String mid=request.getParameter("mid");
			String mpass=request.getParameter("mpass");
			//intern은 checkbox, radio에는 사용하지 않음
			String msex=request.getParameter("msex");
			String sms=request.getParameter("sms");
		
		if(sms==null) {
			sms="N";
		}
		
		response.setContentType("text/html; charset='utf-8';");
			pr.print(mid+"<br>");
			pr.print(mpass+"<br>");
			pr.print(msex+"<br>");
			pr.print(sms);
	
	}

}
