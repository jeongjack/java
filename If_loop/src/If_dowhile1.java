
public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ� 
		 */
		int dw = 1;
		int total;
		do {
			
			total = 6 * dw;
			if(total > 35) {
			//System.out.print(total+" ");
			}
			
			dw++;
		}while(dw <= 9);
		
		/*
		 ���빮�� 14~27���� ���� �� ¦������ ��� ���Ͽ�
		 ���� ������� ����Ͻÿ�. 
		 */
		
		int w = 14;
		int total2=0;
		do {
			if(w%2 == 0) {
				total2 = total2 + w;
			}
			
			w++;
		}while(w<=27);
		
		System.out.print(total2 + " ");
		
		
		

	}

}
