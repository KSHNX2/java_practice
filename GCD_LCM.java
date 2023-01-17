package edu_mision;

public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=18;
		int min=12;
		int max1=18;
		int min1=12;
		int tmp=0;
		int rem;
		for(int i=0; i<3; i++) {	
			
			if(max/min==0) {
				System.out.println("최대공약수"+min);
				System.out.println("최소공배수"+(max1*min1)/min);ㅁ
			}
			else
				tmp=max;
				max=min;			
				min=tmp/min;
				System.out.println(min);
			}
		}
		
		
	}


