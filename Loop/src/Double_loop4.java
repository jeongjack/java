
public class Double_loop4 {

	public static void main(String[] args) {
		/*응용문제 복합반복문 for, dowhile */
       int f;
       for(f=2;f<=3;f++) {
    	   int w= 1;
    	   do {
    		   //System.out.println(f+"*"+w+"="+(f*w));
    		   w++;
    	   }while(w<=9);
    	   
       }
       
       /* 응용문제 구구단 7~9단까지 단, 각 구구단 곱셈값은
        5까지만 나오도록 합니다.
        제약(do~while, while)
        */
       int h = 7;
       int total;
       do {
    	   
    	   int p=1;
           while(p<=5) {
        	   total = h * p;
        	   //System.out.printf("%d * %d = %d",h,p,total);
        	   p++;
           }
    	   
    	   h++;
       }while(h<=9);
       
       
       /* 응용문제 다음 결과값을 확인하려 코드를 작성
        단, for문~ while문으로 제작되도록합니다.
         1*1
         2*2
         3*3
         4*4
         5*5
         6*6
         7*7
         8*8
         9*9
         */
     int g;
     int total2;
     for(g=1;g<=9;g++) {
    	 
     int y=g;
     while(y<=g) {
    	 total2 = y * g;
    	 System.out.printf("%d*%d=%d ",y,g,total2);
    	 y++;
     }
       
       
     }
       
     /*응용문제 다음 해당 결과값처럼 출력이 되도록
      더블반복문을 이용하시오(while ~ do~while)
      1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+3=7 4+4=8
      */
     
     
       
	}

}
