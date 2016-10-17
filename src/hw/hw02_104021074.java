package hw;
/*
 * Topic: 使用者輸入正整數 n 與 m 然後計算  C的n取m---->n!/m!*(n!-m!)
 * Date: 2016/10/17
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class hw02_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int x = 1;
		int y = 1;
		for (int i = 1 ; i<=n; i++){
			x *=i;
		}
		System.out.println(x);
		for (int i = 1 ; i<=m; i++){
			y *=i;
		}System.out.println(y);
		float z = (float) x/ (float) (y*(x-y));
		System.out.print(z);
		
	}

}
