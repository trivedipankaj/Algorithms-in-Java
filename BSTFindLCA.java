
public class BSTFindLCA {

	public BSTNode findLCA(BSTNode root, Integer a, Integer b){
		if(root == null) return root;
		if(root.data ==a || root.data==b){
			return root;
		}
		if(root.data>a && root.data<b){
			return root;
		}
		if(a>root.data && b>root.data){
			return findLCA(root.right,a,b);
		}
		return findLCA(root.left,a,b);
	}
}
