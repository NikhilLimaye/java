class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target)
                return i;
            else if(nums[i]> target)
            {
                index = i;
                break;
            }         
            else if( i == nums.length -1)
            {
                index = i+1;   
                break;
            }
        }
        return index;
    }
}