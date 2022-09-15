//==>5Missing Number

class Solution {
    public int missingNumber(int[] nums) {
		
        int sum = nums.length*(nums.length+1)/2;
        
		for (int num : nums){
             sum -= num;
        }
           
        
		return sum;
    }
}

//==>Time complexity o(n)
//==>Space complexity o(1)
        
    
