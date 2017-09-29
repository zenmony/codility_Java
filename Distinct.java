// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Set;
import java.util.HashSet;

class  Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
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
