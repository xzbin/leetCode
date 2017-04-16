package cn.zhoubin.midium;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        int carry = 0;
        ListNode pre = head;

        while (l1 != null || l2 != null) {
            ListNode p = new ListNode(0);
            int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            p.val = sum % 10;
            carry = sum / 10;
            pre.next = p;
            l1 = (l1 == null) ? l1:l1.next;
            l2 = (l2 == null) ? l2:l2.next;
        }
        return head;
    }


}
