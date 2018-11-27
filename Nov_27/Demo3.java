package cn.dkc.Nov_27;

import java.util.Scanner;

/*
 	青蛙跳台阶问题:
 		这个方法没用动态规划，我们都知道，跳台阶问题就是要么这个台阶被跳上，要么被越过
 	那么我们用1表示跳过台阶，用0表示越过台阶，那么每个台阶都有两种可能，
 	要么被跳过，要么被越过(除第n个台阶外，因为最后一个台阶只能为1)，那么n个台阶总共有
 	2^(n-1)*1方法
 */
public class Demo3 {
	//时间复杂度为O(1)
	public int jumpFloorII(int n) {
		if(n<=0)
			return 0;
		return 1<<(n-1);
	}
	public static void main(String[] args) {
		System.out.println("请输入:>");
		Scanner s = new Scanner(System.in);
		System.out.println("方法数为:"+new Demo3().jumpFloorII(s.nextInt()));
	}
}
