class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0,sum=0,length=Integer.MAX_VALUE;
          for(int end=0;end<nums.length;end++){
	         sum+=nums[end];
	      while(sum>=target){
		  length=Math.min(length,end-start+1);
		  sum-=nums[start];                  
		  start++;
	  }

}
if(length==Integer.MAX_VALUE) return 0;
return length;
    }
}

//==> Time complexity o(n)
//==> space complexity o(1)