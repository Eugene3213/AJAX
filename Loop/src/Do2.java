
public class Do2 {

	public static void main(String[] args) {
		
		int a=1;				//�ݺ��� ���ʰ�
		int b=9;				//��� ������
		int c;
		
		do {
			c= a*b;
			//System.out.print(c + " ");
			a++;
		}while(a<10);
		
		
		/*Q. ���� ������� ���� do while������ �ڵ带 �ۼ��Ͻÿ�. 
		 		35, 45, 55, 65, 75 	*/
		//1
		int a1=4;
		int b1=10;
		int c1;
		
		do {
			c1=a1*b1-5;
			//System.out.print(c1 + " ");
			a1++;
		}while(a1 <=8);
		
		//2
		int a2=3;
		int b2;
				
		do {
			b2=(a2*10)+5;
			System.out.print(b2 + " ");
			a2++;
		}while(a2 <=7);
		
	}

}
