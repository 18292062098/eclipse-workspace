package 机试题;

/**
 * @author 杨旭东
 * @date 2019年8月20日
 * @version 1.0
 * 题目描述：
编写一个reverseadd函数，实现两个数逆置后再求和的功能，比如输入123，456就是求321+654，输出975。注意：输入100,200输出3,（自动去除开头的0）。

输入示例：
123

456

输出示例：
975
 */
public class 逆置求和 {

	public static void main(String[] args) {
		int sum = reverseadd(100, 120);		
		System.out.println(sum);
	}
	
	public static int reverseadd(int a, int b) {
		int reverseA = 0;
		int reverseB = 0;
		while(a != 0) {
			reverseA = reverseA * 10 + a % 10;
			a = a / 10;
		}
		while(b != 0) {
			reverseB = reverseB * 10 + b % 10;
			b = b / 10;
		}
		return reverseA + reverseB;
	}

}
