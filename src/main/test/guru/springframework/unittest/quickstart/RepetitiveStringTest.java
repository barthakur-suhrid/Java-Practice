package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepetitiveStringTest {
    RepetitiveString repetitiveString=null;
    RepetitiveStringTest repetitiveStringTest=null;
    @Before
    public void setUp() throws Exception {
        repetitiveString=new RepetitiveString();
        repetitiveStringTest=new RepetitiveStringTest();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void repeatString() {
        //Expected
        String expected ="Stackck";
        //Actual
        String results=repetitiveString.repeatString("Stack",2);
        // Assert
        assertEquals(expected,results);


    }
}