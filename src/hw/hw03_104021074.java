package hw;
/*
 * Topic: �{���ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A����ϥΪ̿�J 999 �ɰ���
 *  �M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA�t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn
 * Date: 2016/10/17
 * Author: 104021074 ���øt
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
			System.out.print("�п�J�Ʀr: ");
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
		 
		}System.out.println("����:"+(a-1)+"�s:"+b+"�t��:"+c);
			System.out.println("�аݬO�_�~��(Y or n):  ");
			  z =scn.next().charAt(0);
			 if( z =='n'||z =='N'){
				 System.out.println("���¨ϥΥ��t��!!!");
				 break;
			 }
			}
		
	}

}
