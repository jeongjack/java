import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		
		/* ���빮��
		 * ���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ�.
		 * 
		 * Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���
		 * 
		 * ������� : ¦��, Ȧ�� ���Դϴ�. ��� ���
		 */

		Scanner k = new Scanner(System.in);
		System.out.println("Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���");
		int z = k.nextInt();
		// %�� ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		if(z % 2 == 0) {
			System.out.println("¦�� ���Դϴ�.");
			
		}
		
		else {	
 		System.out.println("Ȧ�� ���Դϴ�.");			
 		}
 		
 		}
	}



