package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    List<String[]> res = new ArrayList<String[]>();
    /****number of possible solutions****/
    int count=0;
    public List<String[]> solveNQueens(int n) {
        
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i]=-1;
        }
        solve(A,0,n);
        return res;
    }
    
    public void printBoard(int[] A, int n){
        String str[] = new String[n];
        for(int i=0; i<n; i++){
            String temp="";
            for(int j=0; j<n; j++){
                if(A[i]==j){
                    temp +="Q";
                }else{
                    temp +=".";
                }
            }
            str[i]=temp;
        }
        res.add(str);
    }
    
    public boolean isValid(int[] A, int col){
        for(int i=0; i<col; i++){
            if(A[i]==A[col] || Math.abs(A[i]-A[col])== (col-i)){
                return false;
            }
        }
        return true;
    }
    
    public void solve(int[] A, int col, int n){
         if(col==n){
             printBoard(A,n);
             count++;
         }else{
             for(int i=0; i<n; i++){
                 A[col] =i;
                 if(isValid(A,col)){
                     System.out.print(col+" ");
                	 solve(A,col+1,n);
                 }
             }
         }
    }
}