package cn.zhoubin.easy;

/**
 * Created by Administrator on 2016/12/25.
 */



class father{}
class sonOne extends father{
    public sonOne(){
        System.out.print("sonOne"); ;
    }
}
class sonTwo extends father{}

interface fatherOne {public void show();}
class sonOneImp implements fatherOne {
    public void show(){
        System.out.println(21);
    }
}
public class ReverseBits {
    public father test(){
        return new sonOne();
    }
//    public int reverseBits(int n) {
//        int result = 0;
//        for (int i = 0; i < 32; i++) {
//            result += n & 1;
//            n >>>= 1;   // CATCH: must do unsigned shift
//            if (i < 31) // CATCH: for last digit, don't shift!
//                result <<= 1;
//            //        System.out.print(result);
//            return result;
//        }


    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int [2];
        int left = 0,right = numbers.length -1;
        while (left < right){
            int sum = numbers[left] + numbers[right];

        }

        return null;
    }

    public String convertToTitle(int n) {
//        return n>26 ? new String((convertToTitle(n / 26) + ((n % 26) - 1 + 'A'))):new String('A' + n -1)        return n>26 ? new String((convertToTitle(n / 26) + ((n % 26) - 1 + 'A'))):new String('A' + n -1);
        return n == 0 ?"" :convertToTitle((n-1) / 26) + (char)('A' + n %26 -1 );
    }

    public int times = 0;

    public int titleToNumber(String s) {
        int lastCharToNumber = stringLastCharToNumber(s);
        return sumTitleToNumber(s.substring(0,s.length()-1),Math.pow (26,times++)*lastCharToNumber);
//        int result = 0;
//        for (int i = 0;i<s.length();i++){
//            result = 26 * result + s.charAt(i) - 'A' + 1;
//        }
//        return result;
    }

    public int charToNumber(char c){
        char baseChar = 'A';
        int charNumber = c - baseChar + 1;
        return charNumber;
    }

    public int stringLastCharToNumber(String s){
        int lastCharToNumber = charToNumber(s.charAt(s.length() - 1));
        return lastCharToNumber;
    }

    public int sumTitleToNumber(String s,double priveSum){
        if (s.length() == 0) return (int)priveSum;
        int lastCharToNumber = stringLastCharToNumber(s);
        return sumTitleToNumber(s.substring(0,s.length()-1),priveSum+Math.pow (26,times++)*lastCharToNumber);
    }

    public int trailingZeroes(int n) {
        int result = 0;
        if (n % 5 == 0 ){
            result ++;
            n /= 5;
        }
        return result;
    }












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

    public static void main(String[] args) {
//        String title = "A";
//        String title = "B";
//        String title = "Z";
//        String title = "AB";
//        String title = "BA";
//        String title = "AAA";
//        int num = new ReverseBits().titleToNumber(title);
//        System.out.println(num);
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next  =new ListNode(0);




        boolean result = new ReverseBits().isPalindrome(head);



        System.out.println(result);


    }
}
