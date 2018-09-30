/**
 * 数组
 */
/**
 * @author zhangml
 *
 */
package chap02_2;

public class Array {

	public static void main(String[] args) {
		
		int i = 10;
		
		/**
		 *  1.   一维数组
		 */
		
		// int [] 标示后面的变量是 " 一维 int 数组 " 类型
		int [] scores = {90, 67, 89, 51};
		// 第二种声明方式
		int scores2 [] = {};
		// 第三种声明方式
		String [] names = new String[5];
		int [] ages = new int[10];
		// 第四种
		int [] age = null;
		age = new int[10];
		
		
		
		// 访问数组中的元素，下标从0开始
		System.out.println(scores.length);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		for(int j = 0; j < scores.length; j++) {
			System.out.println(scores[j]);
		}
		
		// 给 ages 赋值
		for(int j = 0; j < ages.length; j++) {
			ages[j] = 50 + j;
			System.out.println(ages[j]);
		}
		
		System.out.println(ages);
	}	
}
