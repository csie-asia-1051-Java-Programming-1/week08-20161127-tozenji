package hw;
import java.util.Scanner;
/*
 * Topic: è«‹å¯«ä¸??? ??è¿´?‡½å¼?)?²è?Œå?é?²åˆ¶?•¸å­—è?‰æ?›æ?ä?Œé?²åˆ¶?•¸å­—ï?Œä?‹å?‚å?é?²åˆ¶??? 13 ??ƒè¼¸?‡ºäºŒé?²åˆ¶??? 1101
 * Date: 2016/11/21
 * Author: 105021118 ¾G¾åª´
 */
public class hw01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.print(fun(n));
	}
	public static String fun(int n){
		String m=" ";
		if(n==0){return m;}
		else m=Integer.toString(n%2);
		return fun(n/2)+m;
	}

}
