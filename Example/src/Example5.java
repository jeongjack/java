import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		/*
		  2차배열 + 기본(클래스)메소드 문제
		  등록된 고객중 vip 고객만 리스트 출력
		  
		   user_list : 홍길동 이순신 감강찬 유관순 세종대왕 김유신 계백장군
		   user_level : gold vip guest gold vip vip guest
		 
		 결과출력 : 이순신, 세종대왕, 김유신,
		 
		 [그룹인덱스][데이터인덱스]
		 */
	String[][] a = {
			{"홍길동", "이순신", "감강찬", "유관순", "세종대왕", "김유신", "계백장군"},
			{"gold", "vip", "guest1", "gold", "vip", "vip", "guest2"}
	 };
		
		Example5 ex = new Example5();
		ex.level(a);
		
	
	
	
	}

	public void level(String data[][]) {
		int gp = data.length; //2
		int ea = data[0].length; //7
		//System.out.println(ea);
		int w = 0;
		/*while(w<ea) {
			if(data[1][w].equals("vip")) {
				System.out.printf("%s ",data[0][w]);
			}
			w++;
		}
		*/
		while(w<gp) {
			int ww = 0;
			while(ww<ea) {
				
				if(data[w][ww].equals("vip")) {
				System.out.println(data[0][ww]);
				}
				ww++;
			}
			
			w++;
		}
		
	}
	
}
