package uk.ac.wlv.cs5006.kata3;

public class Kata3 {

    // Array of all valid alpha characters
    private static final String[] alphanumeric = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
        "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};

    // Array of all valid Morse code characters
    private static final String[] morsecode = {"._", "_...", "_._.", "_..", ".", ".._.", "__.", "....",
        "..", ".___", "_._", "._..", "__", "_.", "___", ".__.", "__._", "._.", "...", "_", ".._",
        "..._", ".__", "_.._", "_.__", "__..", "|"};

    public static void main(final String[] args) {}
    
    public static String translateToMorseCode(String alphanumeric_word) {
        String morsecode_sign = "";
        
        // isString function take word as first parameter and type as second parameter for skip checking blank space in morse code
        if(isStringFine(alphanumeric_word, 'A')) {
            alphanumeric_word = alphanumeric_word.toLowerCase();
            char[] alphanumeric_array = alphanumeric_word.toCharArray();
            
            for (int i = 0; i < alphanumeric_array.length; i++){
                for (int j = 0; j < alphanumeric.length; j++){
                    if (alphanumeric_array[i] == alphanumeric[j].charAt(0)){
                        morsecode_sign = morsecode_sign + morsecode[j] + " ";  
                    }
                }
            }
        }

        return morsecode_sign;
        
    }
    
    public static String translateFromMorseCode(String morsecode_sign) {
        String alphanumeric_word = "";
        
        // isString function take word as first parameter and type as second parameter for skip checking blank space in morse code
        if(isStringFine(morsecode_sign, 'M')) {
            String[] morsecode_array = morsecode_sign.split(" ");
            for (int i = 0; i < morsecode_array.length; i++){
                for (int j = 0; j < morsecode.length; j++){
                    
                    if (morsecode_array[i].equals(morsecode[j])){
                        
                        alphanumeric_word = alphanumeric_word + alphanumeric[j];  
                    }
                }
            }
        }
        System.out.println(alphanumeric_word);
        return alphanumeric_word;
    }
    
    private static boolean isStringFine(String myString, char type) {
        if(myString != null && !myString.equals("")) {
            int stringLength = myString.length();

            for(int i = 0; i < stringLength; i++) {
                if(myString.charAt(i) == ' ' && type == 'A') {
                    return false;
                }
                if(Character.isDigit(myString.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
        
    }

}
