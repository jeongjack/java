
public class Do2 {

	public static void main(String[] args) {
		
		int a = 1; //�ݺ��� ���ʰ�
		int b = 9; //��� ������
		
		do {
			int c = a * b;
			//System.out.print(c + " ");
			a++;
		}while(a < 10);
		
		/*
		 ���빮��
		 ���� ������� ���� do~while������ �ڵ带 �ۼ��Ͻÿ�
		 35 45 55 65 75 
		 */
		
		int aa = 4;
		int bb = 10;
		
		do {
			int cc = aa * bb - 5;
			//System.out.print(cc+" ");
			aa++;
			
		}while(aa < 9);
		
		int k = 3;
		int j;
		do {
			j = k * 10 + 5 ;
			System.out.print(j+" ");
			k++;
		}while(k <= 7);
		
		

	}

}
