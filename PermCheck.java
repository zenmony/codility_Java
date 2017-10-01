import java.util.Arrays;
/**
* permutation check
*
* @author zenmony
* @version 1.0
*
*/
class PermCheck {
	/**
	 * permutation check
	 * @param A non-empty zero-indexed array A consisting of N integers
	 * @return 1:permutation  0:not permutation check
	 */
    public int solution(int[] A) {
        // validation check
		if (A == null || A.length ==0 )
			return 0;

		// sort for easy check
		Arrays.sort(A);

		// judge
		for (int i = 0; i<A.length; i++) {
			if (A[i] != i+1)
				return 0;
		}
			return 1;
    }
}
