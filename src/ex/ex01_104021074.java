package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 104021074 楊永聖
 */
	import java.util.Scanner;
public class ex01_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = 0;
		int x = 0;
		int y = 0;
		while(n!=-1){
			System.out.print("請輸入n: ");
			n = scn.nextInt();
			x = x+n;
			y++;
		}System.out.println("總和為:"+(x+1));System.out.println("平均為:"+(float)((x+1)/(y-1)));
	}

}
