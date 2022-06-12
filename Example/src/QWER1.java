
public class QWER1 {

	public static void main(String[] args) {
		/*응용문제 
		 * 합산 계산공식 중 작은 값을 출력하시오.
		 * 공식1 25+31*4+12
		 * 공식2 15*3+9+14
		 * */ 
		
		int a = 25+31*4+12;
		int b = 15*3+9+14*10;
		
		if(a>b) {
			System.out.println("공식 2번 값이 작습니다.");
		}
		else if(a<b) {
			System.out.println("1번 값이 더 작습니다.");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
		
		int c = b % 2;
		
		if(c==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
				
		
				
		
		
	}

}
