package ex;
/*
 * Date: 2016/11/14
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int data[][] = new int [a][b];
		for(int i = 0 ; i <a;i++){
			for(int j = 0;j < b;j++){
				data[i][j] = scn.nextInt();
			}
		}
		System.out.print(data[a][b]);

	}

}
