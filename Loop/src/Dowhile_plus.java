
public class Dowhile_plus {

	public static void main(String[] args) {
		
		/* do~while : 30~35���� �հ踦 ��� */
		
		int a = 30;
		int total1 = 0;
		do {
			
		total1 += a;	
			a++;
		}while(a <= 35);
		System.out.println("�հ�:"+total1);
		
		/* ���빮�� �հ���� 189�� �ֽ��ϴ�. �� 1~10���� �հ�ġ��
		   ���� 189�� �� �� �հ踦 ���Ͻÿ�
		 */
		
		int w = 1;   // ���� ���� �ڵ�
		int x = 189;
		int total = 0;
		do {
			total += w;
			w++;
			
		}while(w < 11);
		total = x - total;
		System.out.println("�հ�:"+total);
		
		int ww = 1;  // ���� ���� �ڵ�
		int total2 = 189;
		do {
			total2 -= ww;
			ww++;
		}while(ww<=10);
		System.out.println("�����:" + total2);
			
		
		
		

		
	
		

	}

}
