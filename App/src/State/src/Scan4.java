import java.util.Scanner;


public class Scan4 {

	public static void main(String[] args) {
		/* 1. */
		Scanner a = new Scanner(System.in);
		System.out.println("�Է��� ������ �����ּ���");
		
		//String b = a.next();					//next() :  �����̽��� �Է±����� ����
		String b = a.nextLine();				//nextLine() : �����̹� ���� ��� �Է�����
		System.out.println(b);
		
		a.close();						//a.close : Scanner ���� �Լ� > �⺻������ ���� ����� 
		
		/* 2. */
		//���� park ���� 25
		String mid = "park";			//String = %s
		int age = 25;					//int,byte,long,short (����) = %d
										//float,double = %f
										//date, time = %t
										//boolean = %b
		
		//=System.out.println(a1 + "���� ���̴�" + b1 + "�Դϴ�");
		System.out.printf("%s���� ���̴� %d �Դϴ�" , mid , age);				//printf(ormat)
		
		
	}

}
