
public class while_plus {

	public static void main(String[] args) {
		/* 5~10까지 더한 합계 수를 출력 */

		int w = 5;   //초기값
		int total = 0; //합계치를 누적시키기 위한 변수값
		while(w < 11) {  
			
			//total = total + w;
			total += w;
			w++;
		}
		
		System.out.println("합계:"+total);
	
		/* 응용문제 : 3 ~ 8 까지 곱한 총 합계 수를 출력하시오. */
	
	 int a = 3;
	 int total2 = 1;  //곱하기 합계를 설정시 "1" 기본값으로 설정
	 while(a < 9) {
		 
		 total2 = total2* a;
		 a++;
	 }
	System.out.println("합계:"+total2);
		
	}

}
