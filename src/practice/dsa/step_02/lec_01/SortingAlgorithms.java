package practice.dsa.step_02.lec_01;

public class SortingAlgorithms {



    public void selectionSort(int [] arr){

        for (int i = 0; i<=arr.length-2; i++){
            int minIndex = min(arr, i);
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    private static int min(int[] arr, int k){

        int minIndex = k;
        for(int i = k ; i<arr.length; i++){
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i<arr.length-1; i++) {
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
                System.out.println("runs");
            }

        }
    }


}