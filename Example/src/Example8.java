
import java.util.Arrays;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/* �̰� �����Դϴ� Ǯ��;��ؿ� (�� Ǭ�� �ƴ�)
		 ���� ����� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		 ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 "1~46�� ������ ���ڸ� �Է����ּ���:"
		 ����ڰ� �Է��� 5�� ���ڸ� �迭�� �����մϴ�. (main�� ó��)
		 
		 �ܺ� class�� �̿��Ͽ� PC�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 PC�� ���� 5���� ���ڸ� �迭�� �����մϴ�. (�ܺ� Class method�� ����)
		 
		 ������ ��� method�� �ϳ� �� �����Ͽ� ����ڰ� �Է��� 5���� �迭 �����Ϳ�
		 PC�� ���� �迭 �����͸� �ش� method�� �����Ͽ�, ����Ͻø� �˴ϴ�.
		 
		 ��, ��� ����ϴ� �ݺ����� ������ do~while������ �ۼ�
		 
		 */
		int aa = 5;
		card c = new card();

		Scanner sc = new Scanner(System.in);
		int[] cc = new int[aa];
        int w = 0;
		while(w<5) {
			System.out.println("1~46�� ������ ���ڸ� �Է����ּ���.");
			cc[w]=sc.nextInt();
			w++;
		}	
		
		card p = new card();
		p.acard(cc);
	}

}
class card{
	public void acard(int user[]) {  //PC(5)
		System.out.println(Arrays.toString(user));
		int bb = 0;
		//bcard(user,bb);
		//int ea = p.length();
		//int no = 0;
		//int w[] = new int[ea];
		
		
		
	}
	public static void bcard(int user1,int pc) {  //�����(5),PC(5)
		//System.out.println(Arrays.toString());
		
	}

	

}
class lotto{
	public static void lotto() {
		
		int a[];
		a = new int[5];
		int sum = 0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<100;j++) {
				a[i] = (int)(Math.random()*5)/j;
				
		for(int i1=0; i1 < a.length; i1++) {
			System.out.println(a[i]+ " ");
			System.out.println();
			
		
		}
				
			}
		}
	}
}

