package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class mtest01 extends HttpServlet {
	PrintWriter pr = null;
	String key =null;
	private static final long serialVersionUID = 1L;
       

    public mtest01() {
    	this.key = null;
    }

	public void init(ServletConfig config) throws ServletException {

	}
	//url에 직접적으로 접속하였을 경우 doGet으로 작동하게 됨
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		this.pr =response.getWriter();
		if(this.key=="" || this.key==null) {	//해당 키 값은 기본으로  null로 처리
			this.pr.print("<script>"
					+ "alert('올바른 접근 방식이 아님');"
					+ "history.go(-1);"
					+ "</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.key = request.getParameter("key").intern();
		this.pr =response.getWriter();
		if(this.key=="" || this.key==null) {
			this.pr.print("<script>"
					+ "alert('올바른 접근 방식이 아님');"
					+ "history.go(-1);"
					+ "</script>");			
		}
		else if(this.key=="loginpost") { //키 값이 확인 되었을 경우
			String mid = request.getParameter("mid");
			String mpass =request.getParameter("mpass");
			//DataBase 연결
		}
		

	}

}
