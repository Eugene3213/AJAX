import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		/* 1. */
		byte a = 10;
		
		if(a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���");
		}
			else if(a >= 10 || a <= 22) {								//���ǹ��� ������ �����Ͽ� ������
				System.out.println("��÷�Դϴ�");
		}	
			else {
				System.out.println("���� ���� ���� �Դϴ�");
		}
		
		
		/* 2. */
		//Q.1~45 ���� �ϳ��� �Է��ϼ���
		/*error��� : 0�Է� > �����Է��� �߸� �Ǿ����ϴ�
					45���� ū ���� �Է� > ���ڴ� 1~45������ �Է� �����մϴ�
					7,12,14 ������ ���ڰ� �Էµ� �� ��÷�Դϴ�. ���. �� ���� ���ڽ� ������ȸ�� �����ϼ��� ��� */
		Scanner a1 = new Scanner(System.in);
			System.out.println("Q.1~45 ���� �ϳ��� �Է��ϼ���");
		
		int b1 = a1.nextInt();
		
		if(b1 == 0) {												
			System.out.println("���� �Է��� �߸� �Ǿ����ϴ�");
		}
		else if(b1 > 45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�");
		}
		else if(b1 >=1 && b1 <=45) {
			
			if(b1 == 7 || b1 == 12 || b1 == 14){
				System.out.println("��÷�Դϴ�");
			}
			else {
				System.out.println("���� ��ȸ�� �����ϼ���");
			}
			a1.close();
		}
	}
}
	/*
		if(b1 == 0) {
			System.out.println("���� �Է��� �߸� �Ǿ����ϴ�");
		}	
		else if(b1 > 45) {
				System.out.println("���ڴ� 1~45������ �Է� �����մϴ�");
		}		
		else {
			if(b1 == 7 || b1 == 12 || b1 == 14)
						System.out.println("��÷�Դϴ�");
			else 
						System.out.println("���� ��ȸ�� �����ϼ���");
			*/


