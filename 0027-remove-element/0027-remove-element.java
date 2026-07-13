class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length ==0){
            return 0;
        }

        int left =0;
        for(int rgt =0; rgt<nums.length;rgt++){
            if(nums[rgt] != val){
        
                nums[left]=nums[rgt];
                left++;
            }
        }
        return left;
    }
}