import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		String ip ="192.168.1.199";
		int port = 8009;
		Scanner sn =null;
		OutputStream os=null;
		InputStream is =null;
		Socket sc =null;
		try {
			 sc = new Socket(ip,port);
				System.out.println("���� ���� �Ǿ����ϴ�");
			 os = sc.getOutputStream();
			 is = sc.getInputStream();
			
			for(;;) {	//���������� ���Ͽ� ���� �ǵ��� �ϴ� ����
			sn = new Scanner(System.in);
				System.out.println("�Է��Ͻ� ������ �����ּ���:");
			String msg= sn.nextLine();
			
			os.write(msg.getBytes());
			os.flush();
			
			byte[] data =new byte[1024];
			int n = is.read(data);
			String cmsg =new String(data,0,n);
				System.out.println(cmsg);
			}
		}catch(Exception c) {
			if(c.getMessage()!=null) {
				System.out.println("���� ���� ��ְ� �߻� �Ͽ����ϴ�");		
			}
		}
		finally {		//Ŭ���̾�Ʈ�� ���� ����� �ش� ���� �� ���� Stream, Scanner ��� ����
			try {
				sc.close();
				sn.close();		
				os.close();
				is.close();
					System.out.println("����");
			}catch(Exception aa) {
				
			}
		}
	}

}
