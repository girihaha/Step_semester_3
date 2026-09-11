package string.class_problems;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        String[] samples = {"swiss", "aabbcc", "developer"};

        for (String sample : samples) {
            char result = findFirstNonRepeatingChar(sample);
            if (result != '-') {
                System.out.println("\"" + sample + "\" -> First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("\"" + sample + "\" -> No Non-Repeating Character Found");
            }
        }
    }
}
