package hw;
/*
 * Topic:糶患癹ㄧ计― mn ㄢ计程そ计 gcd(m,n)パ龄絃块
 * Date: 2016/11/14
 * Author: 105021011 残
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("叫块ㄢタ俱计:");
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println("程そ计:"+gcd(m , n));

	}
	public static int gcd(int m , int n){
		if(n == 0){
			return m;
		}else{
			return gcd(n , m % n);
		}
	}

}
