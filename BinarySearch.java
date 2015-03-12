
public class BinarySearch {
	public int BSearch(int[] arr, int k, int start, int end){
		if(start<=end){
			int mid = (start+end)/2;
			if(arr[mid]==k){
				return mid;
			}
			if(k < arr[mid]){
				return BSearch(arr,k,start,mid-1);
			}
			return BSearch(arr,k,mid+1,end);
		}
		return -1;
	}
}
