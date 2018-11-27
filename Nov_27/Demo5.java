package cn.dkc.Nov_27;
/*
 	求一个最大连续子序列的和，并且返回序列和
 	F(i)表示以arr[i]结尾最大连续子序列的和
 	递推：
 	F(i) = max(F(i-1)+arr[i],arr[i])
 	譬如：
 	6，-3，-2
 	以6结尾的有{6}
 	以-3结尾的有{6，-3}，{-3}
 	以-2结尾的有{6，-3，-2}，{-3，-2}，{-2}
 */
public class Demo5 {
	public int FindGreatestSumOfSubArray(int[] arr) {
		if(arr.length<1)
			return -1;
		if(arr.length==1)
			return arr[0];
		int max = 0;
		int sum = arr[0];
		for(int i = 1;i<arr.length;i++) {
			sum = Math.max(sum+arr[i], arr[i]);
			max = Math.max(max, sum);
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {6,-3,-2,7,-15,1,2,2};
		System.out.println(new Demo5().FindGreatestSumOfSubArray(arr));
	}
}
