package hw;
import java.util.Scanner;
/*
 * Topic: è«‹å¯«ä»¥é?åˆ¥?–¹å¼å¯«ä¸??‹ç?‹å?å¯é¡¯ç¤º??›ä?æ•¸å­—ç?? LED ??ˆä?çµ„ï?Œå¯? ¹??šè¼¸?…¥??„å?›ä?æ•¸å­—é¡¯ç¤ºæ•¸å­—ã?‚æ?”å?‚èªªï¼? ?”±?µ?›¤è¼¸å…¥ 1234 ï¼Œå?‡å¯?œ¨?¢å¹•ä?Šé¡¯ç¤ºå?‚å??
 * Date: 2016/11/21
 * Author: 105021118 ¾G¾åª´
 */

public class hw04_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String n=scn.nextLine();
		number.fun(n);				
	}

}
class number{
	public static void fun(String n){
		for(int x=0;x<5;x++){
			for(int y=0;y<4;y++){
				switch(n.charAt(y)){
				case '0' :if(x==0){(System.out.print("*****");}
				   else if (x==1){(System.out.print("*   *");}
				   else if (x==2){(System.out.print("*   *");}
				   else if (x==3){(System.out.print("*   *");}
				   else if (x==4){(System.out.print("*****");}break;
				    
				case '1' :if(x==0){(System.out.print("  *  ");}
			        else if (x==1){(System.out.print("  *  ");}
			        else if (x==2){(System.out.print("  *  ");}
			        else if (x==3){(System.out.print("  *  ");}
			        else if (x==4){(System.out.print("  *  ");}break;
			        
				case '2' :if(x==0){(System.out.print("*****");}
		            else if (x==1){(System.out.print("    *");}
		            else if (x==2){(System.out.print("*****");}
		            else if (x==3){(System.out.print("*    ");}
		            else if (x==4){(System.out.print("*****");}break;
		            
				case '3' :if(x==0){(System.out.print("*****");}
	                else if (x==1){(System.out.print("    *");}
	                else if (x==2){(System.out.print("*****");}
	                else if (x==3){(System.out.print("    *");}
	                else if (x==4){(System.out.print("*****");}break;
	            
				case '4' :if(x==0){(System.out.print("*   *");}
	                else if (x==1){(System.out.print("*   *");}
	                else if (x==2){(System.out.print("*****");}
	                else if (x==3){(System.out.print("    *");}
	                else if (x==4){(System.out.print("    *");}break;
	            
				case '5' :if(x==0){(System.out.print("*****");}
	                else if (x==1){(System.out.print("*    ");} 
	                else if (x==2){(System.out.print("*****");}
	                else if (x==3){(System.out.print("    *");}
	                else if (x==4){(System.out.print("*****");}break;
	            
				case '6' :if(x==0){(System.out.print("*    ");}
	                else if (x==1){(System.out.print("*    ");}
	                else if (x==2){(System.out.print("*****");}
	                else if (x==3){(System.out.print("*   *");}
	                else if (x==4){(System.out.print("*****");}break;
	            
				case '7' :if(x==0){(System.out.print("*****");}
	                else if (x==1){(System.out.print("    *");}
	                else if (x==2){(System.out.print("    *");}
	                else if (x==3){(System.out.print("    *");}
	                else if (x==4){(System.out.print("    *");}break;
	            
				case '8' :if(x==0){(System.out.print("*****");}
	                else if (x==1){(System.out.print("*   *");}
	                else if (x==2){(System.out.print("*****");}
	                else if (x==3){(System.out.print("*   *");}
	                else if (x==4){(System.out.print("*****");}break;
	            
				case '9' :if(x==0){(System.out.print("*****");}
	                else if (x==1){(System.out.print("*   *");}
	                else if (x==2){(System.out.print("*****");}
	                else if (x==3){(System.out.print("    *");}
	                 lse if (x==4){(System.out.print("    *");}break;
				}		
			}
		System.out.println();}
	}
}
