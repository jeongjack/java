
public class For2 {

	public static void main(String[] args) {
		int a;  //for�� �ʱⰪ
		int b=2; //���꿡 ����� ����
		int c; //������ ����� ���
		for(a=1;a<=9;a++) {
			c = b * a;  //������� �۾�
			//System.out.print(c+",");  //����� ������� �����
		}
        /*
         ���빮�� ���� ������� ���� �ڵ带 �ۼ� �Ͻÿ�
         45, 40, 35, 30, 25, 20,
         */
		
		int m;
		int k=5;
		int l;
		for(m=9;m>=4;m--) {
			l = k * m;
		//System.out.print(l+",");
		}
		
		/*
		 ���빮�� ���� ������� Ȯ�� �� �ڵ带 �����Ͽ� ����Ͻÿ�
		 
		 11,22,33,44,55,66,77,88,99
		  
		 * */
		int aa;
		int bb=11;
		int cc;
		for(aa=1;aa<=9;aa++) {
			cc = bb * aa;
			System.out.print(cc+",");
		}
		/* 
		 �ٸ� ���
		 int z;
		 int x;
		
		 for(z=1;z<10;z++)
		 x = (10*z) + z;
		 system.out.print(x+",");
		 */
		
	}

}
