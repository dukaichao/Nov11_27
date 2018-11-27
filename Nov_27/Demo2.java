package cn.dkc.Nov_27;

import java.util.Scanner;

/*
 	动态规划之青蛙跳台阶
 	n个台阶
 	第一步:
 		跳一个台阶  还剩n-1个台阶 ----->  F(n-1)
 		跳两个台阶  还剩n-2个台阶 ----->  F(n-2)
 		.
 		.
 		.
 		跳n个台阶  还剩0个台阶       ----->   F(0)
 	就可以得出
 	F(n) = F(n-1)+F(n-2)+...+F(0)
 	F(n-1) = F(n-2)+F(n-3)+...F(0)
 	我们就可以得出F(n) = 2*F(n-1)
 */
public class Demo2 {
	//时间复杂度O(n)
	public int jumpFloorI(int n) {
		if(n<=0)
			return 0;
		//初始化   
		int total = 1;
		//递推
		for(int i = 2;i<=n;i++) {
			total *= 2;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println("请输入:>");
		Scanner s = new Scanner(System.in);
		System.out.println("方法数为:"+new Demo2().jumpFloorI(s.nextInt()));
	}
}
