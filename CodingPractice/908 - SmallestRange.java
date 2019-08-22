/*
Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].

After this process, we have some array B.

Return the smallest possible difference between the maximum value of B and the minimum value of B.

 

Example 1:

Input: A = [1], K = 0
Output: 0
Explanation: B = [1]
*/


class SmallestRange {
    public int smallestRangeI(int[] A, int K) {
        
        Arrays.sort(A);        
        int min = A[0] + K;
        
        int i = 0;        
        for(i = K ; i>-K ; i--)
        {             
            if(A[A.length -1] + i == min)
                break;                
        }
         
        int max = A[A.length -1] + i;
        return max-min;
    }
}
