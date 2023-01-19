package edu_mision;



public class multiplication_table {
	public static int c=1;
	public static int d;
	public static void mul1(int a,int b) {
		
	
		
		if(c<10) {			
			System.out.print(c+"x"+a+"="+c*a+"\t");
			c++;
			if(c==10) {
				a++;
				System.out.println("");
				
			}
			mul1(a,b);			
		}
		
	}
	public static void mul2(int c, int d) {
		
		
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i<10; i++) {
			for(int q = 2; q<10; q++) {
				System.out.print(q+"*"+i+"="+i*q+"\t");
				if(q==9)
					System.out.println();
			}			
		}
		
		System.out.println();
		
		mul1(2,9);
	}
	


}
