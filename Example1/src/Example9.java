import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {

		/* Q.
		 * A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�.
		 * "������ �Է��ϼ���?" ��� ������ �� 5��(Ƚ��)�� ������ �Ǹ�, ��� ������ �ջ�(�հ�)�Ͽ� ����մϴ�. do while �ۼ�		 */
		// �ջ� �� �� 5���� ������ ���� ��հ��� ����Ͻÿ�.  "��� ������ �ش� ������ ������:  "
		// ��, �ش� ������ 40�� ������ ��� "����� �Դϴ�." �޼����� ��� �� ���μ����� �����մϴ�. 40�� �̻��� ��� "�հ�"�̶�� �޼����� ����Ͻʽÿ�.
		
		// �߰���ȹ
		//�Է��Ͻ� ���� ���� �����ּ��� ��� ���� ���� ��� �� �ش����� ��ŭ �ݺ����� ������ �Ǹ� ����� ��ŭ ��հ��� ����Ǿ�� �մϴ�.
		
		
		/*���� Scanner sc=new Scanner(System.in);
	
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���.");
		
		
				int total=0;			//�հ�
				int num=1;				//Ƚ��
				
				int co ;                // �������
				int b = sc.nextInt();   // �Է� ���� �� 
				
				
				
				do {
					System.out.println("������ �Է��ϼ���?");
					int a=sc.nextInt();
					total=(total+a);
														
					num++;
					
				}while(num<=b);
		
				// System.out.println("�հ�: "+ total);
		  
		co = total / b;
		
		if(co < 40) {
			System.out.println("�ش� ������ ������ "+co+"�Դϴ�.");
			System.out.println("����� �Դϴ�.");
		}
		else {
			System.out.println("�ش� ������ ������ "+co+"�Դϴ�.");
			System.out.println("�հ� �Դϴ�.");
		}
		
		
		
		sc.close(); */
		
		
		Scanner sc =new Scanner(System.in);
		
			int w =1;
			int user;
			int total=0;
			
			while(w<=5) {
				System.out.println("������ �Է��� �ּ���: ");
				user =sc.nextInt();
				total = total +user;
				
				w++;
			}
			double avg = total /5;
			
				
				//System.out.println("���� ��� ������" + avg);
			String msg;
			if(avg<40) {
				msg="������Դϴ�.";
				
			}
			else {
				msg="�հ��Դϴ�.";
			}
			System.out.println("���� ��� ������: " + avg + "�� �̸�," + msg);
		
		sc.close();
		
		
	}

}
