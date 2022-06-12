import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		/*
		 배열 + 기본(클래스)메소드문제
		 1차배열에 다음과 같이 값이 있습니다.
		 배열리스트 22 33 44 55 66 77 88 99 이며
		 해당 전체 값을 모두 더한 총합계 값을 별도의 메소드로
		 처리되도록 합니다. 단, 반복문은 무조건 do~while문 작성
		  
		  
		 */
		int a[] = {22,33,44,55,66,77,88,99};
		//void = 객체생성 + 인스턴스(메모리) 등록
		
		plus(a);

	}
	
	public static void plus(int b[]) {
	
		//System.out.println(Arrays.toString(b));
		
		int ea = b.length; //배열 갯수파악
		int w = 0;
		int total = 0;
		do {
			total = total + b[w];
			w++;
		} while (w<ea);
		System.out.println("총합계 값은:" +total);
		
	}

}
