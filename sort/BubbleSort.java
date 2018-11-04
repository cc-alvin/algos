package sort;

/**
 * @auther by ZC
 * at 18-10-30
 * for
 */
public class BubbleSort<T extends Comparable<T>> extends Sort<T> {
    public static void main(String[] args) {
        BubbleSort<Integer> sort = new BubbleSort<>();

        Integer[] nums = {1, 3, 2, 5, 7, 2};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);
    }

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        boolean hasSorted = false;
        for (int i = N - 1; i > 0 && !hasSorted; i--) {
            hasSorted = true;
            for (int j = 0; j < i; j++) {
               
                if (less(nums[j + 1], nums[j])) {
                    swap(nums, j + 1, j);
                     hasSorted = false;
                }
            }
        }
    }
}
