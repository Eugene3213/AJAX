
public class If {

	public static void main(String[] args) {
		
		// a10 b100
		
		byte a = 100;
		byte b = 100;
		
		
		// if ���ǹ�
			if(a > b)     //if��
				System.out.println("a���� �� Ů�ϴ�");
				else if (a < b)    //else if��
					System.out.println("b���� �� Ů�ϴ�");
				else			   //else��
					System.out.println("�� ���� �����ϴ�");
			
			
		/* else���� ���� ��� (else if ������ ��� ����) */
			if(a < b)
				System.out.println("a���� �� Ů�ϴ�");
				else if(a < b)
					System.out.println("b���� �� Ů�ϴ�");
				else if(a ==b)
					System.out.println("�� ���� �����ϴ�");
			
		/* �ε�ȣ��ȣ " < , > , <= , >= , == */
	}
	

}
