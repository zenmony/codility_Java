/**
* A which is shifted to the right by K indexes
* @author zenmony
*
*/
class CyclicRotation {
/**
 * return A which is shifted to the right by K indexes
 * @param A zero-indexed array A consisting of N integers
 * @param K  A will be shifted to the right by K indexes.
 * @return B which is shifted to the right by K indexes
 */
    public int[] solution(int[] A, int K) {
       		 // validation check
		if (A == null || A.length ==0 )
			return A;

		if ( A.length == 1) {
			return A;
		}
		
		// N is the lenght of Array A
		int N = A.length;

		// rotate number
		int rotate = K % N;
		
		// new Array
		int[] B = new int[N];
		
		// shift
		for (int i = 0; i < N; i++) {
			B[(i + rotate) % N] = A[i];
		}
		
		return B;

    }
}
