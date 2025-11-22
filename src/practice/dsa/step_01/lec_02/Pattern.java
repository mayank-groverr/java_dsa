package practice.dsa.step_01.lec_02;

public class Pattern{

    public void pattern1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern3(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void pattern5(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public void pattern6(int n){
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        for(int i = 0; i<n; i++){

            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void pattern8(int n){
        for(int i = 0; i<n; i++){

            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < (2*n) - (2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9(int n){
        for(int i = 0; i<n; i++){

            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
        for(int i = 0; i<n; i++){

            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < (2*n) - (2*i+1); j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public void pattern10(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            };
            System.out.println();
        }
        for(int i = 1; i<=n-1; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("*");
            };
            System.out.println();
        }

    }

    public void pattern11(int n){
        int value = 0;
        for (int i = 1; i<=n; i++){
            value = (i%2 == 0)? 0 : 1;
            for (int j = 1; j<=i; j++){
                System.out.print(value + " ");
                value = (value == 0)? 1:0;
            }
            System.out.println();
        }
    }

    public void pattern12(int n){
        int noOfSpaces = (n-1) * 2;
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = 1; j<=noOfSpaces; j++){
                System.out.print(" ");
            }
            noOfSpaces -= 2;
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern13(int n){
        int value = 1;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }

    public void pattern14(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 65; j<=i+64; j++){
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void pattern15(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 65; j<= 64 + (n+1-i); j++){
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void pattern16(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print( (char) (i + 64) + " ");
            }
            System.out.println();
        }
    }

    public void pattern17(int n){
        for (int i = 0; i<n; i++){
            int breakPoint = (2*i+1)/2;
            char ch = 'A';
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(char j = 1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j <= breakPoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }

    public void pattern18(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 65 + (n-i); j<=n+64; j++){
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void pattern19(int n){
        int noOfSpaces = 0;
        for(int i = 1; i<=n ; i++){
            for (int j = 1; j<=n+1-i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=noOfSpaces;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=n+1-i;j++){
                System.out.print("*");
            }
            noOfSpaces+=2;

            System.out.println();
        }
        noOfSpaces = 2*(n-1);
        for(int i = 1; i<=n ; i++){
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=noOfSpaces;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            noOfSpaces-=2;

            System.out.println();
        }
    }

    public void pattern20(int n){
        int noOfSpaces = (n-1) * 2;
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for (int j = 1; j<= noOfSpaces; j++){
                System.out.print(" ");
            }
            noOfSpaces-=2;
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        noOfSpaces = 2;
        for (int i = 1; i<=n-1; i++){
            for(int j = 1; j<= n-i;j++){
                System.out.print("*");
            }
            for(int j = 1; j<= noOfSpaces;j++){
                System.out.print(" ");
            }
            noOfSpaces +=2;
            for(int j = 1; j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern21(int n){
        for(int i = 1 ; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i == 1 || j == n || i == n || j == 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public void pattern22(int n){
        for (int i = 0; i<2*n-1; i++){
            for (int j = 0; j< 2*n-1; j++){
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                System.out.print(n-Math.min(Math.min(i,j),Math.min(right, bottom)) + " ");
            }
            System.out.println();
        }
    }
}