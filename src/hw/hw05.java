package hw;
/*
 * Topic:�g�@���j��ơA���ϥΪ̿�J�@�Ӫ���ơA�z�L���j��ƹB���o��ϦV���Ʀr�r��æL�X�C
 * 		�Ҧp:��J 1234 �^�� 4321
 * Date: 2016/11/14
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@��Ʀr:");
		long n = scn.nextLong();
		System.out.print("�ϦV��X��:");
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
