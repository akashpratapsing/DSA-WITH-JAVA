import java.util.Scanner;

public class Recursion {
    static int i = 1;

    static void print(){

        if (i == 5) {return;}
        System.out.println(i);
        i++;
        print();

    }

    static void printName(int x, int n){

        if (x > n){
            return;
        }

        System.out.println("Akash");

        printName(x + 1, n);
    }

    static void printNatNum(int n){

      if (n == 0) {
        return;
      }

    

      printNatNum(n - 1);

      System.out.print(n + " ");

    }

    static int printSumOfNaturalNum(int n){

        if (n == 1) {
          return 1;
        }
  
      
  
       return n + printSumOfNaturalNum(n - 1);
  
  
      }
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       System.out.println(printSumOfNaturalNum(n));
       

        sc.close();
    }
}
