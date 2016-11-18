package ex;
/*
 * Topic:承上題，除了var() 函數之外，再用建立一個 std() 函數，
 * 程式在接收完使用者輸入的一維整數陣列之後，呼叫std()函式可得到陣列的標準差，
 * 特別注意，不要只用 std() 函數算結果，必須由std()去呼叫 var() 函數之後回到 std() 函式處理完再傳回給主程式，
 * 主程式再把結果印出。
 * Date: 2016/11/14
 * Author: 105021011 丁紹剛
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
		System.out.print("標準差:" + Math.sqrt(std(data,n)));
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
