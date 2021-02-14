package Encoder;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Encoder {

    private String inputString;
    private String enryptedString;
    private Character[] alphabets= {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' } ;
    private int key = 3;

    public Encoder(String inputString ) {
        this.inputString = inputString;
    }//constructor
    // method
    public String encoderFunc(){
        //convert the input string to uppercase to match the alphabets.
        String stringToEncrypt = this.inputString.toUpperCase();
        int nextCharacterIndex = 0;
        for (int i = 0; i < stringToEncrypt.length(); i++) {
            int characterIndex = Arrays.binarySearch(alphabets, stringToEncrypt.charAt(i));
            //characterIndex that does not exist return the original string;
            if (characterIndex == -1) {
                ;

            } else{
                //add shift key to characterIndex only when the index is <=(26-key)to avoid getting an invalid character index.
                if (characterIndex <= 26-key) {
                    nextCharacterIndex = characterIndex + key;
                    //getting accurate char index.
                } else {
                    nextCharacterIndex = (characterIndex + key) - 26;
                }
                //when using substring method we add 1 to cater for the end index
                char charForEncoding = alphabets[nextCharacterIndex];
                stringToEncrypt= stringToEncrypt.substring(0, i) + charForEncoding + stringToEncrypt.substring(i + 1);
            }
        }
        return stringToEncrypt;
    }
    //this is the function that will return an encrypted string...
    public String getEnryptedString() {
        this.enryptedString= encoderFunc();
        return this.enryptedString;
    }
	public Object encocoderFunc() {
		return null;
	}
}