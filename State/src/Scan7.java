import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		
		
		/*���빮�� [������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�]
Q.�������� ��ȣ�� �Է��ϼ̳���?

���� 220524

����ڰ� ���� 220524 �ܿ� �Է½�
"������ȣ�� Ʋ���ϴ�." ��� ���
������ ������ȣ ���ڸ� �Է½� "����Ȯ�� �Ǽ̽��ϴ�."��� ���

��, 220524�� java����� ���� ���� ����Ǵ� ������ ó�� */
		
		int sc = 220524;
		Scanner mid = new Scanner(System.in);
		System.out.println("Q. �������� ��ȣ�� �Է��ϼ̳���?");
		int m = mid.nextInt();
		
		if(sc == m) {
			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
		}
		else {
			System.out.println("������ȣ�� Ʋ�Ƚ��ϴ�.");
		}
        mid.close();
        
	}

}
