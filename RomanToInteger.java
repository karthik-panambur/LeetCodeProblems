//https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        int sol = 0;
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == 'I'){
                if((i+1) < s.length() && s.charAt(i+1) == 'V'){
                    i++;
                    sol = sol+4;
                }
                else if((i+1) < s.length() && s.charAt(i+1) == 'X'){
                    sol = sol+9;
                    i++;
                }
                else{ 
                    sol = sol + 1;
                }
            }
            else if(s.charAt(i) == 'V'){
                sol = sol + 5;
            }
            else if(s.charAt(i) == 'X'){
                if((i+1) < s.length() && s.charAt(i+1) == 'L'){
                    i++;
                    sol = sol+40;
                }
                else if((i+1) < s.length() && s.charAt(i+1) == 'C'){
                    sol = sol+90;
                    i++;
                }
                else{ 
                    sol = sol + 10;
                }
            }
            else if(s.charAt(i) == 'L'){
                sol = sol + 50;
            }
            else if(s.charAt(i) == 'C'){
                if((i+1) < s.length() && s.charAt(i+1) == 'D'){
                    i++;
                    sol = sol+400;
                }
                else if((i+1) < s.length() && s.charAt(i+1) == 'M'){
                    sol = sol+900;
                    i++;
                }
                else{ 
                    sol = sol + 100;
                }
            }
            else if(s.charAt(i) == 'D'){
                sol += 500;
            }
            else if(s.charAt(i) == 'M'){
                sol += 1000;
            }
        }
        return sol;
    }
}