
public class If_for {

	public static void main(String[] args) {
		
		final int a = 1;    //final�� ���� ���� > ����� ����
        /* ���: ���� ������ �ʴ� ���� ���մϴ�. */
		final String name = "ȫ�浿";	
		//System.out.println(name);				
		//System.out.println(a);
		
		final int ct = 5;  //������
		int f;   //�ݺ���
		boolean ok = false;  //���ǿ� ���� true, false
		for(f=1;f<11;f++) {
			
			if(f==ct) {  //�ݺ��� ���� �������� ���� ���
			    System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
			    ok = true; //���ǿ� ���� ���� �����մϴ�.
			}
		}
		
         if(ok==false) {  //���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������
        	              //������� ��µǴ� �ڵ��Դϴ�.
        	 System.out.println("Ȯ���� ���� ���� �����Դϴ�.");
         }
		
         /* �� 20���� ���� �ݺ��մϴ�. �� �� Ȧ����, ¦������ ����ϵ��� �մϴ�.*/
         
         int ff;
         String odd=""; 
         for(ff=1;ff<21;ff++) {
        	 if(ff % 2 != 1) {    // Ȧ���� odd"1", ¦���� even"0"
        		 System.out.print(ff+" ");
        	 }
        	 else {    //���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰԵ˴ϴ�.
        		 odd += ff + " ";   //�߰� �� ��� "  " ������� Ȱ���Ͽ� ����
        	 }
        	 
         }
         System.out.println(odd);
         
		
	}

}
