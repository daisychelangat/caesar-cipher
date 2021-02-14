package Decoder;
import org.junit.Test;


import static org.junit.Assert.*;

public class DecoderTest {
    @Test
    public void Encoder_ShiftSingleLetter() {//testing to see if a single letter is decoded to it's original state.
        Decoder testDecoder = new Decoder("C");
        //expecting output to be "A"
        assertEquals("A", testDecoder.decoderFunc());
    }
    //testing to see if a string of three characters is decoded
    @Test
    public void Encoder_ShiftingMoreThanOneLetter(){
        Decoder testEncoder =new Decoder ("COO") ;
        assertEquals("ALL",testEncoder.decoderFunc());
    }
    @Test
    public void Encoder_ShiftWholeSentence(){//testing to see if a whole sentence is decode to it's original form
        Decoder testDecoder = new Decoder("WKH TXLEN EURZQ IUA MXPSV RYHU WKH ODCB GRJ");
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",testDecoder.decoderFunc());
    }
}

