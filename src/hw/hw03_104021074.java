package hw;
/*
 * Topic: 程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止
 *  然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n
 * Date: 2016/10/17
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class hw03_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char z ='a';
		while (true){
			int x = 0;
			int a = 0;
			int b = 0;
			int c = 0;
		while(x!=999){
			System.out.print("請輸入數字: ");
		 x = scn.nextInt();
		 if(x>0){
			 a++;
		 }
		 if(x==0){
			 b++;
		 }
		 if(x<0){
			 c++;
		 }
		 
		}System.out.println("正數:"+(a-1)+"零:"+b+"負數:"+c);
			System.out.println("請問是否繼續(Y or n):  ");
			  z =scn.next().charAt(0);
			 if( z =='n'||z =='N'){
				 System.out.println("謝謝使用本系統!!!");
				 break;
			 }
			}
		
	}

}
