
public class ConvertArrToBST {
	public BSTNode convertToBST(int arr[], int start, int end){
        if(start<=end){ 
        System.out.println("start="+start+" end="+end);
		int mid = start + (end-start)/2;
		BSTNode node = new BSTNode(arr[mid]);
		node.left = convertToBST(arr,start,mid-1);
		node.right = convertToBST(arr,mid+1,end);
		return node;
      }
        return null;
	}
}
