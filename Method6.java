import java.util.Arrays;

public class Method6 {

	public static void main(String[] args) {
		/*HW.
		 �����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ����Դϴ�. �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ�ϴ� (Y,N)���� ����.
		 �ش簪�� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1�� �迭�� �籸�� �� ���ο��� ��� �ǵ��� �մϴ�.
		 ��� : [���Ϲ��,����������,���ڽ�,�̺�Ʈ,�߼�]		 
		 ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 */
		menus mn=new menus();
		String yn =mn.sub();
		String mn2[]= yn.split(",");
			System.out.println(Arrays.toString(mn2));
	}

}
class menus{
	private String arrays[][];
	
	
	public menus() {
		String ms[][]= {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.arrays=ms;
	}
	public String sub() {
		
		int w=0;
		int e=this.arrays[0].length;
		String result[] =new String[5];
		String yn;
		
		while(w<e) {
			if(this.arrays[1][w].equals("Y")) {
				
				yn=this.arrays[0][w];
			}
		
			w++;
		}
		return 
	}










}

