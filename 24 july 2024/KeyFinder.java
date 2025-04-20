public class KeyFinder {

    public int findkey(int input1, int input2, int input3) {
        
        if (input1 < 1000 || input1 > 9999 || 
            input2 < 1000 || input2 > 9999 || 
            input3 < 1000 || input3 > 9999) {
            throw new IllegalArgumentException("Inputs must be four-digit numbers between 1000 and 9999.");
        }

        int[] thousands = { input1 / 1000, input2 / 1000, input3 / 1000 };
        int[] hundreds = { (input1 / 100) % 10, (input2 / 100) % 10, (input3 / 100) % 10 };
        int[] tens = { (input1 / 10) % 10, (input2 / 10) % 10, (input3 / 10) % 10 };
        int[] units = { input1 % 10, input2 % 10, input3 % 10 };

      
        int maxThousands = max(thousands);
        int minThousands = min(thousands);
        int maxHundreds = max(hundreds);
        int minHundreds = min(hundreds);
        int maxTens = max(tens);
        int minTens = min(tens);
        int maxUnits = max(units);
        int minUnits = min(units);

       
        int key = (maxThousands - minThousands) * 1000
                + (maxHundreds - minHundreds) * 100
                + (maxTens - minTens) * 10
                + (maxUnits - minUnits);

        return key;
    }

    
    public int max(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

  
    public int min(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        KeyFinder finder = new KeyFinder();
        int key = finder.findkey(3521, 2452, 1351);
        System.out.println("Key: " + key); // Example usage
    }
}