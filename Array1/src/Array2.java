
public class Array2 {

	public static void main(String[] args) {
		/* hong kim park lee jang jung */
		
		//String id[] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(id[4]);
		//int word = id[1].length();
		//System.out.println(word);
		/* ���빮�� �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� �迭�� �� ����� ���̵� 3�ܾ� �̻� ��½�Ű�ÿ�
		 * */
		
	
		//int member = id.length;		
		//int w=0;
		//int word;   //������ �迭 �������� ���� �����ľ�
		//while(w<member) {
			//word = id[w].length(); //���� �����ľ�
			
			//if(word > 3) {    //���ܾ� �̻��� �����͸� ���
 				//System.out.println(id[w]);
				
			//}
			//w++;
		//}
		
		/*
		 ���빮�� �迭������ ������ ����
		 15 60 11 14 27 => 127
 		 ���� ������ ���� ��� ���ؼ� ���� ������� ����Ͻÿ�.
		 */
		
		int data[] = { 15, 60, 11, 15, 27 };
		int total = 0;
		int data_ea = data.length;
		int dw = 0;
		do {
			total += data[dw];
			dw++;
		}while(dw<data_ea);
		System.out.println("���հ�:" + total);
		
		
		
		

	}

}
