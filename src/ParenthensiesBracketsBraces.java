import java.util.Stack;
/* Write a program in Java which takes in a string as an input and returns true if all
all the parentheses, brackets and braces in the string are properly closed and nested.
 Parentheses() are the curved signs
 Brackets look similar but are angular in shape [], and
 Braces are also similar but are curly in shape {} 
*/


public class ParenthensiesBracketsBraces {

	public static void main(String[] args) {
	
		System.out.println("{(a,b)}");
		System.out.println("{(a},b");
		System.out.println("{)(a,b}");
			
		
	}	
		public static boolean ParenthensiesBracketsBraces (String s) {
			Stack<Character> stack=new Stack<Character>();
			for(int i=0; i<s.length(); i++) {
				char c=s.charAt(i);
			if(c== '['  || c=='(' || c=='{')  {	
				stack.push(c);
			}else if (c==']') {
				if(stack.isEmpty() || stack.pop() !='[') {
					return false;
				}
			}else if(c==')') {
				if(stack.isEmpty() || stack.pop() !='(') {
					return false;
				}
			}else if(c=='}') {
				if(stack.isEmpty() || stack.pop() !='{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
			
		}	

}
