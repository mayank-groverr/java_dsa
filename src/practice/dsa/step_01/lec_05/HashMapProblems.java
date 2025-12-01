package practice.dsa.step_01.lec_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapProblems {
    public void highAndLowFreq(int length, HashMap<Integer, Integer> hashMap){
        int maxkey = 0;
        int lowerKey = 0;
        int max = 0;
        int lower = length;
        for (Map.Entry<Integer,Integer> pair: hashMap.entrySet()) {

            if(pair.getValue() > max){
                maxkey = pair.getKey();
                max = pair.getValue();
            }

            if(pair.getValue() < lower){
                lowerKey = pair.getKey();
                lower = pair.getValue();
            }
        }
        System.out.println("The key with the maximum frequency: " + maxkey);
        System.out.println("The key with the least frequency: " + lowerKey);
    }
}
