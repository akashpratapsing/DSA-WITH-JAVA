class Main {
    
    public static int countSetBit(int num){
        
        int count = 0;
        while (num != 0){
            count++;
            num = num & (num - 1);
        }
        
        return count;
    }
    
    public static boolean isPowerOf2(int num){
        return (num & (num - 1)) == 0;
    }
    
    public static int removeLastSetBit(int num){
        return num & (num - 1);
    }
    
    public static int toggleIthBit(int num, int i){
        
        int mask = 1 << i;
        return num ^ mask;
    }
    
    public static int clearIthBit(int num, int i){
        
        int mask = ~(1 << i);
        return num & mask;
    }
    
    public static int setIthBit(int num, int i){
        
        int mask = 1 << i;
        return (num | mask);
    }
    
    public static boolean isSet(int num , int i){
        
        int mask = 1 << i;
        return (num & mask)!= 0;
    }
    
    
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        
        System.out.println("a = " + a + ", b = " + b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("a = " + a + ", b = " + b);
        
        System.out.println(isSet(16, 4));
        System.out.println(setIthBit(16, 4));
        System.out.println(clearIthBit(16, 3));
        System.out.println(toggleIthBit(16, 3));
        System.out.println(removeLastSetBit(5));
        System.out.println(isPowerOf2(4));
        System.out.println(countSetBit(16));
        
    }
}
