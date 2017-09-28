import java.util.Arrays;

/**
* missing element
* @author zenmony
*
*/
class PermMissingElem {
/**
 * find missing element
 * @param A non-empty zero-indexed array A consisting of N integers
 * @return missing element
 */
    public int solution(int[] A) {
		// validation check
		if (A == null || A.length ==0)
			return 1;

		// minimum case
		if ( A.length == 1) {
			if (A[0] == 1)
				return 2;
			else
				return 1;
		}

		// sort for easy check
		Arrays.sort(A);

		// find
		for (int i = 0; i < A.length; i++) {

			// check target with before item to check by last items
			if (A[i] != i+1) {
				return A[i]-1;
			}
	
		}

		// when last item 
		return A[A.length-1]+1;

    }
}
