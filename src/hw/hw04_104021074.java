package hw;
/*
 * Topic: ���ϥΪ̿�J1, 2, 3, �P4�ﶵ�A
	 1. ��J n ����ܹϧ� (ex: n = 5)
	 2. ��J n ����ܹϧ�
	 3. ��J n (�����O�_��)����ܹϧ�
	 4. �����{��
 * Date: 2016/10/17
 * Author: 104021074 ���øt
 */
import java.util.*;
public class hw04_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�ܹϧ�: ");
		int x = scn.nextInt();
		switch(x){
			case 1:
				System.out.print("�п�Jn: ");
				int a0 = scn.nextInt();
				int vx = (a0/2)+1;
				for(int v1 = vx;v1>0;v1--){
					for(int v2 = v1;v2>0;v2--){
						System.out.print('@');
					}
					System.out.println();	
				}
				for(int v1 = 1;v1<=vx-1;v1++){
					for(int v2 = 1; v2<=v1+1;v2++){
						System.out.print('@');
					}System.out.println();	
				}
				
				break;
			case 2:
				System.out.print("�п�Jn: ");
				int a1 = scn.nextInt();
				int vx1 = (a1/2)+1;
				for(int v1 = 1;v1<=vx1;v1++){
					for(int v2 = 1 ; v2<=v1;v2++){
						System.out.print('%');
					}System.out.println();
				}
				for(int v1 = vx1-1;v1>0;v1--){
					for(int v2 = 1; v2<=v1; v2++){
						System.out.print('%');
					}System.out.println();
				}
				
				break;
			case 3:
				System.out.print("�п�Jn: ");
				int a2 = scn.nextInt();
				int vx2 = (a2/2)+1;
				for(int v1 = 1;v1<=vx2;v1++){
					for(int v2=1;v2<=vx2-v1;v2++){
						System.out.print(" ");
					}
					for(int v3 = 0;v3<=(2*v1)-2;v3++){
						System.out.print('#');
					}System.out.println();
				}
				for (int v1 = 1; v1<=vx2-1;v1++){
					for(int v2=0;v2<=v1-1;v2++){
						System.out.print(" ");
					}
					for(int v3=1;v3<=a2-(v1*2);v3++){
						System.out.print('#');
					}System.out.println();
				}
				break;
			case 4:
				System.out.print("���¨ϥΥ��t��:)");
				break;
		}
		
	}


	}

