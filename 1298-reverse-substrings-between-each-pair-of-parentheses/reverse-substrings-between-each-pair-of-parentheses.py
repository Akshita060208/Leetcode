class Solution(object):

    def reverseParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """

        stack = []
        current = ""

        for char in s:

            if char == '(':
                stack.append(current)
                current = ""

            elif char == ')':
                current = current[::-1]
                current = stack.pop() + current

            else:
                current += char

        return current