
public class Double_loop4 {

	public static void main(String[] args) {
		/*���빮�� ���չݺ��� for, dowhile */
       int f;
       for(f=2;f<=3;f++) {
    	   int w= 1;
    	   do {
    		   //System.out.println(f+"*"+w+"="+(f*w));
    		   w++;
    	   }while(w<=9);
    	   
       }
       
       /* ���빮�� ������ 7~9�ܱ��� ��, �� ������ ��������
        5������ �������� �մϴ�.
        ����(do~while, while)
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
       
       
       /* ���빮�� ���� ������� Ȯ���Ϸ� �ڵ带 �ۼ�
        ��, for��~ while������ ���۵ǵ����մϴ�.
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
       
     /*���빮�� ���� �ش� �����ó�� ����� �ǵ���
      ����ݺ����� �̿��Ͻÿ�(while ~ do~while)
      1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+3=7 4+4=8
      */
     
     
       
	}

}
