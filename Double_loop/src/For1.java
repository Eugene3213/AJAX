
public class For1 {

	public static void main(String[] args) {

		/* ������ 2~3�� ���	*/
		
		int f, ff;				//�ݺ����� ����� ���� ������ �̸� �Ͽ���.
		
		for(f=2;f<=3;f++) {		//ū �ݺ��� 2~3������ ȸ����.
			
			for(ff=1;ff<=9;ff++) { //���� �ݺ��� 1~9���� ȸ����
				
				//System.out.println(f + "*" + ff);	//�ش� ���� �ݺ����� �۵��� �� ���� ����� �����.
			}
		}
		
		
		/* Q. ������ 5~7�ܱ��� ����� �ϵ�, 4������ ���������� ������ ���ı��� ����Ͻÿ�. 
		 	5*1 ~ 7*4 �ش� ������� �� �հ踦 ����ϼ���. =180       */
		
		int a, aa;
		int total=0;
		
		for(a=5;a<=7;a++) {
			
			for(aa=1;aa<=4;aa++) {
				total = total + (a*aa);
				System.out.printf("%d*%d ",a,aa);
			}
			
		}
		System.out.println(total);
		
		
	}
}
