//9==>Find All Numbers Disappeared in an Array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> H = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            H.add(nums[i]);
        }
        int count=1;
        for(int i=0 ;i<nums.length; i++){
            if(H.contains(count)){
                count++;
            }
            else{
                list.add(count);
                count++;
            }
        }
        return list;
    }
    
}

//==>Time complexity o(n)
//==>space complexity o(n)