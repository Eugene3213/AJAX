
public class For_Plus {

	public static void main(String[] args) {
			
		/*1~10 ��� ���ڸ� ���� ������� ����Ͻÿ�*/
		
		int f;
		int total=0;
		
		for(f=1;f<=10;f++) {				//total�������� �ݺ����� ���������� ������Ŵ
			//total = total +f;
			total+=f;
		}
			System.out.println("���հ�:"+total);
	
			// b = b - f;   ---->  b -= f;
			//+=(���ϱ��Ҵ�), -=(�����Ҵ�) , *=(���ϱ��Ҵ�), /=(�������Ҵ�)
			
			
		/* Q. ��ü���� 500�� �ֽ��ϴ�. �� 8ȸ ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��Ҷ����� 12�� �����ϵ��� �Ͽ� �������� ���. */
			
		int alls = 500;
		int m =12;
		int w;
		
		for(w=0;w<=8;w++) {
			alls=alls-m;
		}		
		System.out.println(alls);
	
		/* Q. ������ 2�� 2*1 ~ 2*9������ �� �հ踦 ����Ͻÿ�. ����;90 */
	
	
	
	
	
	}	

}
