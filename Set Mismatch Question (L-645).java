class Solution {
    public int[] findErrorNums(int[] nums) {
        int a = -1 , b = -1;
        
        for(int i : nums)
        {
            if(nums[Math.abs(i)-1]<0)
                a = Math.abs(i);
            else
                nums[Math.abs(i) -1] *= -1;
        }
        for(int i =0; i<nums.length;i++)
        {
            if(nums[i]>0)
                b = i+1;
        }
        return new int[]{a,b};
    }
}