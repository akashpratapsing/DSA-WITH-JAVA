import java.util.Scanner;

class Patterns {

    public static void pattern1(int n) {

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - 1 - i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 2 * n - 1; i++) {

            int row = i;
            if (i > n) {
                row = 2 * n - i;
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern2(int n) {

        int start = 1;
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
    }

    public static void pattern3(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch += 1;
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(ch);
                ch += 1;
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch += 1;
        }
    }

    public static void pattern8(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = 'A';

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j >= i) {
                    ch -= 1;
                } else {
                    ch += 1;
                }
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + (n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch += 1;
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern11(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {
            int row = i;
            int rowForSpace = 2 * (n - i);
            if (i > n) {
                row = 2 * n - i;
                rowForSpace = 2 * (i - n);
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= rowForSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {

                int top = i;
                int bottom = j;
                int left = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        pattern13(n);

        sc.close();
    }
}