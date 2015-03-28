
public class RootToLeaf {
	
	public void printRootToLeaf(BSTNode root,int[] path, int len){
		if(root !=null){
			path[len++] = root.data;
			if(root.left==null && root.right==null){
				for(int i=0; i<len;i++){
					System.out.print(path[i]+" ");
				}
				System.out.println();
			}
			printRootToLeaf(root.left,path,len);
			printRootToLeaf(root.right,path,len);
		}
	}
}
