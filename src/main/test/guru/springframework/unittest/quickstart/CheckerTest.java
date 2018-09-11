package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CheckerTest {
    CheckerTest checkerTest=null;
    Checker checker=null;

    @Before
    public void setUp() throws Exception {
        checkerTest=new CheckerTest();
        checker=new Checker();
    }

    @After
    public void tearDown() throws Exception {
        checkerTest=null;
        checker=null;
    }

    @Test
    public void inputCheckerPositive1(){

        //Expected
        String expected ="Jerry";
        //Actual
        String results=checker.InputChecker("22");
        // Assert
        assertEquals(expected,results);


    }

    @Test
    public void inputCheckerPositive2(){

        //Expected
        String expected ="Tom";
        //Actual
        String results=checker.InputChecker("25");
        // Assert
        assertEquals(expected,results);


    }

    @Test
    public void vowelCheckerPositive1(){
        //Expected
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("Is a vowel");
        expected.add("Is a vowel");
        expected.add("Is a consonant");
        expected.add("Is a consonant");
        expected.add("Is a vowel");

        //Actual
        ArrayList<String> results=checker.VowelChecker("eette");
        // Assert
        assertEquals(expected,results);

    }



    @Test
    public void characterChecker1(){

        //Expected
        String expected ="Capital Letter";
        //Actual
        String results=checker.CharacterChecker('A');
        // Assert
        assertEquals(expected,results);


    }

    @Test
    public void characterChecker2(){

        //Expected
        String expected ="Lowercase Letter";
        //Actual
        String results=checker.CharacterChecker('b');
        // Assert
        assertEquals(expected,results);


    }

    @Test
    public void characterChecker3(){

        //Expected
        String expected ="Special symbol";
        //Actual
        String results=checker.CharacterChecker('#');
        // Assert
        assertEquals(expected,results);


    }

}