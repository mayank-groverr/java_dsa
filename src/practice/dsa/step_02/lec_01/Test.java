package practice.dsa.step_02.lec_01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            System.out.print("Enter element at " + i + " index: ");
            arr[i] = input.nextInt();
        }

        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        sortingAlgorithms.insertionSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
