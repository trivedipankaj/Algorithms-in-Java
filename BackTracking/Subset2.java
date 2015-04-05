package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {

    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> subsetsWithDup(int[] S) {
         Arrays.sort(S);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        backTrack(res,list,S,0);
        return res;  
    }
    
     public void backTrack(List<List<Integer>> res, 
    		List<Integer> list,int[] S, int position){
       	res.add(new ArrayList<Integer>(list));
    		 	
    	for(int i=position; i<S.length;i++){
    		if(position!=i && S[i] == S[i-1]){
    			continue;
    		}
    		list.add(S[i]);
    		backTrack(res, list,S,i+1);
    		list.remove(list.size()-1);
    	}
    }
    
}