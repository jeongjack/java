
public class If_for2 {

	public static void main(String[] args) {
		// 1~100���� ���� �� 80�̻��� ���ڸ� ���
		int f;
		for(f=1;f<101;f++) {
			
			if(f >= 80) {
				System.out.print(f+" ");
			}
		}

		//200~300���� ���� �� 240������ ���ڸ� ����Ͻÿ�
		int q;
		for(q=200;q<301;q++) {
			
			if(q <= 240) {
				System.out.print(q+" ");
			}
			
		}
		
		final int a = 3;
		int w;
		for(w=1;w<11;w++) {
			
			if (w % a == 0) {
				System.out.printf("%d ",w);	
			}
			
		}
		
		//���빮��: ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10 �̻� ���ڸ� ���
		
		final int aa = 2;
		int g;
		int total;
		for(g=1;g<=9;g++) {
			
			total = aa * g;
			if(g % aa == 0) {
		    System.out.printf("%d ",total);
			}
		
		}
		
		/* ���빮��
		���� ������� ���� �ش� ���� ��� �ǵ��� �ڵ带 �����Ͻÿ�.
		18 36 54 72  
		 */
	   
		int p;
		int total3;
		for(p=1;p<10;p++) {
			total3 = 9 * p;
			if(p%2 == 0) {
				
				System.out.print(total3+" ");
			}
		}
		/* 
		 ���빮�� 
		  ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�
		 1~20 ������ �����Դϴ�.
		  6 14 17 19
		 */
	    
		int k;
		for(k=1;k<=20;k++) {
		
			if(k==6 || k==14 || k==17 || k==19)
		    System.out.print(k + " ");
		}
		
		
		
	}
	
}
		
		
		
	

	
