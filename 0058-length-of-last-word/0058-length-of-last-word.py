class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        new_str = s.split()
        a=list(new_str[-1])
        return len(a)