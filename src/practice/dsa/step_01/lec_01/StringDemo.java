package practice.dsa.step_01.lec_01;

public class StringDemo {
    public static void main(String[] args) {
        // Sequence of Characters. Enclosed under double quotes. They are Immutable.

        String greetings = "Hello";
        String greetings1 = new String("Hello");
        String greetings2 = new String("Hello");
        String greetings3 = "Hello";
        System.out.println(greetings1 == greetings2);
        System.out.println(greetings == greetings3);

        //String Methods
        String name = "Ram";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println("Hello ".concat(name));
    }
}
