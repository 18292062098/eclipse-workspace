package 机试题;

import java.util.Scanner;

/**
 * @author 杨旭东
 * @date 2019年8月20日
 * @version 1.0
 * 题目描述：
求一个字符串的最大回文前缀长度。回文是指正反方向读起来都一样的字符串，比如“abcdcba”就是一个回文。"10010"中最大回文是“1001”，长度为4，所以输出4。一个字符串，至少包含一个字节。每个字节是一个字符。最大长度可能有几十万字节。 

输入示例：
asdfdsa

1010

10011

apple

输出示例：
7

3

4

1
 ———————————————— 
版权声明：本文为CSDN博主「橘子味的小南瓜」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/nanguabing007/article/details/89292869
 */
public class 最大回文 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		int sStrLen = 1;// 单回文
		int sIdxBegin = 0, sIdxEnd = 0;
		int dStrLen = 0;// 双回文
		int dIdxBegin = 0, dIdxEnd = 0;
		int len = string.length();
		char[] charStr = string.toCharArray();
		for (int i = 0; i < len - 1; i++) {
			// 单
			for (int b = i - 1, e = i + 1; b >= 0 && e < len; b--, e++) {
				if(charStr[b] == charStr [e]) {
					if(e - b + 1 > sStrLen) {
						sIdxBegin = b;
						sIdxEnd = e;
						sStrLen = e - b + 1;
					}
				}else {
					break;
				}
			}
			
			// 双
			for (int b = i, e = i + 1; b >= 0 && e < len; b--, e++) {
				if(charStr[b] == charStr [e]) {
					if(e - b + 1 > dStrLen) {
						dIdxBegin = b;
						dIdxEnd = e;
						dStrLen = e - b + 1;
					}
				}else {
					break;
				}
			}
		}
		//System.out.println("最大单回文：" + string.substring(sIdxBegin, sIdxEnd + 1));
		//System.out.println("最大双回文：" + string.substring(dIdxBegin, dIdxEnd + 1));
		System.out.println((sStrLen > dStrLen) ? sStrLen : dStrLen);
		sc.close();
	}

}
