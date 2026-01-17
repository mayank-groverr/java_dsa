package practice.dsa.step_02.lec_02;

import java.util.ArrayList;
import java.util.List;

public class SortingAlgorithms {

    private void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> list = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }


        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        while (right <= high) {
            list.add(arr[right]);
            right++;
        }


        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }

    public void mergeSort(int[] arr, int low, int high) {
        if (low == high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private int partitionPlacer(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        while (i < j) {

            while (i <= high-1 && arr[i] <= arr[low] ) {
                i++;
            }

            while (j >= low+1 && arr[j] >= arr[low]) {
                j--;
            }


            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int partition = partitionPlacer(arr, low, high);
        quickSort(arr, low, partition - 1);
        quickSort(arr, partition + 1, high);
    }
}
