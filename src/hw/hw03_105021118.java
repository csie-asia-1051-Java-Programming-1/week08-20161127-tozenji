package hw;
import java.util.Scanner;
/*
 * Topic: è«‹å¯«ä¸??‹é?è¿´ç¨‹å?ï?Œè¼¸?…¥ä¸??? int ??‹æ?‹ç?„è?‡æ?™ï?Œä¸¦??å‚³è©²è?‡æ?™åœ¨äºŒé?²åˆ¶ä¸‹æ?‰å?šå?‘å?‹ä?å?ƒæ˜¯ 1ï¼Œä?‹å??: è¼¸å…¥ 13 å¾—åˆ°çµæ?œç‚º 3
 * Date: 2016/11/21
 * Author: 105021118 ¾G¾åª´
 */
public class hw03_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.print(fun(n));

	}
	public static int fun(int n){
		int m=0;
		if(n==0){
			return m;
		}else if(n%2==1){
			m=m+1;
		}return fun(n/2)+m;
	}

}
