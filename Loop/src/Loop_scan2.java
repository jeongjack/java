import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/*
		 Scanner와 함께 while문으로 사용자가 입력하는
		 값으로 구구단 결과가 출력되는 프로그램을 제작하시오
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("확인하실 구구단 숫자를 입력하세요");
		int gugu = sc.nextInt();
		int w = 1;
		int aws;
		while(w < 10) {
			aws = gugu * w;
			System.out.printf("%d",aws);
			w++;
		
	    
	    
	   
	    
		}
	
	}

}
