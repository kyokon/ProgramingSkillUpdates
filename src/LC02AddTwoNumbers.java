import definedClass.ListNode;

import java.util.Iterator;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LC02AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode FinalAns = new ListNode(0);
        ListNode Ans = FinalAns;
        boolean Upflag = false;
        int Calc = 0;
        while (l1 != null || l2 != null) {
            int plusL1 = (l1 != null) ? l1.val : 0;
            int plusL2 = (l2 != null) ? l2.val : 0;
            Calc = plusL1 + plusL2;
            if(Upflag){
                Calc += 1;
                Upflag = false;
            }
            if(Calc >= 10){
                Upflag = true;
                Calc = Calc - 10;
            }

            Ans.next = new ListNode(Calc);
            Ans = Ans.next;
            Calc = 0;
            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
        }
        if(Upflag){
            Ans.next = new ListNode(1);
        }

        return FinalAns.next;
    }

}