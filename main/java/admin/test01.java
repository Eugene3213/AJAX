package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;




public class test01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public test01() {

    }

	public void init(ServletConfig config) throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		JSONObject jo =new JSONObject();
		response.setContentType("text/html, charset=utf-8");
		
		PrintWriter pr= response.getWriter();
		String s = request.getParameter("sdate");
		String e = request.getParameter("edate");
//		pr.print(s);
//		pr.print(e);
		
		pr.print("ok");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
