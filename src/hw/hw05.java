package hw;
/*
 * Topic:寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。
 * 		例如:輸入 1234 回傳 4321
 * Date: 2016/11/14
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一串數字:");
		long n = scn.nextLong();
		System.out.print("反向輸出為:");
		System.out.print(fun(n));

	}
	public static String fun(long n ){
		long a = 0;
		if(n == 0){
			return "";
		}else{
			a = n % 10;
			System.out.print(a);
			return fun(n/10);
		}
		
	}

}
