
public class BTFindLCA {
	public BSTNode findBTLCA(BSTNode root, Integer a, Integer b){
		if(root == null) return root;
		if(root.data==a || root.data==b) return root;
		BSTNode left, right;
		left = findBTLCA(root.left,a,b);
		right = findBTLCA(root.right,a,b);
		if(left!=null && right!=null){
			return root;
		}
		return left!=null?left:right;
	}
}
