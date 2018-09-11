package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortAddTest {

    StringSortAdd stringSortAdd=null;
    StringSortAddTest stringSortAddTest=null;

    @Before
    public void setUp() throws Exception {
        stringSortAdd=new StringSortAdd();
        stringSortAddTest=new StringSortAddTest();
    }

    @After
    public void tearDown() throws Exception {
        stringSortAdd=null;
        stringSortAddTest=null;
    }

    @Test
    public void sortAdder() {
        //Expected
        int expected =12;

        //Actual
        int results=stringSortAdd.SortAdder("25467");

        // Assert
        assertEquals(expected,results);

    }

    @Test
    public void sorter() {

        //Expected
        int[] expected =new int[]{8,7,6,5,4};

        //Actual
        int[] arr=new int[]{4,5,6,7,8};
        int[] results=stringSortAdd.Sorter(arr);

        // Assert
        assertArrayEquals(expected,results);


    }

    @Test
    public void sumChecker1() {

        boolean expected =true;

        //Actual
        boolean results=stringSortAdd.SumChecker(17);

        // Assert
        assertEquals(expected,results);

    }

    @Test
    public void sumChecker2() {

        boolean expected =false;

        //Actual
        boolean results=stringSortAdd.SumChecker(12);

        // Assert
        assertEquals(expected,results);

    }
}