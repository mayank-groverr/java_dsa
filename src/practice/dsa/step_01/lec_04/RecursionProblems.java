package practice.dsa.step_01.lec_04;

public class RecursionProblems {
    // Printing Hello DSA "N times"
    public void p1(int i, int n) {
        if (i > n) return;
        System.out.println("Hello DSA");
        p1(i + 1, n);
    }

    // Printing (1 to N)
    public void p2(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        p2(i + 1, n);
    }

    // Printing (N to 1)
    public void p3(int i, int n) {
        if (i < 1) return;
        System.out.println(i);
        p3(i - 1, n);
    }

    // Printing (1 to N) but the last function call should print first
    public void p4(int i, int n) {
        if (i < 1) return;
        p4(i - 1, n);
        System.out.println(i);
    }

    // Printing (N to 1) but the last function call should print first
    public void p5(int i, int n) {
        if (i > n) return;
        p5(i + 1, n);
        System.out.println(i);
    }


    // Parameterized way of finding Sum of n numbers
    public void p6(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        p6(i - 1, sum + i);
    }

    // Functional way of finding Sum of N numbers
    public int p6(int n) {
        if (n == 1) return 1;
        return n + p6(n - 1);
    }

    // Parameterized way of finding Sum of n numbers
    public void p7(int i, double factorial) {
        if (i < 1) {
            System.out.println(factorial);
            return;
        }
        p7(i - 1, factorial * i);
    }

    // Functional way of finding factorial
    public int p7(int n) {
        if (n == 1) return 1;
        return n * p7(n - 1);
    }

    //Reverse of an Array
    public void p8(int i, int length, int[] arr) {
        if (i == length / 2) return;
        int temp = arr[i];
        arr[i] = arr[length - 1 - i];
        arr[length - 1 - i] = temp;
        p8(i + 1, length, arr);
    }

    // Palindrome String
    public boolean p9(int i, int n, String str) {
        if (i == n / 2) return true;
        if (str.charAt(i) == str.charAt(n - 1 - i)) {
            return p9(i + 1, n, str);
        }
        return false;
    }

    //  Fibonacci Series
    public int p10(int n) {
        if (n <= 1) {
            return n;
        }
        return p10(n - 1) + p10(n - 2);
    }
}