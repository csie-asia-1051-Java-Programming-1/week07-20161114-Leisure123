package hw;
/*
 * Topic:輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。
 * Date: 2016/11/14
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入m值:");
		int m = scn.nextInt();
		System.out.print("請輸入n值:");
		int n = scn.nextInt();
		int s = 0;
		if(m < n){
			s=m;
			m=n;
			n=s;
		}
		System.out.println(fun(m)/(fun(n)*fun(m-n)));

	}
	public static int fun(int a){
		if(a == 1){
			return 1;
		}else{
			return a*fun(a-1);
		}
		
	}

}
