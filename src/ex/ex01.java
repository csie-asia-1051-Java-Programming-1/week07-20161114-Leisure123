package ex;
/*
 * Date: 2016/11/14
 * Author: 105021011 ¤B²Ð­è
 */

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		float data[] = new float [n];
		for(int i = 0 ; i < n ; i++){
			data[i]=scn.nextInt();
		}
		float a = (float) (var(data,n));
		for(int i = 0 ; i < n ; i++){
			data[i]=(data[i]-a);
			data[i]=data[i]*data[i];
//			System.out.print(data[i] +"\t");
		}
		System.out.println("ÅÜ²§¼Æ:" + var(data,n));
	}
	public static float var(float data[],float n){
		float sum = 0;
		for(int i = 0 ; i < n ; i++){
			sum = sum + data[i];
		}
		float b =sum/n; 
		return b;
		
	}

}

