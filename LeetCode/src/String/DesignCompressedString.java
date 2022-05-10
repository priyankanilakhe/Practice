
//https://massivealgorithms.blogspot.com/2017/06/leetcode-604-design-compressed-string.html
package String;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DesignCompressedString {
	Queue<int[]> queue = new LinkedList<int[]>();

	public void StringIterator(String s) {
		int i = 0, n = s.length();
		
		while (i < n) {
			int j = i + 1;
			while (j < n && s.charAt(j) - 'A' < 0)
				j++;
			System.out.println(s.substring(i+1, j));
			System.out.println("Parse Integer " + Integer.parseInt(s.substring(i+1, j)));
			queue.add(new int[] { s.charAt(i) - 'A', Integer.parseInt(s.substring(i+1, j)) });
			i = j;
		}
	}

	public char next() {
		if (queue.isEmpty())
			return ' ';
		int[] top = queue.peek();
		if (--top[1] == 0)
			queue.poll();
		return (char) ('A' + top[0]);

	}

	public boolean hasNext() {
		return !queue.isEmpty();
	}
	
	public static void main(String[] args)
	{
		DesignCompressedString iterator = new DesignCompressedString();
		iterator.StringIterator("L1e2t1C1o1d1e1");
		//iterator.next();
	/*	System.out.println(iterator.next()); // return 'L'
		iterator.next(); // return 'e'
		iterator.next(); // return 'e'
		iterator.next(); // return 't'
		iterator.next(); // return 'C'
		iterator.next(); // return 'o'
		//iterator.next(); // return 'd'
		 * 
*/		System.out.println(iterator.hasNext()); // return true
		iterator.next(); // return 'e'
		System.out.println(iterator.hasNext()); // return false
		iterator.next(); // return ' '
		//Arrays.stream(iterator.queue)
		for(int[] a:iterator.queue) {
			System.out.println(Arrays.toString(a));
		}
		
		
		}

}
