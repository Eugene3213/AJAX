import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		/* Q. while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�.
		 * ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
		 * "7000 �����Ͻðڽ��ϱ�?" ��� ��µǸ�, ���� 1�̶�� �Է��ϸ� �������� �ݾ׿� �߰� �Ǿ� ���ϴ�.
		 * ��, 2��� �Է½� �������� �ݾ׿� �߰� �Ǿ����� �ȵ˴ϴ�. 
		 * 
		 * �� ���� Ƚ���� �׹� �Դϴ�.
		 * �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int a=1;
		
		int user;
		int total=0;
		
			while (a<=4) {
				System.out.println("7000�� �����Ͻðڽ��ϱ�?");
			
				user=sc.nextInt();
				total=total+user;
				
				a++;
			}
			System.out.println("�����ݾ���:"); */

			
			Scanner sc = new Scanner(System.in);
			final int money = 7000;
			int a=1;
			
			int user;
			int total=0;
			
				while (a<=4) {
					System.out.println("7000�� �����Ͻðڽ��ϱ�?");
					user=sc.nextInt();
				
					if(user==1) {
						total =total + money;
					}
					
					a++;					
				}	
				System.out.println("�����ݾ���:" + total);
			
				sc.close();
			
			
			
	}

}
