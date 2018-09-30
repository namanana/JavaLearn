package chap03;


// 通过class声明一个类
public class Person {
		
	// 声明类的属性
	String name;
	int age;
	
	// 声明一个方法
	// void 表示不会返回任何数据
	void work() {
		System.out.println("work");
	}
	
	
	// 带返回值的方法
	String getName() {
		return name;
	}
	
	// 带参数的方法
	void sayHello(String personName) {
		System.out.println("Hello, " + personName);
	}
	
}


class TestPerson{
	
	public static void main(String[] args) {
		
		// 创建 Person 对象
		Person person = new Person();
		
		// 设置类的属性
		person.name = "Tom";
		person.age = 22;
		
		// 调用类的方法
		person.work();
		System.out.println("hey");
		
		
		String n = person.getName();
		System.out.println(n);
		
		person.sayHello("Java");
	}
	
}
