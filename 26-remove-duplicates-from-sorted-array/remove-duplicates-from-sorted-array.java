class Solution {
    public int removeDuplicates(int[] nums) {
        int l=1,r=1;
        for(int i=r;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
        
    }
}