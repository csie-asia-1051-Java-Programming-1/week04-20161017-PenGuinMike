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
		int x = n - m ;
		 int v1 = 1;
		 int v2 = 1;
		for(int i = n ;i>m ;i--){
		 v1 = v1*i;
		}//System.out.println("v1="+v1);
		for(int i =1 ;i<m ; i++){
			v2 = v2*i;
		}//System.out.println("v2="+v2);
		System.out.println("Answer="+v1/v2);
		
		
	}

}
