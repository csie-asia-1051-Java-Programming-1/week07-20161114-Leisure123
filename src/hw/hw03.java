package hw;
/*
 * Topic:��J��Ӿ�ơA�ϥλ��j��ƩI�s��X C(m,n)�C
 * Date: 2016/11/14
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�Jm��:");
		int m = scn.nextInt();
		System.out.print("�п�Jn��:");
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
