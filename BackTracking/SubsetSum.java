package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Thought: Same as subsets, condition is sum == target, if sum < target, go recursion
 * The most importance is the next number should be gotten from current i, so, helper(xxx, i) but not i+1, 
 * i + 1 can not get the same number. 
 * 
 *  In addition: remember to sort the int array at first!!!
 */
public class SubsetSum {
	int count=0;
	public  ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		combinationSumHelper(result, list, candidates, target, 0,0);

		return result;
	}

	private void combinationSumHelper(ArrayList<ArrayList<Integer>> result, 
			ArrayList<Integer> list, int[] candidates, int target, int position,int count) {

		int sum = 0;
		for (int x: list) {
			sum += x;
		}
		
       if (sum == target) {
			result.add(new ArrayList<Integer>(list));
			return;
		}

		if (sum < target) {
			count++;
			for (int i = position; i < candidates.length; i++) {
				list.add(candidates[i]);
				int sum1 = 0;
				for (int x: list) {
					sum1 += x;
				}
				 System.out.println("length="+list.size()+" sum="+sum1+"count="+count);
					
				combinationSumHelper(result, list, candidates, target, i+1,count);
				//System.out.println(list.size());
				list.remove(list.size() - 1);
			}
		}
	}
}
