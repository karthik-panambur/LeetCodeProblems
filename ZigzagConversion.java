//https://leetcode.com/problems/zigzag-conversion/

class Solution {
    public String convert(String s, int numRows) {
	    int iter = 0;
        boolean pos = true;
        int len = s.length();
        java.util.HashMap<Integer,String> hm = new java.util.HashMap<Integer,String>();
        if(len < numRows)
            return s;
        if(numRows == 1)
            return s;
        if(numRows == 2)
        {
            String temp="",temp1="";
            for(int i=0;i<len;i++)
            {
                
                if(i%2==0)
                {
                    temp = temp + s.charAt(i);
                }
                if(i%2==1)
                {
                    temp1 = temp1 + s.charAt(i);
                }
                
            }
            return temp+temp1;
        }
        for(int i = 1; i <= len; i++)
        {
            if(pos)
            {
                iter+=1;
                if(hm.containsKey(iter))
                {
                    String temp = hm.get(iter);
                    hm.put(iter,(temp+s.charAt(i-1)));
                }
                else
                {
                    hm.put(iter,(s.charAt(i-1)+""));
                }
                
            }
            if(!pos)
            {
                iter+=1;
                int key = numRows - iter;
                if(hm.containsKey(key))
                {
                    String temp = hm.get(key);
                    hm.put(key,(temp+s.charAt(i-1)));
                }
                
            }
            if((pos && numRows == iter) || (!pos && (iter == numRows - 2)))
            {
                pos = !pos;
                iter = 0;
            }
        }
        
        String sol = "";
        for(int i = 1; i <= numRows; i++)
        {
            sol = sol + hm.get(i);
        
        }
           return sol;
    }
}