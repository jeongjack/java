
public class QWER1 {

	public static void main(String[] args) {
		/*���빮�� 
		 * �ջ� ������ �� ���� ���� ����Ͻÿ�.
		 * ����1 25+31*4+12
		 * ����2 15*3+9+14
		 * */ 
		
		int a = 25+31*4+12;
		int b = 15*3+9+14*10;
		
		if(a>b) {
			System.out.println("���� 2�� ���� �۽��ϴ�.");
		}
		else if(a<b) {
			System.out.println("1�� ���� �� �۽��ϴ�.");
		}
		else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		int c = b % 2;
		
		if(c==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
				
		
				
		
		
	}

}
