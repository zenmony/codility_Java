import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {

    @Test
    public void test1() {
        CyclicRotation example = new CyclicRotation();
        int[] testArray = {1, 2, 3, 4 ,5 };
        int[] actualArray = { 5, 1 ,2, 3, 4 };
        assertArrayEquals(actualArray, example.solution(testArray,1));
    }

    @Test
    public void test2() {
        CyclicRotation example = new CyclicRotation();
        int[] testArray = {1, 2, 3, 4 ,5 };
        int[] actualArray = {  4 ,5, 1, 2, 3};
        assertArrayEquals(actualArray, example.solution(testArray,2));
    }


    @Test
    public void test3() {
        CyclicRotation example = new CyclicRotation();
        int[] testArray = {1, 2, 3, 4 ,5 };
        int[] actualArray = { 2, 3, 4,5,1 };
        assertArrayEquals(actualArray, example.solution(testArray,4));
    }

    @Test
    public void test4() {
        CyclicRotation example = new CyclicRotation();
        int[] testArray = {1, 2, 3, 4 ,5 };
        int[] actualArray = {1, 2, 3, 4 ,5 };
        assertArrayEquals(actualArray, example.solution(testArray,5));
    }

    @Test
    public void test5() {
        CyclicRotation example = new CyclicRotation();
        int[] testArray = {1, 2, 3, 4 ,5 };
        int[] actualArray = { 5, 1 ,2, 3, 4 };
        assertArrayEquals(actualArray, example.solution(testArray,6));
    }




}
