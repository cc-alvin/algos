package sort;

/**
 * @auther by ZC
 * at 18-10-30
 * for
 */
public class InsertSort<T extends Comparable<T>> extends Sort<T> {
    public static void main(String[] args) {
        InsertSort<Integer> sort = new InsertSort<>();

        Integer[] nums = {1, 3, 2, 5, 7, 2};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);

    }

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (less(nums[j + 1], nums[j])) {
                    swap(nums, j + 1, j);
                }
            }

        }
    }
}
