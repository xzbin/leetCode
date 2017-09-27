package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/18.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lengthPointer = m + n - 1;
        int pointer1 = m - 1,pointer2 = n -1 ;
        while(pointer1 >= 0 && pointer2 >= 0){
            if (nums1[pointer1] > nums2[pointer2])
                nums1[lengthPointer--] = nums1[pointer1--];
            else
                nums1[lengthPointer--] = nums2[pointer2--];
        }
        if (pointer1 < 0)
            while (pointer2 >= 0) nums1[lengthPointer--] = nums2[pointer2--];
        else
            while (pointer1 >= 0) nums1[lengthPointer--] = nums1[pointer1--];
    }
}
