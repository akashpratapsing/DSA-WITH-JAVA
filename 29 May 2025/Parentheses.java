public class Parentheses {

     public String minRemoveToMakeValid(String s) {

        StringBuilder sb = new StringBuilder();

        int balance = 0;
        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openCount++;
                balance++;
                sb.append(ch);
            } else if (ch == ')') {
                if (balance == 0) {
                    continue;
                }
                balance--;
                sb.append(ch);
            } else {
                sb.append(ch);
            }
        }

        StringBuilder ans = new StringBuilder();
        int toKeep = openCount - balance;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                if (toKeep > 0) {
                    toKeep--;
                    ans.append(ch);
                }
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}