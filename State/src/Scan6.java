import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		Scanner mid = new Scanner(System.in);
	    String m = mid.next();  //����� ���̵� �Է�
	    System.out.println("������ ���̵� �Է��ϼ���");

	    
	    Scanner mpass = new Scanner(System.in);
	    System.out.println("�н����带 �Է��ϼ���.");
	    String p = mpass.next();  //����ڰ� �н����� �Է�
	   
	    //System.out.printf("���̵�:%s,�н�����:%s",m,p);
	
	    
	    if(m.equals("jung") || m.equals("su")) {
	    	if(m.equals("jung") && p.equals("j1234")) {
	         System.out("�α��� �Ǽ̽��ϴ�.")
	    	}
	    	else if(m.equals("su") && p.equals("ssh")) {	
	    	}
	    	else {
	    		System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
	    	}
	    }
	    
	    	
	    	
	   
	    	
	    
	    	
	    
	    /* ���빮��
	     * [�α��� ���α׷�]
	     * ȸ������ ���̵�� jung, su
	     * �н�����
	     * jung : j1234
	     * su : ssh
	     *�ش� ���̵� �ܿ� �������� "���Ե��� ���� ����� �Դϴ�." ��� ���
	     * ���� �н����尡 Ʋ�� ��� "ȸ�������� �ٽ� Ȯ���ϼ���"
	     * ���̵� �� �н����尡 ���  ���� ��� "�α��� �Ǽ̽��ϴ�" ��� ���
	     */
	    
	    
	    
	    
	    
	}
	
	    
	

}
