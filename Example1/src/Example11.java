
public class Example11 {

	public static void main(String[] args) {

		
		/* q. 
		 * 3���� ��ǰ
		 * "���ڵ�� ��ǰ�� �Է½����ּ���" �ݾ��� �Է��ϰ� ����
		 * "���� %�� �Է����� �ּ���"��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ� 
		 * �����ݾ��� ���� �Ǿ� ��µǵ��� �մϴ�.		 */
		
		int money =10000;
		int coupon =20;
		double a = coupon * 0.01;
		System.out.println(a);
		double b = money *a;
		System.out.println(b);
		double c = money -b;
		System.out.println(c);

	}

}
