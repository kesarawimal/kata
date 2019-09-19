package uk.ac.wlv.cs5006.kata1;

public class Kata1 {
    
    public static boolean areAnagrams(String input1, String input2) {
        int eqLength, length1, length2, charFound=0, charNotFound=0;
        
        if(input1 == null || input2 == null) {
           return false; 
        } else {
            length1 = input1.length();
            length2 = input2.length();
            
            if(length1 == length2) {
                
                eqLength = length1;
                for(int i=0; i<eqLength; i++) {
                    charFound = 0;
                    if (Character.isDigit(input1.charAt(i))) {
                        charNotFound = 1;
                        break;
                    }
                    for(int j=0; j<eqLength; j++) {
                        if (Character.isDigit(input2.charAt(j))) {
                            charNotFound = 1;
                            break;
                        }
                        if(input1.charAt(i) == input2.charAt(j)) {
                            charFound = 1;
                            break;
                        }
                    }
                    if(charFound == 0) {
                        charNotFound = 1;
                        break;
                    }
                }
                if(charNotFound == 1) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        
    }
}
