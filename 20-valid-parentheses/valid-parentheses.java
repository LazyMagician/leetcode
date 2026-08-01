class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty())
        return true;
        Deque<Character> stack = new ArrayDeque<>();

        for(Character bracket:s.toCharArray()){
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

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

 
}