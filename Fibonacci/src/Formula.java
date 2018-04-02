

public class Formula {
	
	public static double F(int n, double v1, double v2, int iFibNum) 
	{
		double v3 = 0;
		
		v3 = v1 + v2;
		
		switch (n)
		{
			case 1:
				return v1;
			case 2:
				return v2;
			case 3:
				return v3;
			default:
				if(iFibNum == 0)
				{
					iFibNum = 3;
				}
				break;
		}	
		
		if(iFibNum == n)
		{
			return v3;
		}
		else
		{
			iFibNum++;
			return F(n, v2, v3, iFibNum);
		}
		
		/*
		if(i==1)
		{
			return v1;
		}
		else if(i==2)
		{
			return v2;
		}
		
		else
		{
			return F(i-1, v2, v3);
		}
		*/
		/*
		 * 		F(n) = F(n-1)+F(n-2)		
		 * 
		 *  	1   returns  1) = 0 + 1 = 1
		 *  	2   returns  2) = 1 + 1 = 2
		 *  	3   returns  3) = 2 + 3 = 5
		 *  
		 *		3   returns  3) = 2 + 3 = 5
		 * 		2   returns  2) = 1 + 1 = 2
		 *  	1   returns  1) = 0 + 1 = 1
		 *
		 */

	}
	
}

