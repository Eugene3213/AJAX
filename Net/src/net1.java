import java.net.InetAddress;
import java.net.UnknownHostException;
/* Server(���Ӱ���) + Cilent(������)
 * P2P
 * �¶��� ä�� : Cilent ---> Server ����
 * 1:1 ä�� P2P
 * 
 * IP : ��Ʈ��ũ �ּ�
  -IPv4 : 0~225���� ���� 4��Ʈ 0.0.0.0 -> abc.co.kr(DNS)
  -IPv6 : 128bit ������ ���� 0:0:0:0:0:0:0:0			 */
public class net1 {
//UnknownHostException : HOST ������ Ȯ�� ���� ���� ���
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress: IPnetworkAddress
		//getByName  ;���� �� ������ �ּ�
		InetAddress ia = InetAddress.getByName("localhost");
			System.out.println(ia);
//			System.out.println(ia.getHostName());		//�����θ�
//			System.out.println(ia.getHostAddress());	//DNS�� ����� IP

		//getAllByName : �����ο� IP���� Ȯ�� (�迭�� �����ؾ� �մϴ�)
		InetAddress ia2[] =InetAddress.getAllByName("naver.com");
//			System.out.println(ia2[0].getHostAddress());
//			System.out.println(ia2[1].getHostAddress());
			System.out.println(ia2.length);		//�ش� DNS�� IP����
		int w=0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
	}

}