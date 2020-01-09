package rangeSumQueryImmutable303;

public class NumArray
{
	private int[] num;
	public NumArray(int[] nums)
	{
        this.num = nums;
        for(int i=1;i<num.length;++i)
        {
        	num[i] = num[i] + num[i-1];
        }
    }

    public int sumRange(int i, int j) 
    {
    	if(i == 0)
    	{
    		return num[j];
    	}
        return num[j] - num[i-1];
    }
}
