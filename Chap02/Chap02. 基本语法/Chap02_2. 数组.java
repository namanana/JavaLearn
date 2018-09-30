/**
 *  Chap02_2. 数组
 */

定义：
	数组是多个相同类型数据的组合，实现对这些数据的统一管理
	数组中的元素可以是任何数据类型，包括基本数据类型和引用数据类型
	数组属引用类型，数组型数据是对象(object)，数组中的每个元素相当于该对象的成员变量

数组声明：
	type var[]
	type [] var
	type [] var = new type[n]; // 声明数组并分配空间
	
	int [] age = null;  // 声明数组
	age = new int[10];  // 为数组分配内存空间（为数组元素赋默认值）
	
	Java语言中声明数组时不能指定其长度(数组中元素的数)
	// int a[5]  
	// Error

/**
 * 1、一维数组
 */
	
一维数组初始化：
	动态初始化
		int arr = new int[3];
	>  声明、创建数组对象，再通过for循环的方式为数组元素赋值
		for(int j = 0; j < ages.length; j++) {
			ages[j] = 50 + j;
			System.out.println(ages[j]);
		}
	
	静态初始化	
	> 声明数组的同时进行赋值
		int a[] = new int[]{3, 9, 8};
		int [] a = {3, 9, 8};
		MyDate dates[]={
			new MyDate(2, 7, 1964),
			new MyDate(1, 1, 2000),
			new MyDate(2, 12, 1964)
		}
	
数组元素的默认初始值：
	byte / short / int 	0
	long				0L
	float				0.0F
	double 				0.0D
	char				'\u0000'(null)
	boolean				False
	All reference type	Null
	
/**
 * 2、多维数组
 */
定义：
	二维数组的每一个元素是一个一维数组
	
声明：
	int [][] test = new int[5][]; // 声明一个二维数组
	for(int i = 0; i < test.length; i++) {
		// System.out.println(test[i]);  // null
		test[j] = new int[j+1];
		for(int j = 0; j < test[i].length; j++) {
			test[i][j] = i * j + 1;
		}
	}
	
访问：
	嵌套的for循环































	