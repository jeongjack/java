import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		int f;
		for(f=1; f<30; f++) {
			if(f == 10) {
				//System.out.println(f);
				break;      //break�� �ݺ����� ���� �����Ҷ� ����մϴ�.
			}
			//System.out.println(f);
		}
		/*
		���빮��8
		
		 ����� �н������ a1234 �Դϴ�.
		 ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��µǵ��� �մϴ�
		 "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�."
		 ��, �н����尡 ���� ��� "�α����� �Ǿ����ϴ�." ��� ��µǾ�� �մϴ�.		  
		 */
		final String pw = "a1234";
		int c = 3;
		Scanner sc = new Scanner(System.in);
		int w = 0;
		String msg = "�н����带 �Է��� �ּ���:";
		while(w < 3) {
			System.out.println(msg);
			String userpw = sc.next();
			if(pw.equals(userpw)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			break;
			}
			else {
				msg = "�ùٸ� �н����带 �־��ּ���.:";
				c--;
				if(c==0) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				}			
	}
				
			w++;
		}

        
		
		
	}

}
