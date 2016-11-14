package ex;
/*
 * Date: 2016/11/14
 * Author: 105021011 ¤B²Ð­è
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float data[] = new float [n];
		for(int i = 0 ; i < n ; i++){
			data[i]=scn.nextInt();
		}
		System.out.print("¼Ð·Ç®t:" + Math.sqrt(std(data,n)));
	}
	public static float std(float data[],int n){
		float b = var(data,n);
		for(int i = 0 ; i < n ; i++){
			data[i] =(float) (data[i]-b);
			data[i] =(float)Math.pow(data[i], 2);
		}
		float a = var(data,n);
		return a;
	}
	public static float var(float data[],int n){
		float sum = 0;
		for(int i = 0 ; i < n ; i++){
			sum = sum + data[i];
		}
		float b = sum / n;
		return b;
	}

}
