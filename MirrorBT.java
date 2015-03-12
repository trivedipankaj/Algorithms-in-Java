
public class MirrorBT {
	public TreeNode convertToMirror(TreeNode root){
		TreeNode temp;
		if(root ==null) return null;
		convertToMirror(root.left);
		convertToMirror(root.right);
		temp = root.left;
		root.left =root.right;
		root.right =temp;
		return root;
	}
}
