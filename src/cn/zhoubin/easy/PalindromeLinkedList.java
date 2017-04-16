package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/2/13.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null )
            return true;
        else if (head.next.next == null)
            return  isListTwoPalindrome(head);
        return isListMoreTwoPalindrome(head);
    }

    private boolean isListTwoPalindrome(ListNode head){
        if (head.val == head.next.val)
            return true;
        return false;
    }

    private boolean isListMoreTwoPalindrome(ListNode head){
        ListNode middleNode = getMiddleListNode(head);
        reverseListFromMiddleNode(middleNode);
        boolean result = isListTwoPartsPalindrome(head,middleNode.next);
        return result;
    }

    private ListNode getMiddleListNode(ListNode head){
        ListNode fast,slow;
        fast = slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private void reverseListFromMiddleNode(ListNode head){
        ListNode p = head.next;
        head.next = null;
        while (p != null){
            ListNode q = p;
            p = p.next;
            q.next = head.next;
            head.next = q;
        }
    }
    private boolean isListTwoPartsPalindrome(ListNode head,ListNode middleNode){
        while(middleNode != null){
            if (head.val != middleNode.val)
                return false;
            head = head.next;
            middleNode = middleNode.next;
        }
        return true;
    }

}
