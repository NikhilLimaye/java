/*
Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.

 

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 

Note:

1 <= A.length <= 1000
1 <= A[0].length <= 1000
*/

class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        
        int[][] T = new int[A[0].length][A.length];
        
        int common = 0;
                
        while( common < A[0].length)
        {
            for(int row = 0, col = 0 ; row<A.length && col<A.length ; row++,col++)
              T[common][col] = A[row][common];    
            
            common++;
        }
                
    return T;
        }
}
