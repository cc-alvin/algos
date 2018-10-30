package sort;

/**
 * @auther by ZC
 * at 18-10-30
 * for
 */
public class MergeSort {
    public static void main(String[] args) {
        int num[] = {1, 4, 2, 3, 5, 6, 9, 10};
        new MergeSort().sort(num, 0, num.length - 1);
        for (int n : num) {
            System.out.print(n + " ");
        }
    }

    void sort(int num[], int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(num, low, mid);
            sort(num, mid + 1, high);
            merge(num, low, mid, high);
        }

    }

    public void merge(int[] num, int low, int mid, int high) {
        int copyNum[] = new int[num.length];
        for (int i = low; i <= high; i++) {
            copyNum[i] = num[i];
        }
        int left = low;
        int right = mid + 1;
        int current = low;
        while (left <= mid && right <= high) {
            if (copyNum[left] < copyNum[right]) {
                num[current++] = copyNum[left];
                left++;
            } else {
                num[current++] = copyNum[right];
                right++;
            }
        }
        while (left <= mid)
            num[current++] = copyNum[left++];
        while (right <= high)
            num[current++] = copyNum[right++];
    }

}
