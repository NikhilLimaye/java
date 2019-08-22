class Solution {
    public int mySqrt(int x) {
        long root = 0L; 
        long square = 0L;
        boolean found = false;
        while(!found)
        {            
            square = root*root;
            if(square<x)
                root++;
            else if(square == x)
                found = true;
            else
            {
                found = true;
                root--;
            }
                
        }
        
        return (int)root;
    }
}