package ex;
/*
 * Topic:���ϥΪ̿�J�@�ӥ���� n�A���ۨϥλ��j�I�s�L�X n! �����G�C
 * Date: 2016/11/14
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�Jn��:");
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
