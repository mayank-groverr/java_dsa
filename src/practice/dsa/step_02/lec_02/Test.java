package practice.dsa.step_02.lec_02;

public class Test {


    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] arr = new int[]{2,4,1,5,3};
        sortingAlgorithms.quickSort(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }

}
