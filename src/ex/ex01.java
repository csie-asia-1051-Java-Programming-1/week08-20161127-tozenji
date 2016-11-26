package ex;
import java.math.BigInteger;
import java.util.Scanner;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021118 鄭曉玫
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String string1 = scn.nextLine();
		BigInteger integer1=new BigInteger(string1 );
		System.out.println(integer1.toString(2));
	}

}
