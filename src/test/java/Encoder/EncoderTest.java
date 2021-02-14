package Encoder;


import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {
    @Test//testing if a single letter gets converted to uppercase
    public void Encoder_ConvertsStingToUppercase_true() {
        Encoder testEncoder = new Encoder("a");
        assertEquals("A", testEncoder.encocoderFunc());
    }

    @Test
    public void Encoder_ShiftSingleLetterA_C () {//testing to see if encoderFunction shifts a single letter by 3
        Encoder testEncoder = new Encoder("A");
        assertEquals("C", testEncoder.encoderFunc());//expecting output to be "C
    }
    //testing to see if a string is shifted by three.

    @Test
    public void Encoder_ShiftWholeSentence(){
        Encoder testEncoder = new Encoder("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        assertEquals("WKH TXLEN EURZQ IUA MXPSV RYHU WKH ODCB GRJ",testEncoder.encoderFunc());
    }
}

