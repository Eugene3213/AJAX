import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {

	public static void main(String[] args) {
		chat ch =new chat();
		ch.chatserver();
	}

}
class chat{
	private int port = 8009;
	ServerSocket sk =null;
	Scanner sc = null;
	Socket so= null;
	InputStream is =null;
	OutputStream os =null;
	String mid =null;
	String msg =null;
	String cmsg=null;
	String check=null;
	public void chatserver() {
		try {
			this.sk =new ServerSocket(port);
			this.sc =new Scanner(System.in);
				System.out.println("���̵� �����Ͻÿ� ; ");
			this.mid = sc.next();
				System.out.println("ä�ù� ���� �Ǿ��������");
			
			while(true) {
				this.so=sk.accept();
				this.is=so.getInputStream();
				this.os =so.getOutputStream();
			
			byte data[] =new byte[1024];
			int n = this.is.read(data);
			this.msg = new String(data,0,n);
				System.out.println(this.msg);
				
			if(this.msg.indexOf("����")!=-1) {
				sk.close();
				sc.close();
				break;
			}
				
			this.sc =new Scanner(System.in);
				System.out.println("������ �Է��� ������");
			this.check=this.sc.nextLine().intern();
			this.cmsg ="[" + this.mid+ "]: " + this.check;
			this.os.write(this.cmsg.getBytes());
			this.os.flush();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}