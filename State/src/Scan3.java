import java.util.Scanner;



public class Scan3 {

	public static void main(String[] args) {
		
		/* ���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ� 
		 * Q : ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?
		 * ������� : ¦��, Ȧ�� ���Դϴ�.��� ���*/
		
		Scanner a = new Scanner(System.in);
			System.out.println("Q : ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?");
			int b = a.nextInt();  //cf) String mid = a.next(); ���� ������
		
			
		if(b % 2 == 0) {  // %�� ���� �����鼭 ���������� Ȯ���ϴ� �Լ�
			System.out.println("¦�� ���Դϴ�");
		}
		else {
			System.out.println("Ȧ�� ���Դϴ�");
		}
a.close();
	}

}
