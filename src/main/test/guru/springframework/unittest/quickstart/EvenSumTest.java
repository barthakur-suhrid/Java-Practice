package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenSumTest {
    EvenSumTest evenSumTest=null;

    @Before
    public void setUp() throws Exception {
            evenSumTest=new EvenSumTest();
    }

    @After
    public void tearDown() throws Exception {

        evenSumTest=null;
    }

    @Test
    public void getEvenSumPositive1(){
        //Actual
        String expected="Greater than 25";

        //Act
        EvenSum ES=new EvenSum();
        String results=ES.GetEvenSum("122244444");
        // Assert
        assertEquals(expected,results);

    }

    @Test
    public void getEvenSumPositive2(){
        //Actual
        String expected="Less than 25";

        //Act
        EvenSum ES=new EvenSum();
        String results=ES.GetEvenSum("12224444");
        // Assert
        assertEquals(expected,results);

    }
}