package 机试题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 杨旭东
 * @date 2019年8月20日
 * @version 1.0
 */
public class 质数求和 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		boolean[] bArr = new boolean[len];
		bArr[0] = true;
		bArr[1] = true;
		int sum = 0;
		for (int i = 2; i < bArr.length; i++) {
			if(bArr[i] == false) {
				int j = i * 2;
				while(j < bArr.length) {
					bArr[j] = true;
					j = j + i;
				}
			}
		}
		for (int i = 0; i < bArr.length; i++) {
			if(bArr[i] == false) {
				sum += i;
			}
		}
		System.out.println(Arrays.toString(bArr));
		System.out.println(sum);
		sc.close();
	}

}
