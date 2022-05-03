import org.junit.jupiter.api.*;

    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)//Run tests by order

public class AscendingSequenceTest {

    @BeforeEach //Runs before every test
    void setUp(){

    }

    @Order(1)
    @RepeatedTest(5) //Repeat that test 5 times
    @Test
    public void testAscendingSequenceHappyPathPositive(){
        //0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumbers(){
          int start = -10;
        int end = -6;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7, -6};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumbers(){
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testAscendingSequenceStepTwo(){
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void testAscendingSequenceStartLargerThenEnd(){
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(6)
    @Test
    public void testAscendingSequenceNegativeStep(){
        int start = 5;
        int end = 0;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
