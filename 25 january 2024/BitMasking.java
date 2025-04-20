public class BitMasking {
    public static void main(String[] args) {

        // Switch On Bit

        //int n = 36;
        // int i = 3; 
        // int onMask = 1 << i;
        // System.out.println(n | onMask);
        
        // Switch Off Bit

        // int n = 36;
        // int i = 5;
        // int offMask = ~(1 << i);
        // System.out.println(n & offMask);

        // Toggle Bit 

        // int n = 36;
        // int i = 5;
        // int toggleMask = (1 << i);
        // System.out.println(n ^ toggleMask);

        // Check Bit On or Off

        int n = 585;
        int i = 5;
        int checkMask = 1 << i;

        if ((n & checkMask) == 0) {
            System.out.println("OFF");
        }else{
            System.out.println("ON");
        }
    }
}
