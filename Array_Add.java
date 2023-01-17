package edu_mision;

import java.util.Scanner;

public class Array_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		System.out.print("배열의 크기를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int max=sc.nextInt();
		max=max*2;
		int[] a=new int [max];		
		int[] b=new int [max];
		
		
		System.out.print("배열 A의 값 : ");
		for(int i=0; i<a.length; i++) {
			a[i]=i;
			if(i%2==0) {
				a[i]=num++;					
			}
		System.out.print(a[i]+" ");			
		}
		
		System.out.println("");
		num=1;
		System.out.print("배열 B의 값 : ");
		for(int i=0; i<b.length; i++) {
			b[i]=i;		
			if(i%2!=0) {
				b[i]=num++;				
			}
			System.out.print(b[i]+" ");
		}
		
		System.out.println("");
				
		int c[]=new int[max];
		System.out.println("");
		
		System.out.print("배열 C의 값 : ");
		for(int i=0; i<c.length; i++) {
			if(i%2==0) {
				c[i]=a[i];
			}
			else if(i%2!=0) {
				c[i]=b[i];
			}		
			System.out.print(c[i]+" ");			
		}		
	}
}

