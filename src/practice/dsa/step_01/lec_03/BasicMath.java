package practice.dsa.step_01.lec_03;

import java.util.ArrayList;
import java.util.List;

public class BasicMath {
    public int p1(int n) {
        int noOfDigits = 0;
        while (n > 0) {
            n = n / 10;
            noOfDigits++;
        }
        return noOfDigits;
    }

    public int p2(int n) {
        int revNum =  0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        return revNum;
    }

    public boolean p3(int n) {
        int revNum = 0;
        int temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;
            revNum = (revNum * 10) + lastDigit;
            temp = temp / 10;
        }
        if (revNum == n) return true;
        else return false;
    }

    public boolean p4(int n) {
        int noOfDigits = p1(n);
        int temp = n;
        double sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum = sum + Math.pow(lastDigit, noOfDigits);
            temp = temp / 10;
        }
        if (sum == n) return true;
        else return false;

    }

    public void p5(int n) {
        List<Integer> divisors = new ArrayList<>();
        // Time Complexity = o(sqrt(n))
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) divisors.add(n / i);
            }

        }
        //Time Complexity of o(n log n)
        divisors.sort(null);
//        Time Complexity = o (numbers of factors of n)
        for (Integer i : divisors) {
            System.out.print(i + " ");
        }
    }

    public void p6(int n) {
        int count = 0;
        //Time Complexity = o(sqrt(n))
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
    }


     public void p7(int n1, int n2) {
         //Brutal Approach for finding GCD/HCF
        int min = 0;
        int gcd = 1;
        if (n1 < n2) min = n2;
        else min = n1;
        //Time Complexity = o(min(n1, n2))
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) gcd = i;
        }
        System.out.print("GCD is: " + gcd);
    }

    public void p8(int n1 , int n2){
        while (n1 > 0 && n2 > 0){
            if (n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;


        }
        if (n1 == 0) System.out.println(n2);
        else System.out.println(n1);
    }
}
