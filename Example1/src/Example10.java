import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {

		/*Q. ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�. ���� �׸��� ��ü 3�����̸�, ��� true�� ���� �Ǿ�߸� ���� ���μ����� ������ �˴ϴ�.
		 * ����ڿ��� ���� �Ǵ� ������ ������ �����ϴ�.
		 * "�����׸� �����Ͻðڽ��ϱ�?" ��� �޼��� ��� ������(1), ���Ǿ���(2)
		 * 
		 * ���� �׸��� �Ѱ����� �������� ���� ���
		 * "��� ���� �ϼž߸� ���� �˴ϴ�." ��� ����մϴ�.
		 * ��� ���� �Ͽ��� ���
		 * "ȸ�������� �Ϸ� �Ǿ����ϴ�" ��� ����մϴ�.	 */

		
		/*����Scanner sc=new Scanner(System.in);
		
			//System.out.println("�����׸� �����Ͻðڽ��ϱ�? ������(1) ���Ǿ���(2)");
				
				int num=1;  //Ƚ��
				
				
				do {
					int a=sc.nextInt();
						System.out.println("�����׸� �����Ͻðڽ��ϱ�? ������(1) ���Ǿ���(2)");
										
					num++;
				}while(num<4);
		
				boolean yn= true;
				if(yn==true) {
					System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
				}
				
				else	{
					System.out.println("��� ���� �ϼž߸� ���� �˴ϴ�.");
				}
				sc.close();   */
		
		
		Scanner sc =new Scanner(System.in);
		
		int w=1;
		int agree;
		
		boolean all_agree = false;
		
		do {
			System.out.println("�����׸� �����Ͻðڽ��ϱ�? ������(1) ���Ǿ���(2)");
			agree =sc.nextInt();
			
			
			if(agree==1) {
				all_agree =true;
			}
			else {
				all_agree = false;
				break;
			}
						
			w++;
		}while(w<=3);
		
		if(all_agree==false) {
			System.out.println("��� �����ϼž߸� ���� �����մϴ�");
		}
		else {
			System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�");
		}
		
		sc.close();
		
	}

}
