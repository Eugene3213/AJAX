
public class For1 {

	public static void main(String[] args) {
		/*�ݺ��� :�����͸� �ϰ������� ����� �� �� �ֵ��� �ϴ� ���� */
		
		//int z = 1;
		//z++;  > +1 ���� : ��� �� +1 ���� ex1,2,3,4
		//z--;  > -1 ���� : ��� �� -1 ����
		//++z;  > +1 ���� : +1 ���� �� ��� ex2,3,4,5
		//--z;  > -1 ���� : -1 ���� �� ���
		//System.out.println(z);
		
		for(int a = 0; a< 100; a++) { //for(�ʱⰪ;������;����or����)
			//System.out.println(a);
		}
		
		int b;
		for(b=5;b<=10;b++) {
			//System.out.println(b);
		}
		
		int c;
		for(c=10; c>3 ;c--) { //���ǻ���: c<3 0~�������� ���� ���������� ��Ȳ�� �߻���
			//System.out.println(c);
		}
		
		//Q, 20~27���� ���
		short d;
		for(d=20; d<=27 ;d++) {
			//System.out.print(d);
		}
		
		//Q. 39~21���� ���
		int e;
		for(e=39; e>=21 ; e--) {
			//System.out.print(e + ",");
		}
		//Q. 1~10���� ���� ���
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
			//System.out.print(aa+",");
		}
		/*Q. ���� �ΰ��� �̿��Ͽ� ���� �����͸� ����Ͻÿ�.
		55~4���� ��� */
		
		int cc;
		int dd=4;
		for(cc=55;cc>=dd;cc--) {
			System.out.print(cc+",");
		}
	}		
}

