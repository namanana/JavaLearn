class chap2{
	public static void main(String [] args){
		
		/*  
		*   Identifier  
		*/
		
		// String &name = "atguithie"
		// String 2name = "atguigu"   Cannot start with a number
		// String class = "atguigu"   Cannot use keywords as a string name
		
		String class_name = "atguigu";
		
		String name = "atgued";
		String Name = "atgutewdc";
		
		int age = 2;
		
		/* 
		*   variety 
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
		// ERROR! major is only valid between a pair of {}
	}
}