import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 응용문제9
		 A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다.
		 "점수를 입력하세요?"라는 문구는 총 5번이 나오게 되며,
		 모든 점수는 합산한 후 5개의 점수에 대한 평균값을 출력합니다.
		 출력 메세지는 "해당 점수의 평점은: " 출력
		 단, 평점 점수가 40점 이하 일 경우 재시험입니다. 라고 메세지를
		 출력 후 프로세서는 종료합니다. 40점 이상일 경우 "합격"이라고 메세지를
		 출력하십시오.
		 
		 [추가기획]
		 "입력하실 과목 수를 적어주세요: " 라고 제일먼저 출력 후
		 해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 평균값이 적용 되어야합니다.
		 
		 for문으로 할것 
		 */
		/*Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요:");
		int a = sc.nextInt();
		int jumsu;
		int f;
		int total = 0;
		

		for(f=1;f<=5;f++) {
			System.out.println("점수를 입력하세요?");
			jumsu = sc.nextInt();
			total += jumsu;
		}
		//System.out.println("해당 점수의 총합은: " +total);
		System.out.println("해당 점수의 평점은: "+total / a);
        if(total / 5 <= 40) {
        	System.out.println("재시험입니다.");
        }
        else {
        	System.out.println("합격"); 
        } */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요.");
	    int subject = sc.nextInt();
		int w = 1;
		int user;
		int total=0;
		while(w<=subject) {
			System.out.println("점수를 입력해 주세요: ");
			user = sc.nextInt();
			total = total + user;
			w++;
		}
		int avg = total / subject;		
		String msg;
		if(avg < 40) {
			msg = "재시험입니다.";
		}
		else {
			msg = "합격입니다.";
		}
		System.out.println("최종 평균 점수는" + avg +"이며,"+msg);
		sc.close();
		
	}

}
