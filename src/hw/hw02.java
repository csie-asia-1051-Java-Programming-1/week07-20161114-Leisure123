package hw;
/*
 * Topic:�H���j�]�p��ơA��J�@�ӥ���ƭ�(���t 0)�A�Ǧ^�ӼƭȬO�X���
 * Date: 2016/11/14
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@��Ʀr:");
		long n = scn.nextLong();
		System.out.println(n + "�� " + fun(n) +" ���");

	}
	public static long fun(long n){
		if(n == 0){
			return 0;
		}else{
			return 1 + fun(n/10);
		}
	}

}
