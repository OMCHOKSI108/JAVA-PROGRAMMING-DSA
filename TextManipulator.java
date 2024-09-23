class TextManipulator {

      public String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        String[] words = input.split(" ");
        String result = ""; 

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }
 
        result = result.substring(0, result.length() - 1);
        return result;
    }

   
    public String removeDuplicateChars(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        String result = "";  

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(currentChar) == -1) {   
                result += currentChar;   
            }
        }

        return result;
    }

    public static void main(String[] args) {
      
        TextManipulator tm = new TextManipulator();
        
        try {
            System.out.println("Reversed words: " + tm.reverseWords("Hello world from Java"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
 
        try {
            System.out.println("String without duplicates: " + tm.removeDuplicateChars("programming"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(tm.reverseWords(""));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
































