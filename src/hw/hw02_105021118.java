package hw;
import java.util.Scanner;
/*
 * Topic: 將�?��?題�?�強??�可以�??10以�?��?��?�種?��字系統�?��?? (必�?�使?��??�迴)
 * Date: 2016/11/21
 * Author: 105021118 �G�媴
 */
public class hw02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.print("�i��(<10): ");
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
