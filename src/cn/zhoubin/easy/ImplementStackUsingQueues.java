package cn.zhoubin.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/2/13.
 */
public class ImplementStackUsingQueues {
    /**
     * Initialize your data structure here.
     */


    public ImplementStackUsingQueues() {
        MyStack();
    }
    Queue<Integer> queue;
    public void MyStack() {
        queue = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while(size-- > 1)
            queue.add(queue.poll());
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.size() == 0?true:false;
    }

    public static void main(String[] args) {
        /**
         * Your MyStack object will be instantiated and called as such:
         * MyStack obj = new MyStack();
         * obj.push(x);
         * int param_2 = obj.pop();
         * int param_3 = obj.top();
         * boolean param_4 = obj.empty();
         */

        ImplementStackUsingQueues isuq = new ImplementStackUsingQueues();
        isuq.push(2);


        System.out.println(isuq.empty());
        System.out.println(isuq.top());
        System.out.println(isuq.pop());


    }

}


