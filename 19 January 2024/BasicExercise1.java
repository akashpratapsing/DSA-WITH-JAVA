/**
 * BasicExercise
 */
public class BasicExercise1 {

//Problem 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
// Expected Output :
// Hello
// Alexandra Abramov

  static void greet(String str){
    System.out.println("Hello\n" + str);
  }

//   Problem 2. Write a Java program to print the sum of two numbers.
//   Test Data:
//   74 + 36
//   Expected Output :
//   110
  static int sum(int a, int b){
    return a+b;
  }

// Problem 3. Write a Java program to divide two numbers and print them on the screen.
// Test Data :
// 50/3
// Expected Output :
// 16

   static int divide(int dividend, int divisor){
    return dividend/divisor;
   }

//    Problem 4. Write a Java program to print the results of the following operations.
//    Test Data:
//    a. -5 + 8 * 6
//    b. (55+9) % 9
//    c. 20 + -3*5 / 8
//    d. 5 + 15 / 3 * 2 - 8 % 3
//    Expected Output :
//    43
//    1
//    19
//    13   

    static void operations(){
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
    

    
    


    public static void main(String[] args) {
        
        greet("Akash");
        System.out.println("----------------------");
        
        int ans = sum(58, 85);
        System.out.println(ans);
        System.out.println("----------------------");

        int ans1 = divide(50, 3);
        System.out.println(ans1);
        System.out.println("----------------------");

        operations();
        System.out.println("----------------------");
    }
}