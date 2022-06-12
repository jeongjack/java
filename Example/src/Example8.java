
import java.util.Arrays;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/* 이건 숙제입니다 풀어와야해여 (다 푼거 아님)
		 다음 사용자 복권 관련 프로그램을 요청하였습니다.
		 사용자가 총 5개의 숫자를 입력하게 됩니다.
		 "1~46번 사이의 숫자를 입력해주세요:"
		 사용자가 입력한 5개 숫자를 배열로 생성합니다. (main에 처리)
		 
		 외부 class를 이용하여 PC가 직접 당첨 번호 5개를 랜덤하게 뽑아냅니다.
		 PC가 뽑은 5개의 숫자를 배열로 생성합니다. (외부 Class method로 생성)
		 
		 별도의 결과 method를 하나 더 생성하여 사용자가 입력한 5개의 배열 데이터와
		 PC가 뽑은 배열 데이터를 해당 method로 전달하여, 출력하시면 됩니다.
		 
		 단, 모든 사용하는 반복문은 무조건 do~while문으로 작성
		 
		 */
		int aa = 5;
		card c = new card();

		Scanner sc = new Scanner(System.in);
		int[] cc = new int[aa];
        int w = 0;
		while(w<5) {
			System.out.println("1~46번 사이의 숫자를 입력해주세요.");
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
	public static void bcard(int user1,int pc) {  //사용자(5),PC(5)
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

