
public class While2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 8;
		int c;
		while(a < 10) {
			
			c = b * a;   //산술연산
			//System.out.print(c+" ");
			a++;     // 위치가 바뀌면 결과값이 다름	
		}
		
		/*
		 응용문제
		 해당 결과값을 확인하여 반복문으로 코드를 작성하시오
		 56,49,42,35,28,21
		 */
		
		int aa = 8;
		int bb = 7;
		int cc;
		while(aa > 2) {
			cc = bb * aa;
			System.out.print(cc+" ");
			aa--; 
		}
		
		/*
		 응용문제2.
		 다음 결과 값을 확인하신후 해당 결과값에 맞는 코드를 작성하시오
		 4,7,10,13,16,19,22,
		 
		 */
		
		

		
		
	}

}
