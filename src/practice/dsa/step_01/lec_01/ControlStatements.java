package practice.dsa.step_01.lec_01;


public class ControlStatements {
    public static void main(String[] args) {
        // They are used to perform a task when a certain condition matches
        //if, if-else, if-else-if

        System.out.println("IF statements");
        int marks = 89;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80){
            System.out.println("Grade B");
        }else if (marks >= 70) {
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
        System.out.println("Outside if");


        System.out.println("Switch Case: ");
        String dayInital = "Monday";
        switch (dayInital){
            case "Monday" :
                System.out.println("Today is Monday");
                break;
            case "Tuesday" :
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday" :
                System.out.println("Today is Wednesday");
                break;
            case "Thursday" :
                System.out.println("Today is Thursday");
                break;
            case "Friday" :
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
