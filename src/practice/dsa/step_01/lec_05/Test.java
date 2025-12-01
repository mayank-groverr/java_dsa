package practice.dsa.step_01.lec_05;

import java.util.HashMap;


public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr = {0, 0, 0,0,0,0,5, 5, 5, 1, 1,1,1};

        // Pre Computation
        for (int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        // Fetching
        HashMapProblems hashMapProblems = new HashMapProblems();
        hashMapProblems.highAndLowFreq(arr.length, hashMap);
    }
}
