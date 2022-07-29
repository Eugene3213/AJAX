package ex;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex4.do")
public class ex4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ex4() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String tel = request.getParameter("usertel");
		//System.out.println(tel);
		response.setContentType("text/html; charsets='utf-8'");
		
		if(tel=="" || tel ==null) {
			response.getWriter().print("error");
		}else {
			
			String sc ="";
			Random rd =new Random();
			int w=1;
			while(w<=5) {
				int i = rd.nextInt(10);
				sc += i;
				w++;
			}
			//System.out.println(sc);
			response.getWriter().print(sc);
		}
		/*응용문제
		 다섯 자리 인증번호를 생성하여 회신해주도록 합니다*/
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
