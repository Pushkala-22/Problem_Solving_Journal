class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        c=0
        r=0
        for i in nums:
            if i==0:
                c=0
            else:
                c=c+1
            r=max(c,r)
        return r
        