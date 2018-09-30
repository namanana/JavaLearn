/** 0928
 *  
 * 		述职
 * 		安装Java
 * 
 */

/** JRE & JDK **/
	// JRE(Java Runtime Environment) 是java的运行环境
		面向Java程序的使用者，而不是开发者。
		只能运行Java程序
		不包含开发工具(编译器、调试器等)
		
	// JDK(Java Development Kit) 又称J2SDK(Java2 Software Development Kit) Java开发工具包
		包含了JRE
		是Java开发工具包	
		提供了Java的
			开发环境
				(提供了编译器javac等工具，用于将java文件编译为class文件)
			运行环境
				(提供了JVM和Runtime辅助包，用于解析class文件使其得到运行)
	不仅可以开发Java程序，也同时拥有了运行Java程序的平台
	是整个Java的核心
		包括了Java运行环境(JRE)
		一堆Java工具tools.jar和Java标准类库 (rt.jar)
		
/** 基础常识 **/
	// 人机交互方式
		图形化界面
		命令行方式
	
	// 常用DOS命令
		dir 	-- 列出当前目录下的文件以及文件夹
		md 		-- mkdir
		rd 		-- 删除目录
		cd
		cd.. 	-- 退回上一级目录
		cd\ 	-- 退回根目录
		exit 	-- 退出dos命令行
	
	// 机器语言（编程语言）
		C / C++ / Java / PHP
		
	// Java程序运行机制
		两大核心机制
			Java虚拟机(Java Virtual Machine)
	
	// Java程序运行的两大核心机制
		Java虚拟机 (JVM)
			JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域。
			负责执行指令，管理数据、内存、寄存器。
			用于运行Java程序
			一次编译，到处运行
		垃圾回收
			Java不需要程序员负责回收无用的内存
			程序员无法精确控制和干预
	// Java语言的特点
		面向对象
			两个基本概念：类、对象
			三大特性：封装、继承、多态
		健壮性
			去掉了指针、内存的申请和释放等
		跨平台性
			
			
/** 第一个Java程序 **/
	// 编写 .java
	class helloworld{
		pubulic static void main(String [] args){
			System.out.println("helloworld")
		}
	}	
	
	// 通过javac编译
		javac java源文件.java
		如果当前目录没有javac，则需要设置环境变量
	// 通过java运行class
	    java 类名
		
	
	
/** chap.2 基本语法 **/
	/* 关键字 */
		被Java语言赋予了特殊含义，用做专门用途的字符串（单词）
		特点：所有字母都是小写
			// 定义数据类型
			class	enum 	byte	short
			int		long	float	double 	char 
			boolean void	interface 
			// 定义数据类型
			true 	false 	null
			// 定义流程控制
			if 		else	switch	case	default
			while	do 		for		break 	continue
			return
			// 定义访问权限修饰符
			private		protected	public
			// 定义类、函数、变量修饰符
			abstract	final		static 	synchronized
			// 定义类与类之间关系
			extends		implements
			// 定义建立实例及引用实例，判断实例
			new 	this 	super	instanceof
			// 用于异常处理
			try 	catch 	finally 	throw 	throws
			// 用于包
			packages	import
			// 其他修饰符关键字
			native 	strictfp 	transient 	volatile 	assert
	
	/* 标识符 */
		对各种变量、方法和类等要素命名时使用的字符序列称为标识符
		凡是自己可以起名字的地方都叫标识符
		
		// 规则
			由26个英文字母大小写，0-9，_或 $ 组成  
			数字不可以开头。
			不可以使用关键字和保留字，但能包含关键字和保留字。
			Java中严格[区分大小写]，长度无限制。
			标识符不能包含空格。

	/* 命名规范 */		
		// 包名 
			xxxyyyzzz
		// 类名、接口名
			XxxYyyZzz
		// 变量名、方法名
			xxxYyyTtt
		// 常量名
			XXX_YYY_ZZZ
	
	/* 变量 */
		// 概念
			内存中的一个存储区域
			该区域有自己的名称（变量名）和类型（数据类型）
			Java中每个变量必须先声明，后使用
			该区域的数据可以在同一类型范围内不断变化
		// 格式
			类型 变量名 = 初始值
			int m = 1	
		// 注意
			java是强类型语言，每个变量必须先声明，后使用
			变量的作用域：一对{}之间有效
		// 变量分类
			"按位置划分"
				成员变量
				局部变量
				注意：类外面不能声明变量
			" 按所属数据类型划分 "
				基本数据类型变量 （直接放入栈中，栈内存中放的是堆内存的首地址）
					数值型 
						整数 byte	short 	int 	long
						'byte: -128~127'
						浮点 float	double
						'浮点型默认为double'
						'float f = 12.35: ERROR! 损失精度,不能把double型直接赋值给float'
						'float f = 12.35F'
					字符型 	 char 
						'可以使用转义字符'
					布尔型	 boolean 
						' 不能使用 0、1 代替true  '
				引用数据类型变量（放入堆内存中）
					类		class 
						'字符串'
					接口	interface 
					数组	([]) 
	
	/* 基本数据类型转换 */
		可以从低到高转换
		有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。      
		byte/short/char 不会相互转换，他们三者在计算时首先转为int类型
		字符串String是引用数据类型， 不能通过强制类型转换直接转为基本类型
			int i3 = Integer.parseInt(str);
	
	/* API */
		API(Aplication Programming Interface, 应用程序编程接口)
	
	
