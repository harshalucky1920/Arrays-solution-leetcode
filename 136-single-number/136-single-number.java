//6==>Single Number

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            if(i==nums.length-1){
                return nums[nums.length-1];
            }
            if(nums[i] !=nums[i+1]){
                 return nums[i];
            }
           
        }
        return 0;
    }
}

//==>Time complexity o(nlogn)
//==>space complexity o(1)