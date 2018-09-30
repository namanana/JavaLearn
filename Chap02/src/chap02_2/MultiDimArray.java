package chap02_2;


public class MultiDimArray {

	public static void main(String[] args) {
		
		int [][] test = new int[5][]; // 声明一个二维数组
		
		for(int i = 0; i < test.length; i++) {
			// System.out.println(test[i]);  // null
			test[i] = new int[3];
			for(int j = 0; j < test[i].length; j++) {
				test[i][j] = i * j + 1;
				System.out.print(test[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

}

