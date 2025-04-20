public class CountSetBits {

     public static int countSetBits(int n){
    
       int count = 0;
       
       int[] tab = new int[256];
      
      for (int i = 1; i < 256; i++){
          tab[i] = tab[i & (i - 1)] + 1;
      }
       
       for (int i = 1; i <= n; i++){
           count += count(tab, i);
       }
        
        return count;
        
    }
    
    static int count(int[] tab, int n){
      
      return tab[n % 255] +
             tab[(n >> 8) % 255] +
             tab[(n >> 16) % 255] +
             tab[(n >> 24) % 255];
    }

   
    
    public static void main(String[] args) {

        System.out.println(countSetBits(128));
        
    }
}
