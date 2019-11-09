package util;

import algorithm.listProblem.ListNode;

/**
 * @author Yandx
 * @version 1.0
 * @date created on 2019/7/12 14:33
 */
public class MyUtil {
    /**
     * 交换数组两个元素
     *
     * @param nums
     * @param i
     * @param j
     */
    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    /**
     * 整型数i的第k位(最大七位)
     */
    public static int getDigit(int i, int k) {
        int[] a = {1, 10, 100, 1000, 10000, 100000,1000000};
        return (i / a[k - 1]) % 10;
    }

    public static void printList(ListNode node){
        if (node==null){
            System.out.println("[]");
        }else{
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(node.val));
            while(node.next!=null){
                stringBuilder.append("->").append(String.valueOf(node.next.val));
                node = node.next;
            }
            System.out.println(stringBuilder.toString());
        }
    }


}
