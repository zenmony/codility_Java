import static org.junit.Assert.*;

import org.junit.Test;

public class OddOccurrencesInArrayTest {

	@Test
	public void test1() {
		OddOccurrencesInArray example = new OddOccurrencesInArray();
		int[] testArray = {1,1,3,5,5};
		assertEquals(3, example.solution(testArray));
	}

	@Test
	public void test2() {
		OddOccurrencesInArray example = new OddOccurrencesInArray();
		int[] testArray = {1, 1, 3, 3 ,5 };
		assertEquals(5, example.solution(testArray));
	}


	@Test
	public void test3() {
		OddOccurrencesInArray example = new OddOccurrencesInArray();
		int[] testArray = {1, 1 ,3};
		assertEquals(3, example.solution(testArray));
	}

	@Test
	public void test4() {
		OddOccurrencesInArray example = new OddOccurrencesInArray();
		int[] testArray = {3, 5, 5};
		assertEquals(3, example.solution(testArray));
	}

	@Test
	public void test5() {
		OddOccurrencesInArray example = new OddOccurrencesInArray();
		int[] testArray = {3 ,3 ,7 ,9, 9, 9, 9 };
		assertEquals(7, example.solution(testArray));
	}

	@Test
	public void test6() {
		OddOccurrencesInArray example = new OddOccurrencesInArray();
		int[] testArray = {1, 1 ,3 ,3 ,3};
		assertEquals(3, example.solution(testArray));
	}

}
