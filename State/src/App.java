
public class App {

	public static void main(String[] args) {
		/*�ջ� ������ �� ���� ���� ����Ͻÿ�
			1. 25+31*4+12 
			2. 15*3+9+14 */
			
		int a = 25+31*4+12;
		int b = 15*3+9+14;
		//System.out.println(a,b�Է�); �� ����
		
		if(a > b)
			System.out.println("���� 2�� ���� �۽��ϴ�");
			else if (a < b)
				System.out.println("���� 1�� ���� �۽��ϴ�");
		else
			System.out.println("�� ���� �����ϴ�");
		
		
		
		/* �ش簪�� 2������ ¦��, Ȧ���� Ȯ���ϱ� */
		
		int a1 = 11%2;			// %��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ����� �˴ϴ�.
								// System.out.println(a1);
		
		if(a1==0)
			System.out.println("¦�� �Դϴ�");
		else
			System.out.println("Ȧ�� �Դϴ�");
		

	}

}
