// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
                        // validation check
		if (A == null || A.length ==0 )
			return 0;

		// sort for easy check
		Arrays.sort(A);
		
		// All negative elements
		if (A[A.length-1] < 1)
			return 1;

		// judge
		for (int i = 0; i<A.length-1; i++) {
			if (A[i] < 1)
				continue;
			else if (A[i] == A[i+1] || A[i]+1 == A[i+1])
				continue;
			else
				return A[i]+1;
		}
		
		// max 
		return A.length + 1;

    }
}
