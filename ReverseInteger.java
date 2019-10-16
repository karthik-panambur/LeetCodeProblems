//https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        boolean neg = x<0?true:false;
		x=neg?x*-1:x;
		String sol="";
        while(x>0)
        {
        	int rem=x%10;
        	sol+=rem;
        	x=x/10;
        }
        try
        {
        	x = Integer.parseInt(sol);
        	x=neg?x*-1:x;
        	return x;
        }
        catch(Exception ex)
        {
            return 0;
        }
    }
}