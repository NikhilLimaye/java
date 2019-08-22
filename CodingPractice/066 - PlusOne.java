class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 0;
        for(int i = digits.length -1 ; i>=0 ; i--)
        {            
            if(digits[i] < 9 )
            {
                if(carry>0)
                    digits[i] = digits[i] + carry;   
                else
                    digits[i] = digits[i] + 1;
                break;
            }
            else
            {
                if(i == 0)
                {
                    int[] temp = new int[digits.length + 1];
                    temp[0] = 1;
                    for(int j = 1 ; j < temp.length ; j++)
                        temp[j] = 0;                   
                    return temp;                        
                }
                carry = 1;
                digits[i] = 0;
            }                
        }
        
        return digits;
    }
}