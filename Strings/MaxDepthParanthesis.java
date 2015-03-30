package algoInJava;
/****
 * We are given a string having parenthesis like below
     “( ((X)) (((Y))) )”
We need to find the maximum depth of balanced parenthesis, like 4 in above example. Since ‘Y’ is surrounded by 4 balanced parenthesis.

If parenthesis are unbalanced then return -1.

More examples:

S = "( a(b) (c) (d(e(f)g)h) I (j(k)l)m)";
Output : 4

S = "( p((q)) ((s)t) )";
Output : 3

S = "";
Output : 0

S = "b) (c) ()";
Output : -1 

S = "(b) ((c) ()"
Output : -1 

 * */
public class MaxDepthParanthesis {
	public int getMaxDepth(String s){
		int n = s.length();
		if(n==0) return 0;
		int curr=0; int max=0;
		for(int i=0; i<n; i++){
			if(s.charAt(i) == '('){
				curr++;
				if(curr>max){
					max=curr;
				}
			}else if(s.charAt(i) == ')'){
				if(curr>0){
					curr--;
				}else{
					return -1;
				}
			}
		}
		if(curr!=0){
			return -1;
		}
		return max;
	}
	

}
