import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*��빮��
		 2�� �迭�̸�, 2���迭 �����ʹ� ������ �����ϴ�.
		 user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 user_point : 3000 1000 25000 19800 5750 3630 0 
		 
		 ���α׷� ���۰� ���ÿ� 
		 "����Ʈ�� �˻��� ������ �Է��ϼ���?"
		 �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű�������
		 �̿��Ͽ� ���� �� �ش� ������� ����Ͻø� �˴ϴ�.
		 */

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���?");
		String x = sc.next();
		point aa = new point();
		aa.ad(x);
		sc.close();
		aa = null;
	}

}
class point{
	public void ad(String p) {
		
		String[][] a = {
			{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
			{"3000", "1000", "25000", "19800", "5750", "3630", "0"}
		};
		int gp = a.length;
		int ea = a[0].length;
		int w = 0;
				
		while(w<gp) {
			int ww = 0;
			while(ww<ea) {
				if(a[w][ww].equals(p)) {
					System.out.println(a[1][ww]);
				}
				ww++;
			}
			w++;
		}
		
	}
}