class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty())
        return true;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '[' || bracket == '{'){
                stack.push(bracket);
            }
            else if(!stack.isEmpty()){
                if(bracket == ')'){
                    if(stack.peek() == '(')
                        stack.pop();
                    else{
                        return false;
                    }
                }
                else if(bracket == ']'){
                    if(stack.peek() == '[')
                        stack.pop();
                    else{
                    return false;
                    }
                }else if(bracket == '}'){
                    if(stack.peek() == '{')
                        stack.pop();
                    else{
                        return false;
                    }
                }
            }else{
                return false;
            }
        } 

      return stack.isEmpty();
    }

 
}