package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex04_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x =scn.nextInt();
		char r = scn.next().charAt(0);
		for (int a =x ; a> 0 ; a--){
			for (int b = 1 ; b<= a; b++){
				System.out.print(r);
			}
			System.out.println();
		}
		
	}

}
