//https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1,num2;
        int Carry = 0;
        ListNode ret = null;
        ListNode set = null;
        
        while(l1 != null || l2 != null)
        {           
            num1 = num2 = 0;
            if(l1 != null)
            {   
                num1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                num2 = l2.val;
                l2 = l2.next;
            }
           int n = num1 + num2 + Carry;
           Carry = n>=10?1:0;
           if(ret == null)
           {
               ret = new ListNode(n%10);        
               set = ret;
           }
           else
           {               
               ret.next = new ListNode(n%10);  
               ret = ret.next;
           }
        }
        if(Carry == 1)
        {
            ret.next = new ListNode(1);
        }
        return set;
    }
}