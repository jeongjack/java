import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/* 
	     응용문제 총 2번의 질문을 하게 됩니다.
	     사용자가 숫자를 입력하여 두 수의 합을 구하는 scanner를 제작 
		 */
		/*Scanner sc = new Scanner(System.in);
		int nc;
		int n;
		int total = 0;
		for(n=1;n<3;n++) {
			System.out.println("숫자를 입력해주세요: ");
			nc = sc.nextInt();
			total += nc;
		}
		
		System.out.println("총 점수의 합은: "+total);
		sc.close();
		*/
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int user;
		int total = 0;
		while(w <= 2) {
			System.out.println(w+"번째 숫자를 입력하세요");
		    user = sc.nextInt();
		    total = total + user;
		    w++;
		}
		System.out.println("총 합계 수는: " + total);
		sc.close();
		
		
	}

}
