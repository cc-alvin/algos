package sort;

/**
 * @auther by ZC
 * at 18-10-30
 * for
 */
public class SelectSort<T extends Comparable<T>> extends Sort<T> {
    public static void main(String[] args) {
        SelectSort<Integer> sort = new SelectSort<>();

        Integer[] nums = {1, 3, 2, 5, 7};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);

    }


    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++) {
                if (less(nums[j], nums[min])) {
                    min = j;
                }
            }
            swap(nums, i, min);
        }

    }
}
