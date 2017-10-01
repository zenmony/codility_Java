import java.util.Stack;
/**
* stone wall
*
* @author zenmony
* @version 1.0
*
*/
class  StoneWall {
	/**
	 * stone wall
	 * @param  zero-indexed array H of N positive integers
	 * @return the minimum number of blocks needed to build it.
	 */
    public int solution(int[] H) {

	// using Stack (LIFO)
	Stack<Integer> stack = new Stack<>();

	int cnt = 0;
	for (int i=0; i<H.length; i++) {
		// empty
		if (stack.size() == 0) {
			stack.push(H[i]);
			cnt++;
		// descend
		} else if  ( H[i] < stack.peek()) {
			while (stack.size() > 0 &&H[i] < stack.peek() ) {
				stack.pop();
			}
			// retry
			i--;
		// ascend
		}else if( H[i] > stack.peek()) {
			stack.push(H[i]);
			cnt++;
		}
	}

	return cnt;
	}
}
