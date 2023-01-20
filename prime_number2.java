package edu_mision;

public class prime_number2 {
	public static boolean prime1(int num) {
		for (int i = 2; i<num; i++) {
			if(num%i ==0)
				return false;			
		}
		return true;
	}
	public void prime(int num) {
		System.out.println("입력 숫자  : "+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < args.length; i++)
			System.out.println("arg"+i+":"+args[i]);
		int n = Integer.parseInt(args[0]);
		if(prime1(n) == true)
			System.out.println("prime");
		else
			System.out.println("not prime");
		}
		
			
}


			
		



