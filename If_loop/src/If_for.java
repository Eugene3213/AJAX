
public class If_for {

	public static void main(String[] args) {
		final int a=1;			
		/*final�� ���� ���� > ����� ����
		 * ���: ���� ������ �ʴ� ��	 */
		final String name ="ȫ�浿";
		
		//System.out.println(name);
		//System.out.println(a);
	
		
		final int ct =3;				//������
		int f;							//�ݺ���
		boolean ok =false;				//���ǿ� ���� true,false;
		
		for(f=1;f<=10;f++) {
			
			if(f==ct) {		//�ݸ� ���� �������� ���� ���
				System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�");
				ok =true;	//���ǿ� ���� ���� �����մϴ�
			}
			
		}
		if(ok==false) {		//���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ��� ��µǴ� �ڵ�.
			System.out.println("Ȯ���� ���� �ʴ� ���� �Դϴ�");
		}
		
		
		
		/* �� 20���� ���� �ݺ�. �� �� Ȧ������ ��� */
		
		int ff;
		String odd="";				//odd:Ȧ�� even:¦��
		for(ff=1;ff<=20;ff++) {
			
			if(ff % 2 != 1) {
				System.out.print(ff+" ");
			}
			else {						//���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰�
				odd+=ff + " ";			//�߰� �� ��� " " ������� Ȯ���Ͽ� ����
			}
		}
		System.out.println(odd);
		
	}

}
