
public class If_dowhile1 {

	public static void main(String[] args) {

		/*Q. ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�. */
		
		int a=1;
		int b=6;
		int c;
		
			do {
				c=b*a;
				if(c>35) {
					//System.out.println(" " + c);
				}
				a++;
			} while (a<=9);

		/*Q. 14~27���� ���� �� ¦������ ��� ���Ͽ� ���� ������� ����Ͻÿ�. */
			
		int aa=14;
		int bb=0;
		
			do {
				
				if(aa%2==0) {
					bb=bb+aa;
				}
				
				aa++;
			} while(aa<=27);
		
			System.out.println(" " + bb);
			
			
			
			
			
			
			

	}

}
