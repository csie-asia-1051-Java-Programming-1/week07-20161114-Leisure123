package hw;
/*
 * Topic:叫糶ㄧ计 lcm(x,y,z)―计 xyz ぇ程そ计
 * Date: 2016/11/14
 * Author: 105021011 残
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("叫块タ俱计:");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		int sum3 = fun(x,y,z);
		System.out.println("程そ计:"+sum3);

	}
	public static int fun(int a , int b ,int c){
		int sum = 1;
		for(int i = a ; i > 1 ; i--){
			if(a % i == 0 && b % i == 0 && c % i == 0){
				sum = sum * i;
				a=a/i;b=b/i;c=c/i;
			}
		}
		for(int i = a ; i > 1 ; i--){
			if(a % i != 0 && b % i == 0 && c % i == 0){
				sum = sum * i;
				b=b/i;c=c/i;
			}
			if(a % i == 0 && b % i != 0 && c % i == 0){
				sum = sum * i;
				a=a/i;c=c/i;
			}
			if(a % i == 0 && b % i == 0 && c % i != 0){
				sum = sum * i;
				a=a/i;b=b/i;
			}
		}
		return a*b*c*sum;
	}

}
