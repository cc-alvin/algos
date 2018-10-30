package sort;

/**
 * @auther by ZC
 * at 18-10-30
 * for
 */
public class ShellSort<T extends Comparable<T>> extends Sort<T> {
    public static void main(String[] args) {
        ShellSort<Integer> sort = new ShellSort<>();

        Integer[] nums = {1, 3, 2, 5, 7, 2};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);

    }

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        int h = 0;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h; j = j - h) {
                    if (less(nums[j], nums[j - h]))
                        swap(nums, j, j - h);
                }
            }
            h /= 3;

        }
    }
}
