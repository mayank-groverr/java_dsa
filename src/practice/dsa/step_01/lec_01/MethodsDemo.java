package practice.dsa.step_01.lec_01;

public class MethodsDemo {

    public int a;

    public static void main(String[] args) {
        // Methods -> Reusable block of code that performs some tasks when called.

        greetings();
        greetings("Mayank");
        int result = add(1,2);
        int result2 = add(1.1f,2.2f);
        System.out.println(result);
        System.out.println(result2);
        add(1,2,3,4,4,5,5,6,6,7,7);
        int a = 10;
        valueChange(a);
        System.out.println(a);
        String test = "test";
        valueChange(test);
        System.out.println(test);

        MethodsDemo methodsDemo = new MethodsDemo();
        methodsDemo.a = 10;
        System.out.println(methodsDemo.a);
        valueChange(methodsDemo);
        System.out.println(methodsDemo.a);

    }

    public static void greetings(){
        System.out.println("Hello");
    }

    public static void greetings(String name){
        System.out.println("Hello " + name);
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(float a, float b){
        return (int) (a + b);
    }

    public static void add(int... nums){
        int result = 0;
        for (int i : nums){
            result += i;
        }
        System.out.println(result);
    }

    public static void valueChange(int a){
        a = 12;
        System.out.println(a);
    }

    public static void valueChange(String name){
        name = "Testing Strings";
        System.out.println(name);
    }

    public static void valueChange(MethodsDemo methodsDemo){
       methodsDemo.a += 2;
    }


}
