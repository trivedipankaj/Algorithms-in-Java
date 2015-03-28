/***
 * Finding maximum element in a binary tree
 * Note: This is not a Binary Search Tree as finding maximum in
 * a binary search tree would be simpler and is done in LOG(N)
 * We are using BSTNode for Binary Tree as well. BST is a special case of Binary Tree
 * */
public class FindMax {
	
	public int FindMaxBT(BSTNode root){
		int left,right,max=-1000;
		if(root !=null){
			left = FindMaxBT(root.left);
			right =FindMaxBT(root.right);
			max  = left>right?left:right;
			max  = root.data>max?root.data:max;
		}
		return max;
	}
}
