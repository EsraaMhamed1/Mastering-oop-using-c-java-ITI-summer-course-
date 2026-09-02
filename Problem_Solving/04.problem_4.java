// Problem : Encryption Decryption 
/********************************************************************************
Given an encrypted message, decrypt it by first expanding the repeated characters 
and then reversing the order of the words.
********************************************************************************/

public static String decryptMessage(String encryptedMessage) {

    String[] words = encryptedMessage.split(" ");
    StringBuilder result = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {

        String word = words[i];
        StringBuilder decoded = new StringBuilder();

        for (int j = 0; j < word.length(); j++) {

            char ch = word.charAt(j);

            if (j + 1 < word.length() && Character.isDigit(word.charAt(j + 1))) {

                int count = word.charAt(j + 1) - '0';

                for (int k = 0; k < count; k++) {
                    decoded.append(ch);
                }

                j++; // skip the digit
            } else {
                decoded.append(ch);
            }
        }

        result.append(decoded);

        if (i > 0) {
            result.append(" ");
        }
    }

    return result.toString();
}
