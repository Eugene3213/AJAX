import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
			System.out.println("���� �� ���̵� �Է����ּ���");
		String user =sc.nextLine();
		chatclient cc =new chatclient(user);
	}
}
class chatclient{
	static final String ip ="192.168.100.172";
	static final int port =9009;
	Socket sk= null;
	InputStream is =null;
	OutputStream os =null;
	String message =null;
	String result =null;
	
	public chatclient(String mid) {
		try {
			System.out.println(mid+ "�� ���� �ϼ̽��ϴ�");
			this.sk =new Socket(this.ip,this.port);
			this.is =this.sk.getInputStream();
			this.os =this.sk.getOutputStream();
				System.out.println("ä�� ������ �Է� �ϴ� �ڵ�");
		
			this.message =mid + "����";
			this.os.write(this.message.getBytes());
			this.os.flush();
				
			while(true) {
				byte[] data= new byte[4096];
				int n =this.is.read(data);
				this.result = new String(data,0,n);
					System.out.println(this.result);
			}	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}