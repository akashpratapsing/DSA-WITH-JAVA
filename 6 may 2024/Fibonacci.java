public class Fibonacci {

    static void fib(int n){
        
        if (n == 0) {
            System.out.println(0);
        }else{
            int fib[] = new int[n + 1];

            fib[0] = 0;
            fib[1] = 1;
     
            for (int i = 2; i < fib.length; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
     
            for (int i : fib) {
             System.out.print(i + " ");
            }
        }
    }
  
    static void fibo(int n){

        if (n == 0) {
            System.out.println(0);
        }else{

            int n1 = 0, n2 = 1, n3;

            System.out.print(n1 + " " + n2 + ' ');

            for (int i = 2; i < n; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;

                System.out.print(n3 + " ");
            }
        }
    }
    
    static int recursiveFib(int n){

        if (n == 1) {
            return n;
        }

         int a = recursiveFib(n - 1);
         int b = recursiveFib(n - 2);
         
         return a + b;
    }
    public static void main(String[] args) {
        
        int n = 0;

      
        System.out.println(recursiveFib(n));;

     
    }
}
    
