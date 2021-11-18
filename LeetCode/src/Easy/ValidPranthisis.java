package Easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidPranthisis {

	private HashMap<Character, Character> mappings;

	  // Initialize hash map with mappings. This simply makes the code easier to read.
	  public ValidPranthisis() {
	    this.mappings = new HashMap<Character, Character>();
	    this.mappings.put(')', '(');
	    this.mappings.put('}', '{');
	    this.mappings.put(']', '[');
	  }

	  public boolean isValid(String s) {
		  Stack<Character> stack = new Stack<Character>();

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);
	      if (this.mappings.containsKey(c)) {
	        char topElement = stack.empty() ? '#' : stack.pop();
	        if (topElement != this.mappings.get(c)) {
	          return false;
	        }
	      } else {
	        stack.push(c);
	      }
	    }
	    return stack.isEmpty();
	  }
	
// Second method

public boolean isValid2(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}
}
/*
}
boolean valid(char b, char e) {
    return b == '(' && e == ')' || b == '{' && e == '}' || b == '[' && e == ']';
}

public boolean isValidChar(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (Character c : s.toCharArray()) {
        if (stack.isEmpty()) {
            stack.push(c);
        } else if (valid(stack.peek(), c)) {
            stack.pop();
        } else {
            stack.push(c);
        }
    }
    
    return stack.isEmpty();  
} */