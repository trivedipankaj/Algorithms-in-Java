import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinarySearchTree {

	public BSTNode insertNode(BSTNode root,Integer data){
		if(root==null){
			return new BSTNode(data);
		}
		if(data >= root.data){
			root.right = insertNode(root.right,data);
		}else{
			root.left =  insertNode(root.left,data);
		}
		return root;
	}
	
	public void inOrder(BSTNode root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public void preOrder(BSTNode root){
		if(root!=null){
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void postOrder(BSTNode root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	public void getLevel(BSTNode root,Integer level,Integer max){
		if(root !=null){
			System.out.println(root.data+" ==>"+level+"====>"+(max+root.data));
			if(root.left ==null && root.right==null){
				System.out.println("root=>"+root.data+" ");
			}
			getLevel(root.left,level+1,max+ root.data);
			getLevel(root.right,level+1,max+root.data);
			
		}
	}
	
	/****
	 * Find Max in a Binary Tree , not in BST
	 * */
	public int findMax(BSTNode root){
		int left,right,max=-100000;
		if(root != null){
			left = findMax(root.left);
			right = findMax(root.right);
			max = left>right?left:right;
			max = root.data>max?root.data:max;
		}
		return max;
	}
	
	public BSTNode constructTree(List<Integer> list){
		BSTNode root = null;
		for(Integer member:list){
			root = insertNode(root,member);
		}
		return root;
	}
	/**
	 * BFS implementation on the binary search tree
	 * */
	public void printLevelOrder(BSTNode root){
		Queue<BSTNode> q = new LinkedList<BSTNode>();
		BSTNode temp;
		if(root !=null){
			q.add(root);
			while(!q.isEmpty()){
				temp = (BSTNode)q.poll();
				System.out.print(temp.data+" ");
				if(temp.left !=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
			}
			q.clear();
		}
	}
	
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
	
	public void printInorder(List<Integer> list){
		getLevel(constructTree(list),0,0);
		//printLevelOrder(constructTree(list));
		
	}
	
}
