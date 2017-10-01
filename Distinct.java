import java.util.HashSet;
import java.util.Set;
/**
* Distinct
*
* @author zenmony
* @version 1.0
*
*/
class  Distinct {
	/**
	 * Distinct
	 * @param  a zero-indexed array A consisting of N integers
	 * @return the number of distinct values in array A
	 */
    public int solution(int[] A) {
        // validation check
		if (A == null || A.length ==0 )
			return 0;

		// Set for easy checking
    	Set<Integer> set = new HashSet<>( );
     	for (int i = 0; i<A.length ;i++){
     		set.add(A[i]);
    	}

        return set.size();

    }
}
