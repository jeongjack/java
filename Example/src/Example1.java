import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		/*
		 �迭 + �⺻(Ŭ����)�޼ҵ幮��
		 1���迭�� ������ ���� ���� �ֽ��ϴ�.
		 �迭����Ʈ 22 33 44 55 66 77 88 99 �̸�
		 �ش� ��ü ���� ��� ���� ���հ� ���� ������ �޼ҵ��
		 ó���ǵ��� �մϴ�. ��, �ݺ����� ������ do~while�� �ۼ�
		  
		  
		 */
		int a[] = {22,33,44,55,66,77,88,99};
		//void = ��ü���� + �ν��Ͻ�(�޸�) ���
		
		plus(a);

	}
	
	public static void plus(int b[]) {
	
		//System.out.println(Arrays.toString(b));
		
		int ea = b.length; //�迭 �����ľ�
		int w = 0;
		int total = 0;
		do {
			total = total + b[w];
			w++;
		} while (w<ea);
		System.out.println("���հ� ����:" +total);
		
	}

}
