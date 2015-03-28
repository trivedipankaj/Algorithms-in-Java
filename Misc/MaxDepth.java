
public class MaxDepth {
	public int getMaxDepth(BSTNode root){
		int left,right;
		if(root ==null){
			return 0;
		}
		left  = getMaxDepth(root.left);
		right = getMaxDepth(root.right);
		return (1+max(left,right));
	}

	private int max(int left, int right) {
		return left>right?left:right;
	}
}
