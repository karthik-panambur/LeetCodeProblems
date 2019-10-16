//https://leetcode.com/problems/integer-to-roman/

class Solution {
    public String intToRoman(int num) {
        int i = 1;
        String romanLiteraltoRet = "";
        while(num > 0){
            int temp = num%10;
            num = num/10;
            String romanLiteral = "";
            switch(i){
                case 1:if(temp < 4){
                    while(temp > 0){
                        romanLiteral = romanLiteral + "I"; 
                        temp--;
                        }
                    }
                    else if(temp == 4){
                        romanLiteral = "IV" + romanLiteral;
                    }
                    else if(temp == 5){
                        romanLiteral = "V" + romanLiteral;
                    }
                    else if(temp < 9){
                        romanLiteral = "V" + romanLiteral;
                     while(temp > 5){
                        romanLiteral = romanLiteral + "I"; 
                        temp--;
                        }
                    }
                    else{
                        romanLiteral = "IX" + romanLiteral;
                    }
                
                        
                    break;
                case 2:if(temp < 4){
                    while(temp > 0){
                        romanLiteral = "X" + romanLiteral; 
                        temp--;
                        }
                    }
                    else if(temp == 4){
                        romanLiteral = "XL" + romanLiteral;
                    }
                    else if(temp == 5){
                        romanLiteral = "L" + romanLiteral;
                    }
                    else if(temp < 9){
                        romanLiteral = "L" + romanLiteral;
                     while(temp > 5){
                        romanLiteral = romanLiteral + "X"; 
                        temp--;
                        }
                    }
                    else{
                        romanLiteral = "XC" + romanLiteral;
                    }
                    break;
                case 3:
                    if(temp < 4){
                    while(temp > 0){
                        romanLiteral = "C" + romanLiteral; 
                        temp--;
                        }
                    }
                    else if(temp == 4){
                        romanLiteral = "CD" + romanLiteral;
                    }
                    else if(temp == 5){
                        romanLiteral = "D" + romanLiteral;
                    }
                    else if(temp < 9){
                        romanLiteral = "D" + romanLiteral;
                     while(temp > 5){
                        romanLiteral = romanLiteral + "C"; 
                        temp--;
                        }
                    }
                    else{
                        romanLiteral = "CM" + romanLiteral;
                    }
                    break;
                case 4:
                    if(temp < 4){
                    while(temp > 0){
                        romanLiteral = "M" + romanLiteral; 
                        temp--;
                        }
                    }
                    break;
            }
            i++;
            romanLiteraltoRet = romanLiteral + romanLiteraltoRet;
        }
        return romanLiteraltoRet;
    }
}