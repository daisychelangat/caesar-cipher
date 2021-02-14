package Decoder;

import java.util.Arrays;

public class Decoder {

    //make variables private
    private String encryptedString;
    private String decryptedString;
    private Character[] alphabets = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' } ;
    private int key = 3;//shift key
    //generate constructor
    public Decoder(String encodedString) {
        this.encryptedString = encodedString;
    }

    //create the decode function here
    public String decoderFunc (){
        String mString = this.encryptedString;
        int nextCharacterIndex = 0;
        //loop through the string
        for (int i = 0; i < mString.length(); i++) {
            int characterIndex = Arrays.binarySearch( alphabets,  mString.charAt(i));
            //error character index
            if (characterIndex == -1) {
                continue;
            } else{
                //to avoid getting a wrong character index use branching.
                if (characterIndex >= key) {
                    nextCharacterIndex = characterIndex - key;

                } else {
                    nextCharacterIndex = 26 - (key - characterIndex);//get correct character index that is within the span.
                }
                char charString =  mString.charAt(i);
                char charForDecoding =  alphabets[nextCharacterIndex];

//get the elements of a string
                mString=  mString.substring(0, i) + charForDecoding +  mString.substring(i + 1);
            }
        }
        return  mString;//original string
    }
    //function that gets the decrypted string;
    public String getDecryptedString() {
        this.decryptedString= decoderFunc();
        return decryptedString;
    }
}