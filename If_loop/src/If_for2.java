
public class If_for2 {

	public static void main(String[] args) {
		
		//1~100���� ���� �� 80�̻��� ���ڸ� ���
		int f;
		for(f=1;f<=100;f++) {
			
			if(f >=80) {
				//System.out.println(f+" ");
			}
		}

		//200~300���� ���� �� 240������ ���ڸ� ���
		
		int ff;
		for(ff=200;ff<=300;ff++) {
			
			if(ff<=240) {
				//System.out.println(ff+" ");
			}
		}
		
		//
		final int a =2;
		int w;
		for(w=1;w<=10;w++) {
			
			if(w %a ==0) {
				//System.out.printf("%d ",w);
			}
		}
		
		final int aa=3;
		int bb;
		for(bb=1;bb<=10;bb++) {
			
			if(bb % aa ==0) {
				//System.out.printf("%d ",bb);
			}
		}
		
		//Q. ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10 �̻� ���ڸ� ����մϴ�.
		
		final int g=2;
		int ww;
		int total;
		for(ww=2;ww<=9;ww++) {
			
			total=g*ww;
			if(total >= 10) {						//���� �߿�
				//System.out.printf("%d ", total);
			}
		}
		
		/*Q. ���� ������� ���� �ش� ���� ��� �ǵ��� �ڵ带 �����Ͻÿ�.
			18 36 54 72	*/
		
		int p;
		int total1;
		for(p=1;p<=9;p++) {
			total1 = 9*p;
	
			if(p%2 == 0) {
			//System.out.println(total1+ " ");
			}
		}
		
		/* Q. ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 * 1~20 ������ ���� �Դϴ�.
		 	6 14 17 19	 */
		
		int z;
		for(z=1;z<=20;z++) {
			
			if(z == 6 || z==14 || z==17 || z==19) {
				System.out.println(z+" ");
			}
		}
		
		
		
		
		
		
		
		
		
	}
}


