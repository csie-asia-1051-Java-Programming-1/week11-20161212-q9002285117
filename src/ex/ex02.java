package ex;

import java.util.Scanner;

/*寫一個程式求一整數序列所含之整數個數及平均值。一整數序列以空白鍵隔開數字。序列所含之整數個數及平均值。精確至小數點第 3 位(由小數點第 4 位四捨五入)
 * Date: 2016/12/12
 * Author: 105021038 傅琬鈞
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int sum2 = 0;
		String str = scn.nextLine();
		String data[] = str.split(" ");
		for (int i = 0; i < data.length; i++) {
			int j = Integer.parseInt(data[i]);
			sum++;
			sum2 = sum2 + j;
		}
		double a = (Math.round(((float) sum2 / sum) * 1000) * 0.001);
		System.out.println(sum);
		System.out.printf("%.3f", a);
	}
}