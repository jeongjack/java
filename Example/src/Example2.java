import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/* 
		 ���빮��2
		 ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�,
		 ������ ����� ����Ͽ� ¦�� ���� Ȧ�� ������ ����Ͻÿ�.
		 "�����ܿ� ���� ���ڸ� �Է��ϼ���?"��� �޼����� ��µǸ�
		 �ش� ���ڿ� ���缭 ��� ����� ���ϸ�,
		 ���� ���� ���� ¦������ Ȧ������ ����Ͻø� �˴ϴ�.
		 ��, �ش� �ݺ����� for ~ do while������
		 �Ѱ����� �����ؼ� �ۼ��Ͻÿ�. 
		 
		 */
       Scanner sc = new Scanner(System.in);
       String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���?";
       String msg2;  //�޼��� ����
       System.out.println(msg);
       int user = sc.nextInt();
       int f = 1;
       int total=0;
       do {
    	   //total = total + (user * f);
    	   total += user*f;
    	   f++;
       }while(f<10);
       //System.out.println(total);
       if(total % 2 == 0) {
    	   msg2 = "¦��";
       }
       else {
    	   msg2 = "Ȧ��";
       }
       System.out.println("������� "+msg2+" �Դϴ�.");
		
		
	}

}
