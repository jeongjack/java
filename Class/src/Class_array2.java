import java.util.Random;
import java.util.Scanner;


public class Class_array2 {

    
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		System.out.println();
		memorys m = new memorys();
		int no = sc.nextInt();
		sc.close();
		/*
		 * memorys m = null;
		 
		m = new memorys();
		*/
		m.ms(no);
		m=null;   //해당 인스턴스를 비움
		
		m = new memorys();
		m.rd();
		
		
	}

}


class memorys{
	public void ms(int user) {
		//Math.random()랜덤메소드 사용법 기본 자료형 double입니다.
		/*
		 * Math.random()랜덤메소드 사용법 기본은 자료형 double입니다.
		 * 
		 * random = > 보안코드, 인증코드, 추첨, 룰렛
		 */
		double a = Math.random();  //0.0 ~ 1.0
		int w = 0;
		while(w<=10) {
		int b = (int)(Math.random()*10)+1; //0 ~ 9 double -> int 변경
        	System.out.printf("%d ",b);
        	w++;
        }
		/*if(user==b) {
        	System.out.println("당첨");
        	
        }
        else {
        	System.out.println("다음기회에");
        }*/
		}
	public void rd() {
		Random r = new Random();  //random 객체 생성 및 인스턴스 적용
		int w = 0;
		while(w<=5) {
		System.out.println(r.nextInt(45)+1); //0~9까지 r.nextInt를 사용
		w++;
		}
	}
}
