package hw;
import java.util.Scanner;
/*
 * Topic: 請寫�??? ??�迴?���?)?��?��?��?�制?��字�?��?��?��?��?�制?��字�?��?��?��?��?�制??? 13 ??�輸?��二�?�制??? 1101
 * Date: 2016/11/21
 * Author: 105021118 �G�媴
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
