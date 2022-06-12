
public class Do2 {

	public static void main(String[] args) {
		
		int a = 1; //반복문 기초값
		int b = 9; //산술 고정값
		
		do {
			int c = a * b;
			//System.out.print(c + " ");
			a++;
		}while(a < 10);
		
		/*
		 응용문제
		 다음 결과값을 보고 do~while문으로 코드를 작성하시오
		 35 45 55 65 75 
		 */
		
		int aa = 4;
		int bb = 10;
		
		do {
			int cc = aa * bb - 5;
			//System.out.print(cc+" ");
			aa++;
			
		}while(aa < 9);
		
		int k = 3;
		int j;
		do {
			j = k * 10 + 5 ;
			System.out.print(j+" ");
			k++;
		}while(k <= 7);
		
		

	}

}
