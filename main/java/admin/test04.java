package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class test04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



    public test04() {

        
    }

	public void init(ServletConfig config) throws ServletException {
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int pay= Integer.parseInt(request.getParameter("pay"));
		PrintWriter pr = response.getWriter();
		switch(pay) {
		case 0:
			response.sendRedirect("http://www.naver.com");
			//response.sendRedirect: 강제 페이지 이동
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			pr.print("<script>"
					+ "alert('현재 결제방식은 시스템 점검 중입니다');"
					+ "history.go(-1);"
					+ "</script>");
			break;
		case 4:
			break;
		}
	
	}

}
