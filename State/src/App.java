
public class App {

	public static void main(String[] args) {
		/*응용문제 
		 * 합산 계산공식 중 작은 값을 출력하시오.
		 * 공식1 25+31*4+12
		 * 공식2 15*3+9+14
		 * */ 
		
		int a = 25 + 31 * 4 + 12;
		int b = 15 * 3 + 9 + 14;
		
				
	    if(a > b) {
	    	System.out.println("공식2번 값이 작습니다.");
	    	
	    }
	    else if(a < b) {
	    
	    }
		
	    else {
	    	System.out.println("두 값이 같습니다.");
	    }

         /* 해당값을 2진수로 짝수, 홀수로 확인하기 */
	   
	    int c = b % 2;          // %기호 사용시 0 또는 1로 나머지 값이 출력
	    System.out.println(c);
	    if(c==0) {
	    	System.out.println("짝수 입니다.");
	    }
	    else {
	    	System.out.println("홀수 입니다.");
	    }
		
	}

}

