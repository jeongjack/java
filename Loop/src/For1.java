
public class For1 {

	public static void main(String[] args) {
		//�ݺ��� : �����͸� �ϰ������� �Է�, ����� �� �� �ֵ��� �ϴ� ����
		//for(�ʱⰪ;������;���� �Ǵ� ����)
        int z = 1;
        //z++;  +1 ���� : ��� �� + 1 ����
        //z--;  -1 ���� : ��� �� - 1 ����
        //++z;  +1 ���� : +1 ���� �� ���
        //--z;  -1 ���� : -1 ���� �� ���
        //System.out.println(z);
        {
		
		for(int a=0; a < 10; a++) {
	    System.out.println(a);
	   }
		
		int b;
		for(b=5;b<=10;b++) {
			System.out.println(b);
		}
		
		int c;
		for(c=10;c>3;c--) {  //���ǻ��� c<3 0~�������� ���� ���������� ��Ȳ�� �߻���
        System.out.println(c);		
		
		}
		//���빮�� 20~27 ����ϼ���
		/*short d;
		for(d=20;d<=27;d++) {
			System.out.print(d);
		}*/
		//���빮�� 39~21���� ����ϼ���
		
		int v;
		for(v=39;v>20;v--) {
			System.out.print(v);
		}
		//1~10���� ���� ���
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
			System.out.print(aa+",");
			
		}
	    /*
		//���빮�� ���� 2���� �̿��Ͽ� ���� �����͸� ����Ͻÿ�
		55~4���� ����մϴ�.
		*/
		int kk;
		int hh=4;
		for(kk=55;kk>=4;kk--) {
			System.out.print(kk+",");
		}
		
        }
	}
}