import java.util.ArrayList;

class MergeSort {

    public void sort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        sort(arr, left, mid);
        sort(arr, mid + 1, right);

        merge(arr, left, right, mid);
    }

    public void merge(int[] arr, int left, int right, int mid) {

        ArrayList<Integer> temp = new ArrayList<>();
        int l = left, r = mid + 1;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp.add(arr[l]);
                l++;
            } else {
                temp.add(arr[r]);
                r++;
            }
        }

        while (l <= mid) {
            temp.add(arr[l]);
            l++;
        }

        while (r <= right) {
            temp.add(arr[r]);
            r++;
        }

        for (int i = left; i <= right; i++) {
            arr[i] = temp.get(i - left);
        }
    }
}