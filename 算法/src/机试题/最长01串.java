package 机试题;

import java.util.Scanner;

/**
 * @author 杨旭东
 * @date 2019年8月20日
 * @version 1.0
 * 题目描述：
如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。例如: "1","10101","0101010"都是交错01串。现在有一个01串s,想找出一个最长的连续子串,并且这个子串是一个交错01串。求出最长的这样的子串的长度是多少。

输入示例：
1011101011

输出示例：
5
 ———————————————— 
版权声明：本文为CSDN博主「橘子味的小南瓜」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/nanguabing007/article/details/89414943
 */
public class 最长01串 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char[] arr = string.toCharArray();
		int sum = 1;
		for (int i = 0; i < string.length() - 1; i++) {
			for (int j = i, num = 1; j < string.length() - 1; j++) {
				if(arr[j] != arr[j + 1]) {
					num = j - i + 2;
					sum = sum > num ? sum : num;
				}else {
					break;
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
