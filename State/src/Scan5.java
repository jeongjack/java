import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
	    
		byte a = 10;
	    if(a < 10) {
	    System.out.println("�Է��� ���� 30���� �Դϴ�.");
	    }
	    else if(a < 10 || a <= 22){    //���ǹ��� ������ �����Ͽ� ������
	    	System.out.println("��÷ �Դϴ�");
	    	
	    }
	    	
	    else {
	    		System.out.println("���� ���� ���� �Դϴ�.");
	    
	    
	    	
	    }
	    
	    /*���빮�� Q. 1~45���� ���� �ϳ��� �Է��ϼ���
	     * 0�� �Է�: �����Է��� �߸� �Ǿ����ϴ�.
	     * 45���� ū ���ڸ� �Է�: ���ڴ� 1~45������ �Է� �����մϴ�.
	     * 
	     * 1~45���ڸ� �Է��Ͽ��� ���
	     * 7,12,14 ������ ���ڰ� �Է½� ��÷�Դϴ�. ��� ���
	     * �� �ܿ� ���ڽ� ������ȸ�� �����ϼ��� ��� ���
	     */
	    
	    
	    Scanner qa = new Scanner(System.in);
	    int n = qa.nextInt();      //����� �Է� �κ��� ��
        System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���.");
        if(n == 0) {
        	System.out.println("�����Է��� �߸� �Ǿ����ϴ�.");
        }
        else if(n > 45) {
        	System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
        }
        else {
        	if(n == 7|| n == 12 || n == 14) {
        		System.out.println("20% ���� ��÷ �Դϴ�.");
        	}
        	else if(n == 41) {
        		System.out.println("50% ���� ��÷ �Դϴ�.");
        	}
        	else {
        		System.out.println("������ȸ��...");
        	}
        }
	    
	    	}
	    }
	    
	    
	    
	    		
	  
	    	

    


