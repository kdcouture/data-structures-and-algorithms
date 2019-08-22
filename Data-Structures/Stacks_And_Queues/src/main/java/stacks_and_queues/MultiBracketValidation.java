package stacks_and_queues;

public class MultiBracketValidation {
    Stack<Character> bracketStack;

   public MultiBracketValidation() {
        this.bracketStack = new Stack<>();
    }

    public boolean validate(String input) {
       char cur;
       for(int i = 0; i < input.length(); i++) {
           // Find opening brackets
           cur = input.charAt(i);
           if(cur == '(' || cur == '[' || cur == '{') {
               // Place into stack
               this.bracketStack.push(cur);
           }
           // Find closing brackets
           else {
               if(cur == ')') {
                   // Found mis matched brackets
                   if(this.bracketStack.top == null || '(' != this.bracketStack.pop()) {
                       return false;
                   }
               }
               if(cur == ']') {
                   // Found mis matched brackets
                   if(this.bracketStack.top == null || '[' != this.bracketStack.pop()) {
                       return false;
                   }
               }
               if(cur == '}') {
                   // Found mis matched brackets
                   if(this.bracketStack.top == null || '{' != this.bracketStack.pop()) {
                       return false;
                   }
               }
           }
       }
       if(this.bracketStack.top == null) {
           return true;
       }
       return false;
    }
}
