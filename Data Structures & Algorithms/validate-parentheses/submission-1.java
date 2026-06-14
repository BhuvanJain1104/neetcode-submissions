class Solution {
     static int top;

    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
        top=-1;
        for (char c : s.toCharArray()) {

            switch (c) {

                case '(':
                case '{':
                case '[':
                    push(stack, c);
                    break;

                case ')':
                    if (top == -1 || pop(stack) != '(')
                        return false;
                    break;

                case '}':
                    if (top == -1 || pop(stack) != '{')
                        return false;
                    break;

                case ']':
                    if (top == -1 || pop(stack) != '[')
                        return false;
                    break;
            }
        }

        return top == -1;
    }

    static void push(char[] stack, char c) {
        stack[++top] = c;
    }

    static char pop(char[] stack) {
        return stack[top--];
    }
}
