
public class Example6 {

	public static void main(String[] args) {

		/* Q. 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�. ��, 1~5������ ��� ���� ���ϰ�, 6~10������ ��� ���� ���մϴ�.
		 * �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���� ���� ū���� ����� ����Ͻÿ�.		 */

		
		/* ����
		int a; 
		int sum=1;
		int sum1=0;
			for(a=1;a<=10;a++) {
				
				if(a<=5) {
					sum=a*sum;
				}
				
				else if (a>=6) {
					sum1=a+sum1;
				}
				
			}
			
			if(sum>sum1) {
				System.out.println(sum);
			
			}
			else if(sum<sum1){
				System.out.println(sum1); 
			}			*/

			
			
			int w=1;
			int total =0;
			int total2=1;
			while(w<=10) {
				
				if(w<=5) {
					total2=total2*w;
				}
				else {
					total=total+w;
				}
				w++;
			}
			
			if(total2 < total) {
				System.out.println("���Ѱ��� Ů�ϴ�.");
			}
			else if (total2 > total) {
				System.out.println("���Ѱ��� Ů�ϴ�.");
			}
			else {
				System.out.println("�� �񱳰��� �����ϴ�.");
			}
			
			
			
			
			
	}

}
