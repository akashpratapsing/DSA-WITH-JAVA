public class BasicExercise3 {

    // Problem 11. Write a Java program to print the area and perimeter of a circle.
    // Test Data:
    // Radius = 7.5
    // Expected Output
    // Perimeter is = 47.12388980384689
    // Area is = 176.71458676442586
    static void areaAndPerimeterOfCircle(double radius) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }

    public static void main(String[] args) {

        areaAndPerimeterOfCircle(7.5);

        // Write a Java program to swap two variables.

        int a = 8;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "\n" + "b = " + b);
    }
}
