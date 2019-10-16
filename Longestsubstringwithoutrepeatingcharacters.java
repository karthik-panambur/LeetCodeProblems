//https://leetcode.com/problems/longest-substring-without-repeating-characters/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        String x="";
        int wLen = s.length();
        int ret = (0 - wLen);
        for(int i = 0; i< wLen;i++)
        {
            String c = s.charAt(i) + "";
            if(x.contains(c))
            {
                int siz = x.length();
                ret = ret <= siz ? siz : ret;
                x = x.substring((x.indexOf(c)+1));
                x += c;
                
            }
            else{
                x += c;
                int len = x.length();
                ret = ret < len ? len : ret;
            }
            
        }
        return ret < 0 ? wLen : ret;
    }
}