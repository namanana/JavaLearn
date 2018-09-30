/**
 * @author namanana
 * 
 */
package homework;
import java.util.Scanner;

/**
 *  Process Control
 *  流程控制
 */

/**
 *  1. 输入长和宽，输出长方形。
 */
class Ractangle_For{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("h = ");
		int h = sc.nextInt();
		System.out.print("w = ");
		int w = sc.nextInt();
		
		for(int i = 1; i <= w; i++) {
			for(int j = 1; j <= h; j++) {
				System.out.print("#");
			}
			System.out.print('\n');
		}
		
		
	}
	
}


/**
 * 2. 输入两个数，求其最大公约数&最小公倍数
 */
// import java.util.Scanner;

class CommonDivisor_ForIF{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		
		// 求较大值和较小值
		int max = (a > b) ? a : b;
		int min = (a < b) ? a : b;
		
		// 求最大公约数
		for(int i = min; i >= 1; i--) {
			if( a % i == 0 && b % i == 0) {
				System.out.println("最大公约数： " +i);
				break;
			}
		}
		
		// 最小公倍数
		for(int j = max; j <= a*b; j++) {
			if(j % a == 0 && j % b == 0) {
				System.out.println("最小公倍数： "+j);
				break;
			}
		}
		
	}
}

/**
 * 3. 根据用于指定月份，打印该月份所属的季节
 * 3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季
 */

class Season_Switch{
	
	public static void main(String[] args) {
		int x = 4;
		switch(x) {
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Automn");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
		default:
			System.out.println("no");
		}
		
	}
	
}














