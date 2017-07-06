package rectangleArea223;

public class Solution
{
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) 
	{
		if(E >= C || G <= A || F >= D || H <= B)
		{
			return (D-B)*(C-A) + (H-F)*(G-E);
		}
//		
		if(A <= E && C >= G && F >= B && H <= D)
		{
			
			return (D-B)*(C-A);
		}
		
		if(A >= E && C <= G && F <= B && H >= D)
		{
			
				return (H-F)*(G-E);
			
		}
		
		int sum = 0;
		for(int i=A;i<C;++i)
		{
			for(int j=B;j<D;++j)
			{
				if(i >= E && i+1 <= G && j >= F && j+1 <= H)
				{
					sum += 1;
				}
				
			}
		}
		
		return (D-B)*(C-A) + (H-F)*(G-E) - sum;
		
    }
}
