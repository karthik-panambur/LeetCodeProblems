//https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        if(x<0)return false;
        int rem = 0, temp = 0;
        while(x>0)
        {
            rem = x%10;
            temp = temp*10 + rem;
            x/=10;
        }
        return y==temp?true:false; 
    }
}