
public class If_for2 {

	public static void main(String[] args) {
		// 1~100까지 숫자 중 80이상의 숫자만 출력
		int f;
		for(f=1;f<101;f++) {
			
			if(f >= 80) {
				System.out.print(f+" ");
			}
		}

		//200~300까지 숫자 중 240이하의 숫자만 출력하시오
		int q;
		for(q=200;q<301;q++) {
			
			if(q <= 240) {
				System.out.print(q+" ");
			}
			
		}
		
		final int a = 3;
		int w;
		for(w=1;w<11;w++) {
			
			if (w % a == 0) {
				System.out.printf("%d ",w);	
			}
			
		}
		
		//응용문제: 구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10 이상 숫자만 출력
		
		final int aa = 2;
		int g;
		int total;
		for(g=1;g<=9;g++) {
			
			total = aa * g;
			if(g % aa == 0) {
		    System.out.printf("%d ",total);
			}
		
		}
		
		/* 응용문제
		다음 결과값을 보고 해당 값이 출력 되도록 코드를 제작하시오.
		18 36 54 72  
		 */
	   
		int p;
		int total3;
		for(p=1;p<10;p++) {
			total3 = 9 * p;
			if(p%2 == 0) {
				
				System.out.print(total3+" ");
			}
		}
		/* 
		 응용문제 
		  다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오
		 1~20 사이의 숫자입니다.
		  6 14 17 19
		 */
	    
		int k;
		for(k=1;k<=20;k++) {
		
			if(k==6 || k==14 || k==17 || k==19)
		    System.out.print(k + " ");
		}
		
		
		
	}
	
}
		
		
		
	

	
