
public class If3 {

	public static void main(String[] args) {
		
		boolean ck = true; //boolean : true, false�� ����. �� �߿� �ϳ� ���� (exüũ�ڽ�)
		
		if(ck== true)
			System.out.println("ȸ�������� ���� �˴ϴ�");
		else
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�");
		
		
		
		//ex1) a1234 park�����
		
		String a = "park";
		String b = "a1234";
		
		if(a=="park" && b=="a1234")		//&& : �Ѱ��� ���� �̻� ��� ���� ��� (and)
			System.out.println("�α��� �ϼ̽��ϴ�");
		else
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���");

		
		if(a=="park" || a=="lee")		//|| : �Ѱ��� ���� �̻󿡼� �Ѱ��� ���� ��� (or)
		//if(a=="park" || b=="a1234") //�� �����߿� �Ѱ����� ���� ���
			System.out.println("ȸ���� Ȯ�εǾ����ϴ�");
		else
			System.out.println("Ȯ�ε� ���̵� �����ϴ�");
		
		
		
	
		
		

	}

}
