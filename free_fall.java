package edu_mision;

public class free_fall {

	public static void main(String[] args) 
	{
	//	double x_t;
		//double t;
//		x_t=1000-((9.81*t*t))/2;
		//System.out.print(x_t);	
		
		fall(0,1000);		
	}
	public static void fall(int t, double xt) 
	{		
		xt=xt-(9.81*t*t)/2;		
		if(xt<0)
		{
			System.out.print("****충돌****");
			return;
		}
		System.out.print(t+"초 후 상공 "+xt+"m");
		System.out.println(" 현재 속도 : "+(9.81*t*t)+"m/s");
		t++;
		fall(t,xt);
	}


	
}

