package hw;
/*
 * Topic: 使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 )
	1, 1, 2, 3, 5
 * Date: 2016/10/17
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class hw01_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int y =0;
		int [] data = new int[1000];
		data[0]=1;
		data[1]=1;
			for(int i =2;i<=n;i++){
				data[i]=data[(i-2)]+data[(i-1)];
				//System.out.print(data[i]+"\t");
				}
			for(int i =0;i<=n;i++){
				System.out.print(data[i]+"\t");
			}
		}
		
		
	}


