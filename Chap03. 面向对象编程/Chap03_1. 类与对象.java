/**
 * 
 *  1. 类与对象
 *  	面向对象的概念
 *  	类的定义
 *  	声明类、属性、方法
 *  	创建、使用对象
 *  	对象的生命周期
 *  	匿名对象
 *  
 */

面向对象与面向过程
	都是一种思想
	面向对象( Object Oriented Programming, OOP)
		将功能封装进对象
		强调具备了功能的对象
		更加强调运用人类在日常的思维逻辑中采用的思想方法和原则（抽象、分类、继承、聚合、多态等）
	面向过程( Procedure Oriented Programming)
		强调的是功能行为

面向对象的思想概述：
	程序员从执行者转换为了指挥者
	完成需求时：
		先去找具有所需功能的对象来用
		若不存在该对象，创建一个
		简化开发并提高复用
		
Java语言的基本元素：类( class)、对象( object)
	class 和 object 是面向对象的核心概念
	class：
		对一类事物的描述
		是抽象的、概念上的定义
	object：
		实际存在的该类事物的每个个体
		也称为 实例(instance)
	“万事万物皆对象”

类的成员
	Field  --属性 --- 对应类中的成员变量 
	Method --方法 --- 对应类中的成员方法 --函数
	
面向对象程序设计的重点
	类的设计
	定义类 - - - 定义成员变量和成员方法
	
	
面向对象的特征：
	封装( Encapsulation)、隐藏
	继承( Inheritance)
	多态( Polymorphism)


/**
 *  1.2 如何声明一个类
 */
1). 使用 class 关键字声明一个类

	class Person{}
	
2). 声明类的属性： 在类的内部，方法的外部，声明变量

	class Person{
		String name;
		int age;
	}


3). 声明方法：在类的内部，基本语法：
	修饰符 ( private, public, protected, default) 返回值类型 方法名(参数列表) {
		// 方法体
	}

	void sayHi(String name) {
		System.out.println("hi, " + name);
	}

4). 若方法需要有返回值，则使用 return
		
/**
 *  1.3 操作对象的属性和方法： 通过 . 的方式
 */
	
	Person p = new Person();
	p.name = "tom";
	p.age = 21;
	
	p.sayHi(p.name);

/**
 *  1.4 注意：
 *  > 	`如果创建了一个类的多个对象，
 *   	对于类中定义的属性，每个对象都拥有各自的一套副本，且互不干扰。
 *  > 	在同一个类中的访问机制，可以直接访问类中的成员变量（有一个例外）
 *  	不同类中的访问机制，首先要创建访问类的对象， 再用对象访问类中定义的成员
 *  >	类是引用类型
 *   
 */



















