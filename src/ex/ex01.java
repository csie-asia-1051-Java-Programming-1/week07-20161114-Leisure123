package ex;
/*
 * Topic:�мg�@�ӵ{���A�ΰ}�C�x�s�ϥΪ̿�J�� n �Ӿ�ơA
 * 		�z�L�禡 var() �i�H�^�ǭp��Ӱ}�C�̪��Ʀr���ܲ��ƫ�A�C�L�X���G�C
 * Date: 2016/11/14
 * Author: 105021011 �B�Э�
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
		System.out.println("�ܲ���:" + var(data,n));
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