/*
 *   进制
 */
	对于整数
		二进制：0,1 ，满2进1.以0b或0B开头。
		十进制：0-9 ，满10进1.
		八进制：0-7 ，满8进1. 以数字0开头表示。
		十六进制：0-9及A-F，满16进1. 以0x或0X开头表示。此处的A-F不区分大小写。
			如：0x21AF +1= 0X21B0
	
	所有数字在计算机底层都以二进制形式存在。
	计算机以补码的形式保存所有的整数。
		正数的原码、反码、补码都相同
		负数的补码是其反码加1。
		原码：直接将一个数值换成二进制数。
		反码：是对原码按位取反，只是最高位（符号位）确定为1。

	/* 转换 */
	十进制  二进制互转
		二进制转成十进制  乘以2的幂数
		十进制转成二进制  除以2取余数

/*
 *   运算符
 */
	// 算术运算符
		加/减/乘/除/取模/++/--/+
			整数之间做除法，结果还是整数
			对负数取模
			a=2;b=a++   //a=3;b=2
			a=2;b=++a   //a=3;b=3
			"he"+"llo"  // "hello"
	// 赋值运算符
		+= / -= / *= / /= / %=
	// 比较运算符（关系运算符）
		== / != / < / > / instanceof (检查是否为类的对象)		
	// 逻辑运算符
		& / |(逻辑或) / ! / && / ||(短路或) / ^(逻辑异或)
		
			a 		b 		a^b
			true	true 	false
			true	false	true 
			false 	true 	true
			false 	false 	false 
		
		“&”和“&&”的区别：
			单&时，左边无论真假，右边都进行运算；
			双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。
		
	// 位运算符 (直接对二进制运算)
		<< 	左移		3<<2 = 12   -->   3*2*2=12		空位补0，被移除的高位丢弃，空缺位补0。
		>>	右移		3>>1 = 1    -->   3/2=1			被移位的二进制最高位是0，右移后，空缺位补0；
														最高位是1，空缺位补1。
		>>>	无符号右移	3>>>1 = 1   -->   3/2=1			被移位二进制最高位无论是0或者是1，空缺位都用0补
		&	与											二进制位进行&运算，只有1&1时结果是1，否则是0;
		|	或			6|3 = 7							二进制位进行 | 运算，只有0 | 0时结果是0，否则是1
		^ 	异或		6^3 = 5							相同二进制位进行 ^ 运算，结果是0；1^1=0 , 0^0=0
														不相同二进制位 ^ 运算结果是1。1^0=1 , 0^1=1
		~	反码 		~6 = -7							正数取反，各二进制码按补码各位取反
														负数取反，各二进制码按补码各位取反
	
	
		<<		
		>>		
				最高位是1，空缺位补1。
		>>>
		&
		|
	// 三元运算符(if else)
		(条件表达式)?表达式1:表达式2
			true  -- 结果为表达式1
			false -- 结果为表达式2
	
	
	
	
	
	
	
	
	
	
	
	