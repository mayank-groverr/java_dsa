package practice.dsa.lec_01;

public class Variables {


    public static void main(String[] args) {

        /*
         A Variable act as a container for some data that changes throughout the execution
         Syntax = data_type var_name = value;
         Data Type -> Type of Data a variable can store
         */

        //Integer
        byte num1 = 127;
        short num2 = 32767;
        int num3 = -214748364;
        long num4 = 9223372036854775807L;

        System.out.println(num1);
        System.out.println("Byte MAX Value: " + Byte.MAX_VALUE);
        System.out.println("Byte MIN Value: " + Byte.MIN_VALUE);

        System.out.println(num2);
        System.out.println("Short MAX Value: " + Short.MAX_VALUE);
        System.out.println("Short MIN Value: " + Short.MIN_VALUE);

        System.out.println(num3);
        System.out.println("Integer MAX Value: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN Value: " + Integer.MIN_VALUE);

        System.out.println(num4);
        System.out.println("Long MAX Value: " + Long.MAX_VALUE);
        System.out.println("Long MIN Value: " + Long.MIN_VALUE);


        //Float
        float salary = 1200.12f;
        System.out.println(salary);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        double balance = 23000.123;
        System.out.println(balance);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


        // Char
        char initial = 'a';
        System.out.println(initial);
        System.out.println((int) Character.MAX_VALUE);
        System.out.println((int) Character.MIN_VALUE);

        // Boolean
        boolean isOnline = false;
        boolean isStudent = true;
        System.out.println(isOnline);
        System.out.println(isStudent);


        // Type Casting - Converting one data type into another
        float a = 23.5f;
        int b = (int) a;
        System.out.println(b);

    }


}
