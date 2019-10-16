//https://leetcode.com/problems/container-with-most-water/


class Solution {
    public int maxArea(int[] height) {
    int area = 0;
    for(int i = 0 ; i<height.length-1; i++){
        for(int j = i+1; j<height.length; j++){
            int len = Math.min(height[i],height[j]);
            int breadth = j-i;
            area = Math.max(area,(len*breadth));
        }   
      }
    return area;
    }
}