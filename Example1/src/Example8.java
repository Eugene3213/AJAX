import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {

		/*Q. ����� �н������ a1234 �Դϴ�.
		 * ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��� �ǵ��� �մϴ�/
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�."
		 * ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� ��� �Ǿ�� �մϴ�.		 */

		
		//break;       �ݺ����� ���� ���� �ҋ� ���
	
		/*
		Scanner sc =new Scanner(System.in);
			System.out.println("�н����带 �Է��Ͻÿ�");
				String pass =sc.next();
			 
			int number=1;
			
			while(number>=1) {
				
				if(pass.equals("a1234")) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
				else if(number>=3){
					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
					break;
				
				}
					
					number++;
			}
		*/
			
		
		final String pw="a1234";
		int c =3;
		Scanner sc=new Scanner(System.in);
		int w=1;
		while(w <4) {
			System.out.println("�н����带 �Է��� �ּ���: ");
			
			String userpw =sc.next();
			
				if(pw.equals(userpw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
				
				else {
					
				}
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				w++;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
