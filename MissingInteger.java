// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Set;
import java.util.TreeSet;

class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
                        
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
