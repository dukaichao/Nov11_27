package cn.dkc.Nov_27;

import java.util.Scanner;

/*	青蛙跳台阶  每次只能跳一个或者两个
 	应用的是裴波拉切数
 	类似问题还有矩形覆盖：我们用n个2*1的小矩形去覆盖2*n的大矩形，有多少种方法的问题
 * */
public class Demo4 {
	public int jumpFloorIII(int n) {
		if(n<=0)
			return 1;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		//初始化
		int x = 1;
		int y = 2;
		int result = 0;
		while(n>=3) {
			result = x + y;
			x = y;
			y = result;
			n--;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("请输入:>");
		Scanner s = new Scanner(System.in);
		System.out.println("方法数为:"+new Demo4().jumpFloorIII(s.nextInt()));
	}
}
