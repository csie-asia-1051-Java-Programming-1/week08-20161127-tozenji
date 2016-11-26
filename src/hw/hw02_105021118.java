package hw;
import java.util.Scanner;
/*
 * Topic: å°‡å?ä?é¡Œå? å¼·??å¯ä»¥å??10ä»¥ä?‹ç?„å?„ç¨®?•¸å­—ç³»çµ±è?‰æ?? (å¿…é?ˆä½¿?”¨??è¿´)
 * Date: 2016/11/21
 * Author: 105021118 ¾G¾åª´
 */
public class hw02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.print("¶i¨î(<10): ");
		int m=scn.nextInt();
		System.out.print(fun(n,m));

	}
	public static String fun(int n,int m){
		String a=" ";
		if(n==0){
			return a;
		}else a=Integer.toString(n % m);
		return fun(n/m,m)+a;
		
	}

}
