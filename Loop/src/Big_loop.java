import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*
		int a;
		int total=0;
		
		for(a=1;a<=100;a++) {
		    total+=a;	
		}
		System.out.println(total);
		*/
		
		/* 1~100���� ���� �����*/
        int f;
        //Biginterger : java���� ��� ������ ���� ������ �� �ִ� ������ �ڷ���
        BigInteger aa = new BigInteger("1");  
        //�հ�ġ�� ����� �ڷ��� ���� 1�� ���ʰ����� ���� ��, ""�� ������ �����ؾ���
        for(f=1;f<=10;f++) {
        	//multiply : ��Ģ���� ���ϱ⸦ ���
        	//add : ��Ģ���� ���ϱ� ���
        	//subtract : ��Ģ���� ���� ���
        	//divide : ��Ģ���� ������ ���
        	aa = aa.multiply(BigInteger.valueOf(f));
        }
		System.out.println(aa);
		    
		

	}

}
