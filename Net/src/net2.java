import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/* ���� ������ �������� 
TCP(���� ��������): ���� �ӵ��� ���� , UDP(����� ������ ��������): ���� �ӵ��� ���� */
/* PORT(TCP)
80 : WEB(http://)
21 : FTP(���� ����)
22 : SSH - Linux, Unix (��������, �����ܺ�����)
23 : TELNET - Window(�����ܺ�����)
443 : WEB(https://)
25 : SMTP(mail) - ���� ������ 
110 : POP3(���� ����) - ����, ���� (�񵿱�ȭ)
143 : IMAP(���� ����) - ����, ���� (������ ����ȭ)		 */
/*	SNMP : UDP (���ڹ߼۽ý���) */
public class net2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
			System.out.println("������ ���� �� �̹��� �ּҸ� �Է��� �ּ���");
		String url =sc.next();
		
		URL u = new URL(url);	//URL(Ŭ����) : ��Ʈ��ũ ��θ� ���մϴ�	
		URLConnection con = u.openConnection();	//�ش� ��θ� ����
			//System.out.println(con);
		int imgsize = con.getContentLength();	//IndexOf ��� -1(����), �� �ܿ��� ������ Ȯ����
			//System.out.println(imgsize);
		String imgtype =con.getContentType();	//���� �Ӽ��� Ȯ���ϴ� �κ�
			//System.out.println(imgtype);
		long date =con.getDate();		//���� ��¥ �ε�
			//System.out.println(date);
		
		//openStream : URL������ ���
		InputStream	is = u.openStream();	//URL���� ������ �о�� �� ���
		BufferedInputStream bi= new BufferedInputStream(is);	//URL���� ���� ������ �ӽ�����
		byte data[] = new byte[1024];	//1024=1KB �ش� ������ ������
		FileOutputStream fo =new FileOutputStream("copy.mp4");	//��������
		int imgdata=0;
		int cnt=0;		//�ݺ���
		while((imgdata=bi.read(data))!=-1){
			fo.write(data,0,imgdata);	//������ ������ �ٿ��ֱ� �ϴ� ����
			cnt+= imgdata;	//1024++
			System.out.println("�ٿ�ε� ��...." + (cnt*100)/imgsize + "%");
		}
		fo.flush();
		fo.close();
			System.out.println("�ٿ�ε� �Ϸ�");
		
	}

}
