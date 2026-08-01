class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> operands = new Stack<>();
        // List<String> operators = Arrays.asList("+","-","*","/");
        if(tokens.length == 0)
            return 0;
        for(String token:tokens){
            
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
               Integer secondOperand = operands.pop();
               Integer firstOperand = operands.pop();
               Integer value = compute(firstOperand, secondOperand,token);
               operands.push(value);
            }else{
                operands.push(Integer.parseInt(token));
            }
            
        }
        return operands.pop();
    }

    public Integer compute(Integer first, Integer second, String operator){

        switch(operator){
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
        }
        return 0;
    }
}