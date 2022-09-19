class Solution {
    public boolean divideArray(int[] nums) {
         if((nums.length&1)!=0){
            return false;
        }
        // creating a frequency map
        
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        
        // if the element which has frequency and is not even, it means it's the condition is not satisfying
        
        
        for(int i=0;i<nums.length;i++){
            if((hm.get(nums[i])&1)!=0){
                return false;
            }
        }
        return true;
    }
}

//==>Time complexity: O(n)

//==>Auxiliary Space: O(n)
        