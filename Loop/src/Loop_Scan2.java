import java.util.Scanner;

public class Loop_Scan2 {

	public static void main(String[] args) {
		/*Scanner�� �Բ� while������ ����ڰ� �Է��ϴ� ������ ������ ����� ����Ͻÿ�.	 */
	
		
		Scanner sc=new Scanner(System.in);
			System.out.print("���ϴ� �������� �Է��Ͻÿ�");
		int gugu=sc.nextInt();
		int w=1;
		int aws;
		
		while(w < 10) {
			aws = gugu * w;
			System.out.printf("%d ",aws);
			w++;
			
		}
		sc.close();
	}
}
