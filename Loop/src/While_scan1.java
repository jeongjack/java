import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/* 
	     ���빮�� �� 2���� ������ �ϰ� �˴ϴ�.
	     ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner�� ���� 
		 */
		/*Scanner sc = new Scanner(System.in);
		int nc;
		int n;
		int total = 0;
		for(n=1;n<3;n++) {
			System.out.println("���ڸ� �Է����ּ���: ");
			nc = sc.nextInt();
			total += nc;
		}
		
		System.out.println("�� ������ ����: "+total);
		sc.close();
		*/
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int user;
		int total = 0;
		while(w <= 2) {
			System.out.println(w+"��° ���ڸ� �Է��ϼ���");
		    user = sc.nextInt();
		    total = total + user;
		    w++;
		}
		System.out.println("�� �հ� ����: " + total);
		sc.close();
		
		
	}

}
