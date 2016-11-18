package hw;
/*
 * Topic:以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數
 * Date: 2016/11/14
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一串數字:");
		long n = scn.nextLong();
		System.out.println(n + "為 " + fun(n) +" 位數");

	}
	public static long fun(long n){
		if(n == 0){
			return 0;
		}else{
			return 1 + fun(n/10);
		}
	}

}
