package practice.dsa.step_01.lec_01;


public class Operators {
    public static void main(String[] args) {
        // Operators
            //Arithmetic Operators -> +, -, *, /, %

        System.out.println("Arithmetic Operators: ");
        int a = 25;
        int b = -2;
        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Modules : " + (a%b));


        // ShortHand Assignment Operators
        System.out.println("ShortHand Assignment Operators: ");
        int i = 20;
        System.out.println(i);
        i += 20;
        System.out.println(i);
        i -= 20;
        System.out.println(i);
        i *= 2;
        System.out.println(i);
        i /= 2;
        System.out.println(i);
        i %= 2;
        System.out.println(i);


        // Relational Operators -> Comparison between two things -> Result -> Either True or False
            // >, <, == ,!= , >=, <=

        System.out.println("Relational Operators: ");
        System.out.println(2<3);
        System.out.println(3>2);
        System.out.println(2<=2);
        System.out.println(1>=1);
        System.out.println(100 == 100);
        System.out.println(100 != 100);

        // Logical Opeators
        System.out.println("Logical Operators: ");
        System.out.println(2<3 && 10<3);
        System.out.println(2>3 || 99<100);
        System.out.println(!(2>3));

        // Bitwise Operators
        System.out.println(2 & 4); // 010, 100 -> 000 = 0
        System.out.println(2 | 4); // 01, 100 -> 100 = 6
        System.out.println(2^4); //010 , 100 -> 100 = 6
        System.out.println(~2); //010 -> 101
        System.out.println(4 << 2); // 100 -> 10000 = 16
        System.out.println(4 >> 2); //100 -> 001
        System.out.println(-4 >>> 2);
    }




}
