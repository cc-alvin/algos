package sort;

/**
 * @auther by ZC
 * at 18-10-30
 * for
 */
public abstract class Sort<T extends Comparable<T>> {
    public abstract void sort(T[] nums);

    public boolean less(T v, T m) {
        return v.compareTo(m) < 0;
    }

    public void swap(T[] nums, int i, int j) {
        T t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void print(T[] nums) {
        for (T n : nums) {
            System.out.print(String.valueOf(n));
            System.out.print(",");
        }
        System.out.println();
    }
}
