import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		
		
		/*응용문제 [인증번호 발송에 대한 번호 비교 코드]
Q.인증받은 번호를 입력하셨나요?

숫자 220524

사용자가 숫자 220524 외에 입력시
"인증번호가 틀립니다." 라고 출력
동일한 인증번호 숫자를 입력시 "인증확인 되셨습니다."라고 출력

단, 220524는 java실행시 가장 먼저 실행되는 변수로 처리 */
		
		int sc = 220524;
		Scanner mid = new Scanner(System.in);
		System.out.println("Q. 인증받은 번호를 입력하셨나요?");
		int m = mid.nextInt();
		
		if(sc == m) {
			System.out.println("인증확인 되셨습니다.");
		}
		else {
			System.out.println("인증번호가 틀렸습니다.");
		}
        mid.close();
        
	}

}
