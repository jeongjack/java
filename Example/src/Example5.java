import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		/*
		  2���迭 + �⺻(Ŭ����)�޼ҵ� ����
		  ��ϵ� ���� vip ���� ����Ʈ ���
		  
		   user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		   user_level : gold vip guest gold vip vip guest
		 
		 ������ : �̼���, �������, ������,
		 
		 [�׷��ε���][�������ε���]
		 */
	String[][] a = {
			{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
			{"gold", "vip", "guest1", "gold", "vip", "vip", "guest2"}
	 };
		
		Example5 ex = new Example5();
		ex.level(a);
		
	
	
	
	}

	public void level(String data[][]) {
		int gp = data.length; //2
		int ea = data[0].length; //7
		//System.out.println(ea);
		int w = 0;
		/*while(w<ea) {
			if(data[1][w].equals("vip")) {
				System.out.printf("%s ",data[0][w]);
			}
			w++;
		}
		*/
		while(w<gp) {
			int ww = 0;
			while(ww<ea) {
				
				if(data[w][ww].equals("vip")) {
				System.out.println(data[0][ww]);
				}
				ww++;
			}
			
			w++;
		}
		
	}
	
}
