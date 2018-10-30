package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @auther by ZC
 * at 18-10-30
 * for
 */
public class QuickSort<T extends Comparable<T>> extends Sort<T> {
    public static void main(String[] args) {
        QuickSort<Integer> sort = new QuickSort<>();

        Integer[] nums = {1, 3, 2, 5, 7,2};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);

    }

    @Override
    public void sort(T[] nums) {
        shuffle(nums);
        sort(nums, 0, nums.length - 1);

    }

    private void sort(T[] nums, int left, int right) {
        if (left >= right)
            return;
        int index = partition(nums, left, right);
        sort(nums, left, index - 1);
        sort(nums, index, right);

    }

    private void shuffle(T[] nums) {
        List<Comparable> list = Arrays.asList(nums);
        Collections.shuffle(list);
        list.toArray(nums);
    }

    private int partition(T[] nums, int left, int right) {
        T prio = nums[left];
        while (left <= right) {
            while (less(nums[left], prio))
                left++;
            while (less(prio, nums[right]))
                right--;
            if (left <= right) {
                swap(nums, left++, right--);
            }

        }
        return left;
    }

}
