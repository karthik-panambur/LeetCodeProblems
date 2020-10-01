//https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length == 0)
           return "";
        if(strs.length == 1)
            return strs[0];
        String str = "";
        int counter = Math.min(strs[0].length(),strs[1].length());
        int k = 0;
        while(k < counter && strs[0].charAt(k) == strs[1].charAt(k)){
            str += strs[0].charAt(k);
            k++;
        }
        if(str.isEmpty())return "";
        for(int i = 2; i<strs.length; i++){
            while(!str.isEmpty()){
                if(strs[i].startsWith(str))break;
                else str = str.substring(0,str.length()-1);
            }
        }
        return str;
    }
}