import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
	/* 1. */
		
		Scanner mid = new Scanner(System.in);
			System.out.println("������ ���̵� �Է��ϼ���:");
		String m = mid.next();		//����ڰ� ���̵� �Է�
		
		Scanner mpass = new Scanner(System.in);
			System.out.println("�н����带 �Է��ϼ���:");
		String p = mpass.next();	//����ڰ� �н����� �Է�
mid.close();
mpass.close();
			//System.out.printf("���̵�: %s , �н�����: %s" , m , p);
	/* 2. */
		/*ȸ������ ���̵�� jung, su
		 * �н�����
		 * jung: j1234
		 * su: ssh
		 * �ش� ���̵� �ܿ� �������� "���Ե��� ���� ����� �Դϴ�." ���
		 * ���� �н����尡 Ʋ����� "ȸ�������� �ٽ� Ȯ���ϼ���." ��� 
		 * ���̵� �� �н����尡 ��� ���� ��� "�α��� �Ǽ̽��ϴ�" ���
		 */	
		
		if(m.equals("jung") || m.equals("su")) {
			if(m.equals("jung") && p.equals("j1234")) {
				System.out.println("�α��� �Ǽ̽��ϴ�");
			}
			else if(m.equals("su") && p.equals("ssh")) {
				System.out.println("�α��� �Ǽ̽��ϴ�");
			}
			else {
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���");
			}
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�");
		}
	}
}
	
		
		
		
		
		
	
	
		

