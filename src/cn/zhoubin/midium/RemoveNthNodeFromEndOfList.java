package cn.zhoubin.midium;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        if (n == 0) return head;
        int length = 0;
        ListNode addheadNodeList = new ListNode(0);
        addheadNodeList.next = head;

        ListNode p = head;
        while (p != null){
            length++;
            p = p.next;
        }
        int preLength = length - n;

        p = addheadNodeList;
        while (preLength > 0){
            p = p.next;
            preLength--;
        }

        ListNode q = p.next;
        p.next = q.next;
        return addheadNodeList.next;
    }

    public static void main(String[] args) {
//        null
//        ListNode head = null;
//    ListNode result = RemoveNthNodeFromEndOfList.removeNthFromEnd(head,0);
//    System.out.println(result);
//        ListNode 1 n 1
//        ListNode head = new ListNode(0);
//        ListNode result = RemoveNthNodeFromEndOfList.removeNthFromEnd(head,1);
//        System.out.println(result);

//        ListNode 1 n 0
        ListNode head = new ListNode(0);
        ListNode result = RemoveNthNodeFromEndOfList.removeNthFromEnd(head,0);
        System.out.println(result);

//        ListNode 2 n 3
//        ListNode 2 n 0
    }
}
