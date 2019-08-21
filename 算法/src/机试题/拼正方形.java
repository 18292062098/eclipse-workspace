package 机试题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 杨旭东
 * @date 2019年8月20日
 * @version 1.0
 * 题目描述：
小南瓜有4根木棍,长度分别为a,b,c,d（整米数）。木工师傅提供改变木棍长度的服务,如果小南瓜支付一块钱，就可以让一根木棍的长度改变1米（每次只能选择增加1米或者减少1米）。现小南瓜需要用这四根木棍拼凑一个正方形出来,最少需要支付多少硬币才能让这四根木棍拼凑出正方形。输入四个整数（以空格间隔），输出最少需要支付的价格。

输入示例：
4 1 5 4

输出示例：
4
 ———————————————— 
版权声明：本文为CSDN博主「橘子味的小南瓜」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/nanguabing007/article/details/89414943
 */
public class 拼正方形 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] split = string.split(" ");
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Integer(split[i]);
		}
		Arrays.sort(arr);
		System.out.println((arr[1] - arr[0]) + (arr[2] - arr[1]) + (arr[3] - arr[1]));
		sc.close();
	}

}
