package org.interview;

public class RemovespaceReverselogic {
    public static void main(String[] args) {
        String s = "welcome to infosys";
        String s1 = "";  // To hold string without spaces
        String s2 = "";  // To hold reversed string

        // Step 1: Remove spaces
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                s1 += s.charAt(i);
            }
        }

        // Step 2: Reverse the string without spaces
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }

        System.out.println(s2);
    }
}


