//https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    
    public boolean checkString(int i, int j,String s)
    {
        
        boolean flag = false;
        while(j >= i)
        {
            if(s.charAt(j) == s.charAt(i))
            {
                flag = true;
            }
            else
            {
                return false;
            }
            i++;
            j--;
        }
        return flag;
    }
    public String longestPalindrome(String s) 
    {
        int len = s.length();
        String pal = "";
        for(int i = 0;i<len-1;i++)
        {
            for(int j=len-1;j>i;j--)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    if((j-i+1) > pal.length())
                    {
                        if(checkString(i,j,s))
                            pal = s.substring(i,j+1);
                    }
                }
            }
        }
        return s.isEmpty()?"":(pal.isEmpty()?s.substring(0,1):pal);
    }
}