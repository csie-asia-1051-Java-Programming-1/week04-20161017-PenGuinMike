package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex02_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		for (int i = 1 ; i <= x ; i ++){
			for(int z = 1 ; z <=y ; z ++){
				System.out.print(i+"x"+z+"="+i*z+"\t");
			}
			System.out.println();
		}
	}

}
