package hw;
import java.util.Scanner;
/*
 * Topic: 請寫�??��?�迴程�?��?�輸?���??? int ??��?��?��?��?��?�並??�傳該�?��?�在二�?�制下�?��?��?��?��?��?�是 1，�?��??: 輸入 13 得到結�?�為 3
 * Date: 2016/11/21
 * Author: 105021118 �G�媴
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
