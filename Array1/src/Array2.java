
public class Array2 {

	public static void main(String[] args) {
		/* hong kim park lee jang jung */
		
		//String id[] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(id[4]);
		//int word = id[1].length();
		//System.out.println(word);
		/* 응용문제 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배열값 중 사용자 아이디 3단어 이상만 출력시키시오
		 * */
		
	
		//int member = id.length;		
		//int w=0;
		//int word;   //각각의 배열 데이터의 문자 갯수파악
		//while(w<member) {
			//word = id[w].length(); //문자 갯수파악
			
			//if(word > 3) {    //세단어 이상의 데이터만 출력
 				//System.out.println(id[w]);
				
			//}
			//w++;
		//}
		
		/*
		 응용문제 배열데이터 다음과 같음
		 15 60 11 14 27 => 127
 		 다음 데이터 값을 모두 더해서 최종 결과값을 출력하시오.
		 */
		
		int data[] = { 15, 60, 11, 15, 27 };
		int total = 0;
		int data_ea = data.length;
		int dw = 0;
		do {
			total += data[dw];
			dw++;
		}while(dw<data_ea);
		System.out.println("총합계:" + total);
		
		
		
		

	}

}
