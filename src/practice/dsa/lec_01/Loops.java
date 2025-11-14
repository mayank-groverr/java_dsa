package practice.dsa.lec_01;

public class Loops {
    public static void main(String[] args) {
        System.out.println("For Loop: ");
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("While Loop: ");
        int i = 0;
        while (i<=10) {
            System.out.println(i);
            i+=2;
        }

        System.out.println("Do While Loop: ");
        i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<1);
    }
}
