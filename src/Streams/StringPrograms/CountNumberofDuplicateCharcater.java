package Streams.StringPrograms;

public class CountNumberofDuplicateCharcater {
    public static void main(String[] args) {
      
            String string = "I am developer";
        char[] cstring = string.toCharArray();

        // Iterate through the string
        for (int i = 0; i < cstring.length; i++) {
            // Skip the space or already counted characters (those marked as '0')
            if (cstring[i] == ' ' || cstring[i] == '0') {
                continue;
            }

            int count = 1;

            // Compare current character with the rest of the string
            for (int j = i + 1; j < cstring.length; j++) {
                if (cstring[i] == cstring[j]) {
                    count++;
                    cstring[j] = '0'; // Mark it as '0' so it won't be counted again
                }
            }

            // If count is more than 1, print the character and its count
            if (count > 1) {
                System.out.println(count + " " + cstring[i]);
            }
        }


    }
}
