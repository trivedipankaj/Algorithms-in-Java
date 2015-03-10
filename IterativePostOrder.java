import java.util.Stack;


public class IterativePostOrder {
	
	public void iterativePostOrderTraversal(BSTNode root){
		if(root ==null){
			return;
		}
		Stack<BSTNode> first = new Stack<BSTNode>();
		Stack<BSTNode> second = new Stack<BSTNode>();
		BSTNode temp;
		first.push(root);
		while(!first.isEmpty()){
			temp = first.pop();
			second.push(temp);
			if(temp.left !=null){
				first.push(temp.left);
			}
			if(temp.right !=null){
				first.push(temp.right);
			}
		}
		first.clear();
		while(!second.isEmpty()){
			temp = second.pop();
			System.out.print(temp.data+" ");
		}
		
	}
}
