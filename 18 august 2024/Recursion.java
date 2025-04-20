public class Recursion {

    // Star Pattern
    static void stars(int r) {
        if (r < 0) {
            return;
        }

        stars(r - 1);
        for (int i = 0; i < r; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

     // Reverse Star Pattern
     static void revStars(int r) {
        if (r < 0) {
            return;
        }

        for (int i = 0; i < r; i++) {
            System.out.print("* ");
        }
        System.out.println();

        revStars(r - 1);

    }
    

    static void stars1(int r, int c) {
        if (r == 0) {
            return;
        }

       if (c < r) {
        System.out.print("* ");
        stars1(r, c + 1);
       }else {
        System.out.println();
        stars1(r - 1, 0);
       }

    }

    static void revStars1(int r, int c) {
        if (r == 0) {
            return;
        }

       if (c < r) {
        revStars1(r, c + 1);
        System.out.print("* ");
       }else {
        revStars1(r - 1, 0);
        System.out.println();
       }

    }


    

    public static void main(String[] args) {

        // stars(4);
        // revStars(3);

       
        revStars1(3, 0);
        System.out.println();
        stars1(4, 0);
    }
}
