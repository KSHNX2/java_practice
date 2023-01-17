package edu_mision;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=0;
		String q="";
		//Scanner sc = new Scanner(System.in);		
		System.out.print("이진수로 변환할 정수를 입력하세요 : ");
		//t = sc.nextInt();
		t=13;
		System.out.println(t);		
		System.out.println(t/2);
		System.out.println(t%2);
		
		
		while(t!=0) {
			if (t/2==0) {
				q=t%2+q;				
				t=t/2;				
			}
			else {
				q=t%2+q;				
				t=t/2;
			}						
		}
		System.out.print(q);
		
	}
}

		
	


