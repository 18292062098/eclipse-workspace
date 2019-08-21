package 机试题;

import java.util.Scanner;

/**
 * @author 杨旭东
 * @date 2019年8月20日
 * @version 1.0
 * 题目描述：
输入一个字符串，此字符串中包含有大小写字母，逗号（“，”），空格（“  ”），现需要对其进行初始化。

初始化规则：每个逗号或空格后紧跟的第一个字母如果已经是大写，则保持不变，否则变为大写；其余字母如果有大写的，需要变为小写字母，而小写字母不变；逗号或空格原样输出。（要求输出后仍然是一个字符串）

输入示例：
abc,DeF ghi JKL,oPq

输出示例：
Abc,Def Ghi Jkl,Opq
 */
public class 字符串初始化 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ',' || charArray[i] == ' ') {
				if(i == charArray.length - 1) {
					break;
				}
				if(charArray[i + 1] >= 97 && charArray[i + 1] <= 122) {
					charArray[i + 1] = (char) (charArray[i + 1] - 32);
					i++;
				}else if(charArray[i + 1] >= 65 && charArray[i + 1] <= 90) {
					i++;
				}
			}else {
				if(charArray[i] >= 65 && charArray[i] <= 90) {
					charArray[i] = (char) (charArray[i] + 32);
				}
			}
		}
		System.out.println(String.valueOf(charArray));
		sc.close();
	}

}
