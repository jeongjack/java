
public class App {

	public static void main(String[] args) {
		/*���빮�� 
		 * �ջ� ������ �� ���� ���� ����Ͻÿ�.
		 * ����1 25+31*4+12
		 * ����2 15*3+9+14
		 * */ 
		
		int a = 25 + 31 * 4 + 12;
		int b = 15 * 3 + 9 + 14;
		
				
	    if(a > b) {
	    	System.out.println("����2�� ���� �۽��ϴ�.");
	    	
	    }
	    else if(a < b) {
	    
	    }
		
	    else {
	    	System.out.println("�� ���� �����ϴ�.");
	    }

         /* �ش簪�� 2������ ¦��, Ȧ���� Ȯ���ϱ� */
	   
	    int c = b % 2;          // %��ȣ ���� 0 �Ǵ� 1�� ������ ���� ���
	    System.out.println(c);
	    if(c==0) {
	    	System.out.println("¦�� �Դϴ�.");
	    }
	    else {
	    	System.out.println("Ȧ�� �Դϴ�.");
	    }
		
	}

}

