import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/* ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�, ������ ����� ����Ͽ� ¦������ Ȧ�������� ����Ͻÿ�.
		 * "�����ܿ� ���� ���ڸ� �Է��ϼ���?" ��� �޼����� ��µǸ� �ش� ���ڿ� ���缭 ��� ����� ���ϸ�, ���� ���� ���� ¦������ Ȧ�������� ����Ͻø� �˴ϴ�.
		 * ��, �ش� �ݺ����� for~do while������ �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.	 */
		
		
		Scanner sc = new Scanner(System.in);
			
		int a=2;
		int user;
		
		int total=0;
		
			while (a<=9) {
				System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���?");
				user=sc.nextInt();
				
				total=total+user;
				
				a++;
			}
			System.out.println("�� �հ�: " +  total); 
		
		
		
		
		
		
		
		
	}

}
