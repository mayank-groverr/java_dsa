package practice.dsa.step_01.lec_04;

public class RecursionProblems {
    public void p1(int i, int n){
        if(i > n) return;
        System.out.println("Hello DSA");
        p1(i+1, n);
    }

    public void p2(int i, int n){
        if (i > n) return;
        System.out.println(i);
        p2(i+1, n);
    }

    public void p3(int i, int n){
        if (i < 1) return;
        System.out.println(i);
        p3(i-1, n);
    }

    public void p4(int i, int n){
        if (i < 1) return;
        p4(i-1,n);
        System.out.println(i);
    }

    public void p5(int i, int n){
        if (i > n) return;
        p5(i+1, n);
        System.out.println(i);
    }
}