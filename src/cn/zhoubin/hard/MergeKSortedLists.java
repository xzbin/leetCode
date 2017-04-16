package cn.zhoubin.hard;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/25.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeKSortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode worker = head;
        boolean isAllNULL = true;
        for (int index = 0; index < lists.length; index++) {
            isAllNULL = true;
            int minIndex = -1;
            if (lists[index] != null) {
                isAllNULL = false;
                if (minIndex == -1 || lists[index].val < lists[minIndex].val)
                    minIndex = index;
            }
            if (minIndex != -1) {
                worker.next = lists[minIndex];
                worker = worker.next;
                lists[minIndex] = lists[minIndex].next;
            }
            if (index == lists.length-1 && isAllNULL)
                break;
            index = 0;
        }

        return head.next;
    }

    public static void show(ListNode list) {
        if (list == null)
            System.out.println("null");
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
    }

    public static void main(String[] args) {

//        ListNode[] lists = new ListNode[3];//        null

        ListNode [] lists = new ListNode[2];
        ListNode one = new ListNode(0);
        ListNode two = new ListNode(1);
        lists[0] = two;
        lists[1] = one;// 0 1

        ListNode result = MergeKSortedLists.mergeKLists(lists);
        MergeKSortedLists.show(result);

    }
}
