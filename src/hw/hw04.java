package hw;
/*
 * Topic:�g�@���j��ơA�D m�Bn ��ƪ��̤j���]�� gcd(m,n)����L��J
 * Date: 2016/11/14
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J��ӥ����:");
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println("�̤j���]�Ƭ�:"+gcd(m , n , m));

	}
	public static int gcd(int m , int n , int sum){
		if(n % sum == 0 && m % sum == 0){
			return sum;
		}else{
			return gcd(m , n , sum - 1);
		}
	}

}
