import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
//		정적배열
//		int a[] = new int[2];
//		a[0] = 22;
//		a[1] = 32;

//		동적배열
//		int b[] = {1,2,3,4};
//		int[] c = {1,2,3,4};
//		int[] d = new int[]{1,2,3,4};
		
		/* 2차배열 [][] */
        // 2차 정적배열
		//String member2[][] = new String[3][3];
		
		String member[][] = {
				{"홍길동", "김유신", "유관순"},
				{"25", "31", "22"}
				
		};
		int ea = member.length; //배열 갯수가 몇개 있는지를 확인
		int data_ea = member[0].length; //해당 배열에서 데이터객체가 몇개있는지 확인
		//System.out.println(data_ea);
		
		//System.out.println(member[0][2]);
		int f, ff;
		for(f=0;f<ea;f++) { //큰 반복문은 배열 갯수만큼 loop
			//System.out.println(Arrays.toString(member));
		   for(ff=0;ff<data_ea;ff++) { // 작은 반복문은 배열에 있는 데이터 갯수만큼 loop
			   //System.out.println((member[f][ff]));
			   
		   }
		}
		
		int [][] datas = {
				{1,3,5},
				{2,4,6}
				
		};
		int fea = datas.length;
		int dea = datas[0].length;
		int total=0;
		int w,ww;
		for(w=0;w<fea;w++) {
			//System.out.println(Arrays.toString(datas[w]));
			for(ww=0;ww<dea;ww++) {
				//System.out.println(datas[w][ww]);
				total += datas[w][ww];
			}
			
		}
		 //System.out.println("총합계는:" +total);
		
		/*
		 응용문제 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하시오.
		 1번 데이터 : 11 42 22 16
		 2번 데이터 : 7 33 10 29
		 */
		int numbers[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int ws = 0;
		int totals = 0;
		while(ws<numbers.length) {
			int wz = 0;
			while(wz < numbers[ws].length) {
			if(numbers[ws][wz]%2 == 0){
				totals += numbers[ws][wz];
			}
			wz++;
		}
		ws++;
}
		System.out.println(totals);
		
	
	
	
		
		
		
		
	}

}
