
public class Double_loop3 {

	public static void main(String[] args) {
		/*
		 ���빮�� ���� ������� ��� �ǵ��� for������ �ۼ��Ͻÿ�.
		 5+2=7
		 5+3=8
		 5+4=9
		 5+5=10
		 6+2=8
		 6+3=9
		 6+4=10
		 6+5=11
		 7+2=9
		 7+3=10
		 ...
		 9+5=14
	    */

		int f, ff;
		for(f=5;f<=9;f++) {
			for(ff=2;ff<=5;ff++) {
				 //System.out.println(f+"+"+ff+"="+(f+ff));
			}
		}
		
		/* ���빮�� ����while������ ����
		  9*7=63
		  9*6=54
		  9*5=45
		  8*7=56
		  8*6=48
		  8*5=40
		  7*7=49
		  7*6=42
		  7*5=35
		 */
	   int w = 9;
	   while(w>=7) {
		   
		   int ww = 7;
		   
		   while(ww>=5) {
			   System.out.println(w + "*" + ww+"="+(w*ww));
			   ww--;
		   }
		   
		   w--;
	   }
	   
	   /* ���빮�� ���� ������� ���� do~while������ �����Ͻÿ�.
	    5+4=9
	    5+5=10
	    5+6=11
	    5+7=12
	    4+4=8
	    4+5=9
	    4+6=10
	    4+7=11
	    3+4=7
	    3+5=8
	    3+6=9
	    3+7=10
	     */
	   
	   int k = 5;
	   do {
		  
		   int kk=4;
		   do {
			   System.out.println(k+"+"+kk+"="+(k+kk));
			   kk++;
		   }while(kk<8);
		   
		   k--;
	   }while(k>=3);
	   
	   
		
	
	}

}
