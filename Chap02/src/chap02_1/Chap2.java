package chap02_1;

import java.util.Scanner;


public class Chap2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 
	 *  
	 *     Identifier  
	 */     
		
		// String &name = "atguithie"
		// String 2name = "atguigu"   Cannot start with a number
		// String class = "atguigu"   Cannot use keywords as a string name
		
		// test
		// String class_name = "atguigu";
		String name = "atgued";
		// String Name = "atgutewdc";
		
		int age = 2;
		
	/* 
	 * 
	 *   variety 
	 *   
	 */
	
		String studentName = "atguigu";
		System.out.println(studentName);
		
		/* Scope of the variable: Valid between a pair of {} */
		{
			String major = "java";
			System.out.println(major);
			
			System.out.println(name);
		}
		
		// System.out.println(major);
			// ERROR! 
		
		/* 整数型 type integer */
		byte b = 12;
		short s = 13;
		int i = 14;
		long count = 15L;
		
		// int j = 16L;
			// ERROR! Possible loss accuracy
		
		/* 浮点型 Floating point */
		double d = 12.34;
			
		//float f = 12.35;
			// ERROR!
		float f = 12.35F;
		
		/* 字符 char */
		char c = '张';
		char c1 = '\n';
		char c2 = '\u0016';
		
		/* boolean */
		boolean flag = true;
		// boolean flag1 = 0;
			// 不能使用 0 和非 0 代替 true 
		
		/* 类型转换 */
		float f2 = 12; // int > float
		
		// 强制类型转换
		int i2 = (int)12.34;
		
		// 混合运算
		long result = 12 + 12L;
		// int result = 12 + 12L;
		
		// byte/short/char 不会相互转换，他们三者在计算时首先转为int类型
		byte b1 = 12; 
		byte b2 = 12;
		// byte b3 = b1+b2;
		int b3 = b1+b2;
		
		// 字符串不能直接转为基本类型 运算符
		String str = "1234";
		// int i3 = (int)str;
		int i3 = Integer.parseInt(str);
		
		// char 可以转
		char c5 = 13;
		
		
	/*
	 *  Operator
	 */
		int i4 = 13 % 2;
		System.out.println(i4);
		
		// 对负数取模
		System.out.println(-38 % 3);
		System.out.println(38 % -3);  // 忽略负号
		
		// 整数除法
		System.out.println(38 / 3); // 12
		
		System.out.println(38 / 3F); // 12.666667
		
		System.out.println("12" + 12);  // 1212
		
		
		// ++
		int x = 10;
		x++;
		System.out.println(x);  // 11
		
		int y = 10;
		System.out.println(y++); // 10
		System.out.println(y);   // 11
		
		System.out.println('\n');
		System.out.println('*' + '\t' + '*');  // 93
		System.out.println("*" + '\t' + '*');  // *	*
		System.out.println('*');			   // *
		System.out.println("*");			   // *
		System.out.println('\n');
		
		int z = 100;
		z += 100;
		System.out.println(z == 200); 	// true
		System.out.println(z++ == 200);	// true
		
		System.out.println(!(z == 200)); // true
		
		System.out.println(z == 200 || z == 201); // true
		System.out.println(z == 200 && z == 201); // false
		

		System.out.println('\n');
		System.out.println(z == 200 && (10 / 0 == 1));
		// 执行下列命令会报错  因为&后面的表达式也运行了 但除数不能为0
		// System.out.println(z == 200 & (10 / 0 == 1));
		
		
		// 三元运算符
		x = 100;
		y = 200;
		int max = x > y ? x : y;
		System.out.println(max);
	}
	
}

class TestIf{
	
	public static void main(String[] args) {
		int age = 10;
		if (age > 24){
			System.out.println("Graduated.");
		}else if(age > 20){
			System.out.println("Senior");
		}else if(age > 17) {
			System.out.println("Junior");
		}else if(age > 15) {
			System.out.println("xiaoxuebiye");
		}else if(age > 8) {
			System.out.println("xiaoxuesheng");
		}else {
			System.out.println("meishangxiaoxue");
		}
	}
	
}


class TestSwitch{
	
	public static void main(String[] args) {
		
		int i = 6;
		
		switch(i){
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
			break;
		default:
			System.out.println("d");
			break;
		}
	}
	
}

class TestFor{
	
	public static void main(String[] args) {
		
		int result = 0;
		for(int i = 1; i <= 10; i++) {
			result += i;
		}
		
		System.out.println("result = " + result);
	}
	
}



class HomeworkIf1{
	
	public static void main(String[] args) {
		// 将两个数从小到大排序
		int num1 = 10;
		int num2 = 50;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1 = ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("num2 = ");
		num2 = sc.nextInt();
		
		
		int z;
		if(num1 > num2) {
			z = num1;
			num1 = num2;
			num2 = z;
		}
		// System.out.println(num1);
		// System.out.println(num2);
		// System.out.println(num3);
		
		System.out.println(num1 + " " + num2);
		
		paixu(args);
	}
	
	static void paixu(String[] args) {
		// 三个数排序
		
		Scanner sc1 = new Scanner(System.in);
		
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		
		if(a < b) {
			if(c < a) {
				System.out.println(c + "," + a + "," + b);
			}else if(c > b) {
				System.out.println(a + "," + b + "," + c);
			}else if(c < b) {
				if(a < c) {
					System.out.println(a + "," + c + "," + b);
				}else {
					System.out.println(c + "," + a + "," + b);
				}
			}
		}else {
			if(c < b) {
				System.out.println(c + "," + b + "," + a);
			}else if(c > a) {
				System.out.println(b + "," + a + "," + c);
			}else {
				System.out.println(b + "," + c + "," + a);
			}
		}
		
		
		// System.out.println(a + "," + b + "," + c);
		
	} 
	
}


class HomeworkFor{
	
	public static void main(String[] args) {
		// 1~100之间所有是7的倍数的整数的个数及 总和
		int sum = 0;
		int num = 0;
		
		for(int i = 1; i <= 50 ; i++) {
			if(i%7 == 0) {
				sum = sum + i;
				num += 1;
				System.out.println(num + " " + sum);
			}
		}
		System.out.println("num = " + num + '\n'  + "sum = " + sum);
		
	}
	
	
	
	
}
