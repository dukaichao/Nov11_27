package cn.dkc.Nov_27;

import java.math.BigInteger;
import java.util.Scanner;

/*
 	动态规划之斐波拉切数
 	
 */
public class Demo1 {
	public int Fab(int n) {
		if(n<=0)
			return 0;
		if(n == 1|| n == 2)
			return 1;
		//初始化
		//x 表示第一个数
		//y 表示第二个数
		int x = 1;
		int y = 1;
		int result = 0;
		//状态转移方程
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
		System.out.println(new Demo1().Fab(s.nextInt()));
	}
}
