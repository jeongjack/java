import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
//		�����迭
//		int a[] = new int[2];
//		a[0] = 22;
//		a[1] = 32;

//		�����迭
//		int b[] = {1,2,3,4};
//		int[] c = {1,2,3,4};
//		int[] d = new int[]{1,2,3,4};
		
		/* 2���迭 [][] */
        // 2�� �����迭
		//String member2[][] = new String[3][3];
		
		String member[][] = {
				{"ȫ�浿", "������", "������"},
				{"25", "31", "22"}
				
		};
		int ea = member.length; //�迭 ������ � �ִ����� Ȯ��
		int data_ea = member[0].length; //�ش� �迭���� �����Ͱ�ü�� ��ִ��� Ȯ��
		//System.out.println(data_ea);
		
		//System.out.println(member[0][2]);
		int f, ff;
		for(f=0;f<ea;f++) { //ū �ݺ����� �迭 ������ŭ loop
			//System.out.println(Arrays.toString(member));
		   for(ff=0;ff<data_ea;ff++) { // ���� �ݺ����� �迭�� �ִ� ������ ������ŭ loop
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
		 //System.out.println("���հ��:" +total);
		
		/*
		 ���빮�� �ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ���Ͻÿ�.
		 1�� ������ : 11 42 22 16
		 2�� ������ : 7 33 10 29
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
