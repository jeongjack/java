import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		
		
		/* 
		 * ���빮��
		 * �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. �� �迭���� �ε����� ���� ��ȣ�� ���ؼ�
		 * ¦��, Ȧ�� ������ �迭 ��� �����ͷ� �缳�� �Ͻʽÿ�.
		 *  
		 *  Adata = 5 17 19 22 33
		 *  Bdata = 1 2 3 4 5
		 *  Result = ["¦��","Ȧ��","¦��","¦��","¦��"] 
		 *   test = [6,19,22,26,38];  
		 */
		
		
		
		
		  int A1[][] = {
	        		 {5,17,19,22,33},
	        		 {1,2,3,4,5}
	         };
		  
		  int ea = A1[0].length; //�迭�� �ִ� ������ ��ü�� 
		  int ea2 = A1.length;  //�迭�׷� ��
		  
		  int w=0; //ū �ݺ��� �ε�����
		  int total1=0;//������ ���� �̰� �޴� ����
		  int total2=0;//������ ���� �̰� �޴� ����
		  int newdata[] = new int[ea]; //���ο� �迭 ��ü����
		  while(w<ea) { // ū �ݺ��� 7���� (�迭 ������ ��ü ��)
			  
			  int ww = 0;
			  while(ww<ea2) { //�����ݺ��� 2����(�迭�׷�)
		      if(ww==0) {
		    	  total1 = A1[ww][w];
		      }
		      else {
		    	  total2 = A1[ww][w];
		    	  
		      }
			 
			  ww++;
			  }
			  //�����ݺ��� ������ ���ͼ� ù��° �迭�� + �ι�° �迭��
			  newdata[w] = total1 + total2; //���ο� �迭 ��ü�� ���
			  
			  w++;
			  
		  }
		  System.out.println(Arrays.toString(newdata));
		
		
	}

}