package practice.dsa.lec_01;

public class ArraysDemo {
    public static void main(String[] args) {
        // When we want to store multiple values of the same type we can use array there

        System.out.println("1D Arrays: ");
        int[] marks = {23,45,65,76};
        int[] marks1 = new int[5];
        marks1[0] = 23;
        marks1[1] = 67;
        marks1[2] = 90;
        System.out.println(marks1.length);
        for(int i : marks1){
            System.out.println(i);
        }

        System.out.println("2D Arrays: ");
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(matrix.length);
        for(int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Jagged Arrays: ");
        int[][] jaggedArray = {{1,2,3},{4,5}};
        System.out.println(matrix.length);
        for(int i = 0; i< jaggedArray.length; i++){
            for (int j = 0; j< jaggedArray[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
