package sort;

public class HeapSort<T extends Comparable<T>> extends Sort<T> {
    public static void main(String[] args) {
        HeapSort<Integer> sort = new HeapSort<>();

        Integer[] nums = {1, 4,3, 2, 5, 7};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);
    }
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for(int i=N/2-1;i>=0;i--){
            adjustMinHeap(nums,i,N-1);
        }
        print(nums);
        for(int i=N-1;i>=0;i--){
            T temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            adjustMinHeap(nums,0,i-1);
        }
    }

    private void adjustMinHeap(T[] a, int pos, int len) {
        T temp;
        int child;
        for (temp = a[pos]; 2 * pos + 1 <=len; pos = child) {
            child = 2 * pos + 1;
            if (child < len&& less(a[child +1], a[child])) {
                child++;
            }
            if (less(a[child],temp)) {
                a[pos] = a[child];
                a[child]=temp;
            } else break;

        }
    }

}
