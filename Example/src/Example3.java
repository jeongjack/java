import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		/*
		 �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 product : ����, ����, ���, ��, ����, Ű��, �ٳ���, ����
		 moneys : 35000 8000 4000 5500 3800 4400 11000 18900
		 ��ٴϱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
		 ��, �� �� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����Ͻÿ�
		 ��� : 75600
		 */

		String product[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
	    int moneys[] =  {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};
	    
	    totals(product,moneys);
	
	    
		
	}
public static void totals(String p[],int m[]) {

     
      int ea = p.length;
      int w = 0;
      int total = 0; 
      
      
      while (w<ea) {
		if(!p[w].equals("���") && !p[w].equals("�ٳ���")) {
	              total += m[w];	
		
		}
    	  
		w++;
	}
	System.out.println("���� ���� �ݾ��� " + total +"��");
	
	
}




}
