
public class For_plus1 {

	public static void main(String[] args) {
	
		/* 
		 응용문제
		 전체값은 500이 있습니다. 총 8회 동안 반복되면서
		 한번 반복할때 마다 12씩 감소하도록 하여 최종 값을 출력하시오.
		 */	
		
		
		int alls = 500;
		int m = 12;
		int w;
		for(w=1;w<9;w++) {
			alls = alls - m;
		}
		System.out.println(alls);
			
	}

}
