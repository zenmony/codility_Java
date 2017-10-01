import java.util.Set;
import java.util.TreeSet;
/**
* Missing Integer
*
* @author zenmony
* @version 1.0
*
*/
class MissingInteger {
	/**
	 * Missing Integer
	 * @param  zero-indexed array H of N positive integers
	 * @return the smallest positive integer (greater than 0) that does not occur in A.
	 */
    public int solution(int[] A) {
		// validation check
		if (A == null || A.length ==0 )
				return 0;

		// TreeSet for easy checking
	    Set<Integer> set = new TreeSet<>();

	    // auto-sort and positive value only
	    for (int i=0; i<A.length; i++) {
	    	// positive value only
			if (A[i] > 0) {
				// auto-sort by TreeSet
	    		set.add(A[i]);
	 		}
	 	}


	 	// search missing integer
	 	int cnt = 1;
		for(Integer value : set){
			if (cnt != value)
				return cnt;
			cnt++;
		}

		// max
		return cnt;
    }
}
