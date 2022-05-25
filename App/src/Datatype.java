
public class Datatype {

	public static void main(String[] args) {
		//String : 문자 "" 무조건 사용
		String a = "1234";
		System.out.println(a);
       /* 정수형 */
		byte b = 127;   //byte : -128~127
		System.out.println(b);
		
		short c = 32767;  //short : -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 100000; //int : -2147483650 ~ 2147483640
        System.out.println(d);
        
        long f = 99999999;//long : 0 x 18개  끝에 L사용해야늘어남
        System.out.println(f);
        /* 정수형 끝 */
        
        /*실수형 */
        float z = 3.5f; //3.402480000+38 (f를 무조건 사용)
        System.out.println(z);
        
        double k = 44.5178;  //1.784+308  (d를 유/무 가능)
        System.out.println(k);
        /*실수형 끝 */
        
	}  
	
	

}
