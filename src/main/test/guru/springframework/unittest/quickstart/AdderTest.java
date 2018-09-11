package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    Adder adder=null;
    AdderTest adderTest=null;
    @Before
    public void setUp() throws Exception {
        adder=new Adder();
        adderTest=new AdderTest();
    }

    @After
    public void tearDown() throws Exception {
        adder=null;
        adderTest=null;
    }

    @Test
    public void inputAdder(){

        //Expected
        int expected =24;

        //Actual
        int results=adder.InputAdder("2 5 4 6 7");

        // Assert
        assertEquals(expected,results);

    }
}