//https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public int myAtoi(String str) {
        char[] x = str.toCharArray();
		boolean notFound = true;
		int temp = 0, sum = 0;
		boolean neg = false;
		for(char s: x)
		{
			if(notFound && (Character.isDigit(s) || s == '-' || s == '+' || s == '.'))
			{	
				notFound = false;
				if(Character.isDigit(s))
				{
                    int ch = Character.getNumericValue(s);
                    sum = neg ? temp*10 - ch:temp*10 + ch;
					temp = sum;
				}
				if(s == '-')
				{
					neg = true;
				}
                if(s == '.')
                {
                    return 0;
                }
			}
            else if(notFound && Character.isLetter(s))
			{
				return 0;
			}
			else if(!notFound && !Character.isDigit(s))
			{
				return sum;
			}
			else if(!notFound && Character.isDigit(s))
			{
                int ch = Character.getNumericValue(s);
				if(!neg && sum != 0 && sum > (Integer.MAX_VALUE - ch)/10 )
				{
					return (Integer.MAX_VALUE);
				}
				if(neg && sum !=0 && sum < (Integer.MIN_VALUE+ ch)/10)
				{
					return (Integer.MIN_VALUE);
				}
				
				sum = neg ? temp*10 - ch:temp*10 + ch;
				temp = sum;
			}
		}
    return sum;
    }
}