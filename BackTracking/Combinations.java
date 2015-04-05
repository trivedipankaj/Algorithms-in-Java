package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        backTrack(res,list,n,k,1);
        return res;
        
    }
    
    public void backTrack(List<List<Integer>> res, List<Integer> list, int n, int k, int position){
        if(list.size() == k){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=position; i<=n; i++){
            list.add(i);
            backTrack(res,list,n,k,i+1);
            list.remove(list.size()-1);
        }
    }
    
}