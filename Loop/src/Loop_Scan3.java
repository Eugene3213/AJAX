import java.util.Scanner;

public class Loop_Scan3 {

	public static void main(String[] args) {
		
		/* Scanner�� �Բ� do while������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�. */
		
		Scanner sc = new Scanner(System.in);
			System.out.println("���ϴ� �������� �Է��Ͻÿ�");
		int gugu = sc.nextInt();
		int w=1;
		int aws;
		
			do {
				aws=w*gugu;
				System.out.print(aws + " ");
				w++;
			}while(w<=9);
		
		
			sc.close();
	}

}
