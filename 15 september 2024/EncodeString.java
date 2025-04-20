import java.util.*;

class EncodeString {
    public static class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3) {
            output1 = out1;
            output2 = out2;
            output3 = out3;
        }

        public String toString(){
            return "Result{" + output1 + "," + output2 + "," + output3;
        }
    }

    public static Result encodeThreeStrings(String input1, String input2, String input3) {
        // Step 1: Split each input string into three parts
        String[] parts1 = splitString(input1);
        String[] parts2 = splitString(input2);
        String[] parts3 = splitString(input3);

        // Step 2: Concatenate parts according to the rule
        String output1 = parts1[0] + parts2[1] + parts3[2];
        String output2 = parts1[1] + parts2[2] + parts3[0];
        String output3 = parts1[2] + parts2[0] + parts3[1];

        // Step 3: Toggle case for output3
        output3 = toggleCase(output3);

        return new Result(output1, output2, output3);
    }

    private static String[] splitString(String input) {
        int len = input.length();
        int partSize = len / 3;
        int remainder = len % 3;

        String[] parts = new String[3];

        if (remainder == 0) {
            parts[0] = input.substring(0, partSize);
            parts[1] = input.substring(partSize, 2 * partSize);
            parts[2] = input.substring(2 * partSize);
        } else if (remainder == 1) {
            parts[0] = input.substring(0, partSize);
            parts[1] = input.substring(partSize, 2 * partSize + 1);
            parts[2] = input.substring(2 * partSize + 1);
        } else { // remainder == 2
            parts[0] = input.substring(0, partSize + 1);
            parts[1] = input.substring(partSize + 1, 2 * partSize + 1);
            parts[2] = input.substring(2 * partSize + 1);
        }

        return parts;
    }

    private static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
       String input1= "John";

       String input2= "Johny";
        
       String input3= "Janardhan";

       Result ans = encodeThreeStrings(input1, input2, input3);

       System.out.println(ans.toString());
    }
}