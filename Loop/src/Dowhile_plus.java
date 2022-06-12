
public class Dowhile_plus {

	public static void main(String[] args) {
		
		/* do~while : 30~35까지 합계를 출력 */
		
		int a = 30;
		int total1 = 0;
		do {
			
		total1 += a;	
			a++;
		}while(a <= 35);
		System.out.println("합계:"+total1);
		
		/* 응용문제 합계숫자 189가 있습니다. 단 1~10까지 합계치와
		   현재 189를 뺀 총 합계를 구하시오
		 */
		
		int w = 1;   // 내가 만든 코드
		int x = 189;
		int total = 0;
		do {
			total += w;
			w++;
			
		}while(w < 11);
		total = x - total;
		System.out.println("합계:"+total);
		
		int ww = 1;  // 쌤이 만든 코드
		int total2 = 189;
		do {
			total2 -= ww;
			ww++;
		}while(ww<=10);
		System.out.println("결과값:" + total2);
			
		
		
		

		
	
		

	}

}
