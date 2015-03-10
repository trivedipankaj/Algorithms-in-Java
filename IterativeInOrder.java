import java.util.Stack;


public class IterativeInOrder {
	
	public void iterativeInOrderTraversal(BSTNode root){
		if(root == null){
			return;
		}
		Stack<BSTNode> st = new Stack<BSTNode>();
		while(!st.isEmpty() || root !=null){
			while(root !=null){
				st.push(root);
				root = root.left;
			}
			root = st.pop();
			System.out.print(root.data+" ");
			root = root.right;
		}
	}
}
