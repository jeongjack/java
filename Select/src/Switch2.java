import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*���빮��
		 ����ڰ� ������ ���� ������ �޽��ϴ�
		 Q. "1~5������ ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.
		 ��� ����
		 1 : 5% ��������
		 2 : 10% ��������
		 3~4 : �ù�񹫷�
		 5 : ������ȸ��... 
		 */
		 Scanner sc = new Scanner(System.in);
		System.out.println("Q. 1~5������ ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.");
		int user = sc.nextInt();
		String msg;
		/*switch(user) {
		
		case 1:
			msg = "��5% ����������";
			break;
		case 2:
			msg = "��10% ����������";
			break;
		case 3:
	    case 4:
			msg = "�ù�񹫷�";
			break;
			default:
		    msg = "������ȸ��";
			break;
		}
		*/
		/* switch version����*/
		switch(user) {
		case 1 -> {
			msg = "5%��������";			
		}
		case 2 ->{
			msg = "10%��������";
		}
		case 3,4 ->{
			msg = "�ù�񹫷�";
		}
		default ->{
			msg = "������ȸ��";
		}
		
		}
		
		System.out.println(msg);
		sc.close();
		
		
		
				
	
	

	}

}
