package ex;
/*
 * Date: 2016/11/14
 * Author: 105021011 ¤B²Ð­è
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("½Ð¿é¤Jn­È:");
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
