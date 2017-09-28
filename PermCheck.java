// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;

class PermCheck {
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
