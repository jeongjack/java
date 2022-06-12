
public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 응용문제
		 구구단 6단 중에서 35이상 결과 숫자만 출력하시오 
		 */
		int dw = 1;
		int total;
		do {
			
			total = 6 * dw;
			if(total > 35) {
			//System.out.print(total+" ");
			}
			
			dw++;
		}while(dw <= 9);
		
		/*
		 응용문제 14~27까지 숫자 중 짝수값만 모두 더하여
		 최종 결과값을 출력하시오. 
		 */
		
		int w = 14;
		int total2=0;
		do {
			if(w%2 == 0) {
				total2 = total2 + w;
			}
			
			w++;
		}while(w<=27);
		
		System.out.print(total2 + " ");
		
		
		

	}

}
