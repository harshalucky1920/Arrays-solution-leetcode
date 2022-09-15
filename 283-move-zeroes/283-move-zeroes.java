//2==>Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int h=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
                count++;
            }
            else{
                nums[h]=nums[i];
                h++;
            }
        }
        for(int i=h;i<h+count;i++){
            nums[i] = 0;
        }
    }
}

//Time Complexity: O(n)
//spaceComplexity: O(1)