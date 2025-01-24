class PalindromeChecker {
    String text; // Attribute to store the input text

    // Constructor to initialize the text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    boolean isPalindrome() {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        // Create a palindrome checker object
        PalindromeChecker checker = new PalindromeChecker("madam");

        // Display the result
        checker.displayResult();
    }
}
