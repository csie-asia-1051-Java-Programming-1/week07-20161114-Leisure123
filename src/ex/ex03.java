package ex;
/*
 * Topic:�мg�@�ӵ{���A���ϥΪ̿�J�@�Ӿ�ƤG���}�C�A
 * �إ� var2()�禡 ��std2()�i�H���O�p��G���}�C���ܲ��ƻP�зǮt�A�ç⵲�G�^�Ǩ�D�{���L�X�C

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
		float data[][] = new float [a][b];
		for(int i = 0 ; i < a ; i++){
			for(int j = 0 ; j < b ; j++){
				data[i][j] = scn.nextInt();
			}
		}
		System.out.println("�зǮt:" + Math.sqrt(std2(data,a,b)));
		}
	public static float std2(float data[][],int a,int b){
		float x = var2(data,a,b);
		for(int i = 0 ; i < a ; i++){
			for(int j = 0 ; j < b ; j++){
				data[i][j]=(data[i][j]-x);
				data[i][j]=(float)Math.pow(data[i][j], 2);
			}
		}
		float y = var2(data,a,b);
		System.out.println("�ܲ���:" + y);
		return y;
	}
	public static float var2(float data[][],int a,int b){
		float sum = 0;
		for(int i = 0 ; i < a ; i++){
			for(int j = 0 ; j < b ; j++){
				sum = sum + data[i][j];
			}
		}
		float y = sum / (a*b);
		return y;
	}

}
