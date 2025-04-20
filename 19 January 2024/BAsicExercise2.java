import java.util.Scanner;

public class BAsicExercise2 {
    public static void main(String[] args) {

        // 5. Write a Java program that takes two numbers as input and displays the
        // product of two numbers.
        // Test Data:
        // Input first number: 25
        // Input second number: 5
        // Expected Output :
        // 25 x 5 = 125

        // Problem 6. Write a Java program to print the sum (addition), multiply,
        // subtract, divide and remainder of two numbers.
        // Test Data:
        // Input first number: 125
        // Input second number: 24
        // Expected Output :
        // 125 + 24 = 149
        // 125 - 24 = 101
        // 125 x 24 = 3000
        // 125 / 24 = 5
        // 125 mod 24 = 5

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + a * b);
        System.out.println(a + " / " + b + " = " + a / b);
        System.out.println(a + " mod " + b + " = " + a % b);

// Problem 8. Write a Java program to display the following pattern.
// Sample Pattern :

//    J    a   v     v  a                                                  
//    J   a a   v   v  a a                                                 
// J  J  aaaaa   V V  aaaaa                                                
//  JJ  a     a   V  a     a

     System.out.println("    J    a   v     v  a   ");
     System.out.println("    J   a a   v   v  a a  ");
     System.out.println(" J  J  aaaaa   V V  aaaaa ");
     System.out.println("  JJ  a     a   V  a     a");

// Problem 9. Write a Java program to compute the specified expressions and print the output.
// Test Data:
// ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
// Expected Output
// 2.138888888888889

    System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

    // Problem 10. Write a Java program to compute a specified formula.
    // Specified Formula :
    // 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
    // Expected Output
    // 2.9760461760461765

    
    System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

     }
}
