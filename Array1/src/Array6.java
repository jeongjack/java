import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		
		/* 
		 ���빮�� ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�
		 �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�.
		 �ù��� 30000 �����̻�(����)
		 15000 48000 67000 8000 118200 49800 6000 18700
		 
		 [48000 67000 118200 49800]
		 * */
		
		/*int a[] = new int[4]; 
		int a_ea = a.length;
        int b[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 };
		int ea = b.length;
		int w = 0;
		while(w<ea) {
			if(b[w]>=30000) {
				System.out.print(b[w]+",");
			}
			
			w++;
		}*/
		
		int a[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 };
		int a_ea = a.length;
		int w = 0;
		
		int b[] = new int[6];
		int ct = 0;
		do {
			if(a[w]>=30000) {
				b[ct]= a[w];
				ct++;
			}
		   w++;
		}while(w<a_ea);
		System.out.println(Arrays.toString(b));
		
		
	}

}
