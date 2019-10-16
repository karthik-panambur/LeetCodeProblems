//https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        int[] nums = new int[len];
        int ceil = Math.max(len1,len2);
        int j = 0;
        for(int i = 0;i<ceil;i++)
        {
            if(i < len1)
            {
                nums[j++] = nums1[i];
            }
            if(i < len2)
            {
                nums[j++] = nums2[i];
            }
        }
        java.util.Arrays.sort(nums);
        return len%2==0?(nums[len/2-1]+nums[len/2])/2.0:nums[len/2];
        
        
    }
}