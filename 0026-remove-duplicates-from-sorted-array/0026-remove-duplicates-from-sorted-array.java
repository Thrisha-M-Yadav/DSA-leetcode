class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0){
            return 0;
        }

        int left = 0;
        for(int rgt =1;rgt<nums.length;rgt++){
            if(nums[left]!=nums[rgt]){
                left++;
                nums[left]=nums[rgt];

            }

        }
        return left+1;
    }
}