
public class App {

	public static void main(String[] args) {
		
		//1.
		int a = 10;
		int b = 20;
		int c;   //��Ģ�����ȣ : +,-,*,/
		c = a + b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);
		
		c = b / a;
		System.out.println(c);
		
		//2.
		String a1 = "ȯ���մϴ�";
		String b1 = "ȫ�浿";
		String c1;
			c1=a1+b1; //���� �����϶� +�� ����+���ڿ��� ǥ���� �� ����.
			
				System.out.println(c1);
				
/*3. ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�.
 * 
 * ȫ�浿�� �������� 50000 �Դϴ�
 * ��, ȫ�浿�� 50000�� ���� ���������� ��ȭ�� �� �ִ�. */
				
				
			String q = "ȫ�浿";
			int w = 50000;
			
				System.out.println(q + "�� ��������" + w + "�Դϴ�");
				
		
/*4. �Ƹ��� ����Ʈ���� ��ǰ�� ���� �߽��ϴ�. 
 * ��ٱ��Ͽ� ���� ��ǰ ������ ��� ���ؼ� �� ���� �ݾ��� ��µǵ��� �Ͻÿ�. ��, $ ��ȣ�� ���.
 * 
 * 8.25
 * 4.02
 * 3.71
 * 
 * ��� ���� ������ ���� ����ϼ���
 * �� �����ݾ� $(     ) �Դϴ�.
 */
				

				
				
				int k = 3;
				int j = 9;
				double aw = (double)k /j;  //���������� �ڷ��� ���� �ִ� �ڵ�
				System.out.println(aw);
				
		
	}

}
