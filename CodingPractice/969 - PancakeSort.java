/*

Given an array A, we can perform a pancake flip: We choose some positive integer k <= A.length, then reverse the order of the first k elements of A.  We want to perform zero or more pancake flips (doing them one after another in succession) to sort the array A.

Return the k-values corresponding to a sequence of pancake flips that sort A.  Any valid answer that sorts the array within 10 * A.length flips will be judged as correct.

 

Example 1:

Input: [3,2,4,1]
Output: [4,2,4,3]
Explanation: 
We perform 4 pancake flips, with k values 4, 2, 4, and 3.
Starting state: A = [3, 2, 4, 1]
After 1st flip (k=4): A = [1, 4, 2, 3]
After 2nd flip (k=2): A = [4, 1, 2, 3]
After 3rd flip (k=4): A = [3, 2, 1, 4]
After 4th flip (k=3): A = [1, 2, 3, 4], which is sorted. 

*/


class PancakeSort {
    public List<Integer> pancakeSort(int[] A) {
        
        List<Integer> result = new ArrayList();
        if(sorted(A))
            return result;
        
        int limit = A.length;
        while(!sorted(A) && limit>0)
        {
            int max = findMaxIndex(A,limit);  

            flip(A,max+1);
            flip(A,limit);
            
            result.add(max+1);            
            result.add(limit);

            limit--;
            
        }            
                        
        return result;
    }
    
    public void flip(int arr[], int k)
    {
        for(int i = 0 ; i<k/2 ; i++)
        {
            int temp = arr[i];
            arr[i] = arr[k-i-1];
            arr[k-i-1] = temp;
        }
    }
    
    public int findMaxIndex(int[] arr, int limit)
    {
        int max = 0;
        for(int i = 0 ; i<limit ;i++)
        {
            if(arr[i]>arr[max])
                max = i;
        }
        return max;
        
    }
    
    public boolean sorted(int arr[])
    {
        
        for(int i = 1 ; i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
}