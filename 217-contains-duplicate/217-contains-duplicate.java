//==>7Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
         int n = nums.length;
    
    HashMap<Integer, Integer> HL = new HashMap<>();
    
    for(int i = 0; i < n; i++){
        if(HL.containsKey(nums[i])){
            return true;
        }
        else{
            HL.put(nums[i], 1);
        }
    }
    return false;
    
   }
}

//==>Time complexity o(n)
    
