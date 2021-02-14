//importing the packages needed
import Decoder.Decoder;
import Encoder.Encoder;

import java.io.Console;//java console
import java.io.IOException;



public class App {
    //ANSI escape codes to colour my output on the terminal
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String RED_BOLD_BRIGHT = "\033[1;91m";

    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW

    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE

    public static void main(String[] args) throws IOException {




        Console myConsole = System.console();
        System.out.println(PURPLE_BOLD+"Welcome to Caesar Cipher.Each letter of a string is shifted by a key of 3 down the alphabets.For instance A will become 3.The letters are then decoded to their original state."+ANSI_RESET);
        System.out.println(YELLOW_BOLD+"What Message would you like to be  Encrypted?"+ANSI_RESET);
        String inputMessage = myConsole.readLine();//get user's response here.
        //pass the input message to the encoder to be encoded.
        Encoder encryptMessage = new Encoder(inputMessage);

        String enryptedString = encryptMessage.getEnryptedString();//use getter method to get the encoded message

        //Return the statement to it's original state
        Decoder statementDecoder = new Decoder(enryptedString);
        String decodedStatement = statementDecoder.getDecryptedString();

        //Interact with the terminal
        /*convert to uppercase*/
        System.out.println(PURPLE_BOLD+"This is your statement in uppercase"+ANSI_RESET+ " "+RED_BOLD_BRIGHT+(inputMessage.toUpperCase()) +ANSI_RESET);
        /*encoded statement*/
        System.out.println(PURPLE_BOLD+"This is your  Encrypted string:"+ANSI_RESET+" " +RED_BOLD_BRIGHT+ " "+enryptedString+ANSI_RESET );
        /*original statement*/
        System.out.println(PURPLE_BOLD+"This is your Decrypted string:" +ANSI_RESET+" "+ RED_BOLD_BRIGHT+(decodedStatement) +ANSI_RESET);
    }

}
