import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 ���빮��9
		 A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�.
		 "������ �Է��ϼ���?"��� ������ �� 5���� ������ �Ǹ�,
		 ��� ������ �ջ��� �� 5���� ������ ���� ��հ��� ����մϴ�.
		 ��� �޼����� "�ش� ������ ������: " ���
		 ��, ���� ������ 40�� ���� �� ��� ������Դϴ�. ��� �޼�����
		 ��� �� ���μ����� �����մϴ�. 40�� �̻��� ��� "�հ�"�̶�� �޼�����
		 ����Ͻʽÿ�.
		 
		 [�߰���ȹ]
		 "�Է��Ͻ� ���� ���� �����ּ���: " ��� ���ϸ��� ��� ��
		 �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�, ���� �� ��ŭ ��հ��� ���� �Ǿ���մϴ�.
		 
		 for������ �Ұ� 
		 */
		/*Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���:");
		int a = sc.nextInt();
		int jumsu;
		int f;
		int total = 0;
		

		for(f=1;f<=5;f++) {
			System.out.println("������ �Է��ϼ���?");
			jumsu = sc.nextInt();
			total += jumsu;
		}
		//System.out.println("�ش� ������ ������: " +total);
		System.out.println("�ش� ������ ������: "+total / a);
        if(total / 5 <= 40) {
        	System.out.println("������Դϴ�.");
        }
        else {
        	System.out.println("�հ�"); 
        } */
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���.");
	    int subject = sc.nextInt();
		int w = 1;
		int user;
		int total=0;
		while(w<=subject) {
			System.out.println("������ �Է��� �ּ���: ");
			user = sc.nextInt();
			total = total + user;
			w++;
		}
		int avg = total / subject;		
		String msg;
		if(avg < 40) {
			msg = "������Դϴ�.";
		}
		else {
			msg = "�հ��Դϴ�.";
		}
		System.out.println("���� ��� ������" + avg +"�̸�,"+msg);
		sc.close();
		
	}

}
