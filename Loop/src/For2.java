
public class For2 {

	public static void main(String[] args) {
		int a; 			//for�� �ʱⰪ
		int b=2; 		//���� ����
		int c;			//������ ����� ���
		//1~9
		for(a=1;a<=9;a++) {
			c=b*a;		//������� �۾�
			//System.out.print(c+",");	 //����� ������� �����
		}
		
		/* Q. ���� ������� ���� �ڵ带 �ۼ� �Ͻÿ�.
		 * 45,40,35,30,25,20		 */
		    
		int q;
		int w=5;
		int e;
		
		for(q=9;q>=4;q--) {
			e= w * q;
			//System.out.print(e+",");
		}
	
		/* Q. ���� ������� ���� �ڵ带 �ۼ� �Ͻÿ�.
		 	11,22,33,44,55,66,77,88,99	 */
		//1)
		int z;
		int x = 11;
		int v;
		
		for(z=1 ; z<=9 ; z++) {
			v = z * x;
			//System.out.print(v+",");
		}
		
		//2)
		int z1;
		int x1;
		
		for(z1=1;z1<=9;z1++) {
			x1 = (10*z1)+z1;
					System.out.print(x1+",");
		}
		
		
		
		
	}
}
