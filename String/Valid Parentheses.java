class Solution {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        }
        return s.isEmpty();
    }
}




class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) 
                return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
