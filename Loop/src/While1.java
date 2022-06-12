
public class While1 {

	public static void main(String[] args) {
		int a = 1;  //while시작값
		while(a < 11) {  //while 범위값, 종료값
			
			//System.out.print(a+",");
			
			a++;     //증가 or 감소
		}

		int b = 10;
		while(b >= 5) {
			//System.out.println(b+",");
			b--;
			
			/*응용문제
			 다음 사항을 while문으로 작성하시오.
			 22~16까지 숫자를 출력하시오
			 */
			int x = 22;
			while(x > 15) {
				//System.out.printf("d%",aa);
				x--;
				
				
			}
			
			int aa = 1;    //초기값
			int bb = 10;   //종료값
			while(aa <= bb) {     //반복문 범위
				//System.out.printf("%d ",aa);
				aa++;    //증가
			}
			
			/*
			  응용문제 변수 2개를 이용하여 범위에 맞게 값을 출력하시오.
			  99~47까지 출력
			 
			 */
			int jj = 99;
			int kk = 47;
			while(kk <= jj) {
				System.out.printf("%d ",jj);
			
				jj--;
			}
			
			
			
			
			
		}
		
		
	}

}
