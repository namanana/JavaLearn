package chap02_2;

import java.util.Scanner;
//import java.util.scores; // scoress.stream(a).min().getAsInt()
//import java.util.Collections;

public class TestScore {

	public static void main(String[] args) {
		/**
		 *  1. 从键盘读入学生成绩，找出最高分，并输出成绩等级
		 *  	成绩 >= 最高分-10 -- 'A'
		 *  	成绩 >= 最高分-20 -- 'B'
		 *  	成绩 >= 最高分-30 -- 'C'
		 *  	其余 -- 'D'
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("学生人数：");
		int num = sc.nextInt();
		
		int [] scores = new int[num];
		
		for(int i = 0; i < num; i++) {
			scores[i] = sc.nextInt();
			System.out.println("Student["+ i + "]" + "的成绩为： " + scores[i]);
		}
		
		int max;
		int min;
		int [] m = new int[2];
		m = MaxMin.main(scores);
		max = m[0];
		min = m[1];
		System.out.println("max: " + max + "\nmin: " + min);
		
		
		for(int j = 0; j < num; j++) {
			if(scores[j] >= max - 10) {
				System.out.println("Student[" + j + "]" + " is 'A'.");
			}else if(scores[j] >= max-20) {
				System.out.println("Student[" + j + "]" + " is 'B'.");
			}else if(scores[j] >= max-30) {
				System.out.println("Student[" + j + "]" + " is 'C'.");				
			}else {
				System.out.println("Student[" + j + "]" + " is 'D'.");								
			}
		}
		
		
	}

}

class MaxMin{
    
	public static int[] main(int[] args) {

        int maxIndex = args[0];//定义最大值为该数组的第一个数
        int minIndex = args[0];//定义最小值为该数组的第一个数
        //遍历循环数组

        for (int i = 0; i < args.length; i++) {
            if(maxIndex < args[i]){
                maxIndex = args[i];
            }
            if(minIndex > args[i]){
                minIndex = args[i];
            }
        }
        int [] m = new int[2];
        m[0] = maxIndex;
        m[1] = minIndex;
        return m;
	}
}
