import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*���빮��3.
		 ����ڰ� �ش� ���� �Է��մϴ�.
		 ��, ����ڰ� �ΰ��� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���� �����ȿ�
		 �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�
		 ��, �ش� �ڵ�� do~while �ۼ�
		 
		 ����)
		 ù��° ���� ���ڴ�? 5
		 �ι�° ���� ���ڴ�? 10
		 ���� ���� ��� �հ�� : 45 �Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� ���ڴ�?");
		int a = sc.nextInt();
		System.out.println("�ι�° ���� ���ڴ�?");
		int b = sc.nextInt();
		int total=0;
		do {
			total +=a;
			a++;
		}while(a<=b);
		
		System.out.printf("���� ���� ��� �հ�� : %d",total);
		sc.close();
		
	
		
	}	
	

}
