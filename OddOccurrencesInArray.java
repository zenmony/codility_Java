import java.util.Arrays;

/**
* unpaired value
* @author zenmony
*
*/
class OddOccurrencesInArray {
/**
 * return unpaired value
 * @param A non-empty zero-indexed array A consisting of N integers
 * @return unpaired value
 */
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        // validation check
		if (A == null || A.length ==0 )
			return 0;

		if ( A.length == 1) {
			return A[0];
		}


		// sort for easy check
		Arrays.sort(A);

		int counter = 1;

		// check
		for (int i = 1; i < A.length; i++) {

			// check target with before item to check by last items
			if (A[i-1] == A[i]) {
				counter++;
			}
			else {
				// find at last items
				if (i == A.length - 1)
					return A[i];
				// find except last items
				// div by 2 because same valuse occurs more than 2 times and one pair is 2 items
				else if ( counter % 2 == 1)
					return A[i-1];
				else
					counter = 1;
			}
	
		}

		// last item 
		return A[A.length-1];

    }
}
