package combinationSumIII216;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	List<List<Integer>> lists = new ArrayList<>();

	public List<List<Integer>> combinationSum3(int k, int n) 
	{
		List<Integer> list2 = new ArrayList<>();
		combination(list2,k,1,n);
		return lists;
    }
	
	private void combination(List<Integer> comb, int k,  int start, int n) {
		if (comb.size() == k && n == 0) {
			List<Integer> li = new ArrayList<Integer>(comb);
			lists.add(li);
			return;
		}
		for (int i = start; i <= 9; i++) {
			comb.add(i);
			combination(comb, k, i+1, n-i);
			comb.remove(comb.size() - 1);
		}
	}
	
}
