package ex;
/*
 * Topic:讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果。
 * Date: 2016/11/14
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		int n = scn.nextInt();
		System.out.println(n + "! = "+ fun(n));

	}
	public static int fun(int n){
		if(n == 1){
			return 1;
		}else{
			return n*fun(n-1);
		}
	}

}
