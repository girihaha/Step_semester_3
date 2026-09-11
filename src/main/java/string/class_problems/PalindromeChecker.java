package string.class_problems;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testWords = {"madam", "hello", "racecar"};

        for (String word : testWords) {
            boolean iter = isPalindromeIterative(word);
            boolean recur = isPalindromeRecursive(word);
            boolean rev = isPalindromeArrayReversal(word);

            System.out.println("Word: " + word);
            System.out.println("Iterative: " + (iter ? "Palindrome" : "Not Palindrome") +
                    " | Recursive: " + (recur ? "Palindrome" : "Not Palindrome") +
                    " | Array Reversal: " + (rev ? "Palindrome" : "Not Palindrome"));
            System.out.println();
        }
    }
}
