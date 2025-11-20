package practice.dsa.step_01.lec_01;

import java.util.Scanner;

public class InputAndOuput {
    public static void main(String[] args) {


        //Input from console
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your gpa: ");
        float gpa = input.nextFloat();


        //Output on Console
        System.out.println("Hello World");
        System.out.print("Hello DSA\n");
        //Difference between println() and printf()
        System.out.printf("My name is %s and my gpa is %.2f and I am %d years old\n",name,gpa,age);
        System.out.println("My name is " + name + " and my gpa is "+ gpa + " and I am " +  age + " years old\n");




    }
}
