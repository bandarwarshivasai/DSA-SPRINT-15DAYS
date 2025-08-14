class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == c) {
                countStack.push(countStack.pop() + 1);
                if (countStack.peek() == k) {
                    charStack.pop();
                    countStack.pop();
                }
            } else {
                charStack.push(c);
                countStack.push(1);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            char ch = charStack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
}
