import java.util.LinkedList;
import java.util.Queue;


public class LevelOrder {

	public void traverseLevelOrder(BSTNode root){
		Queue<BSTNode> q= new LinkedList<BSTNode>();
		BSTNode temp;
		if(root == null ){
			return;
		}
		q.add(root);
		while(!q.isEmpty()){
			temp = q.poll();
			System.out.print(temp.data+" ");
			if(temp.right!=null){
				q.add(temp.right);
			}
		}
		q.clear();
	}
}
