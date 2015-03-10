import java.util.Stack;


public class IterativePreOrder {
	
	public void iterativePreOrderTraversal(BSTNode root){
		if(root == null){
			return;
		}
		Stack<BSTNode> st = new Stack<BSTNode>();
		
		while(!st.isEmpty() || root !=null){
			while(root !=null){
				System.out.print(root.data+" ");
				st.push(root);
				root = root.left;
			}
			root = st.pop();
			root = root.right;
		}
	}
}
