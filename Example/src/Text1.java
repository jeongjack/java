import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		/* ���빮�� ���ǹ� �ڵ带 �ۼ��Ͻÿ�.
		
		 ���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�.
		 ���� �⺻ �ڻ�ݾ� : 100000
		 
		 "1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�."��� �޼�����
		 ���� ���� ���� �Ǿ�� �մϴ�.
		 1���� �Է½� "�ش� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ����
		 �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�.
		 
		 2���� �Է½� "����� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ�
		 �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�.
		 */
		int money = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
		int work = sc.nextInt();
		int total;
		Scanner cal = new Scanner(System.in);
		if(work==1) {
			System.out.println("�Ա� �ݾ��� �Է��ϼ���:");
			total = cal.nextInt();
			money = money + total;
		}
		else if(work==2) {
			System.out.println("��� �ݾ��� �Է��ϼ���:");
			total = cal.nextInt();
			money = money - total;
		}
		else {
			System.out.println("�������� �ڵ尡 �ƴմϴ�.");
			sc.close();
		}
		System.out.println("ó���� ������ ������ �����ϴ�."+money+"��");
		cal.close();
		sc.close();
		

	}

}
