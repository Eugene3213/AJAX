import java.util.Scanner;		//import : java�� �ִ� ������ �ε��� �� ����ϴ� ���
								//export " java�� �ִ� ������ ������ �� ����ϴ� ���
								//java.util ��Ű�� �ȿ� Scanner Ŭ���� �κ��� �ε���.
								//java.util ��Ű���� �׳� ������� ���ϸ� new�� �Ҵ��Ͽ� �����ڸ� ����ؾ� �մϴ�. ��, �ش� �ڵ� ��ġ�� �ۼ��ڵ庸�� �Ʒ��� ������ �ȵ˴ϴ�.
public class If4 {

	public static void main(String[] args) {
		
		//new : ��ü�� �����ϴ� ��
		Scanner a = new Scanner(System.in);
			//system.in(�Է�) != system.out(���)
		
		System.out.println("���̵� �Է��ϼ���");
		
		String mid = a.next();
			//next() : ����ڰ� �Է��ϴ� ���� (����,���ڸ� �Է� �޴� ����)
		System.out.println(mid);

		a.close();
	}

}
