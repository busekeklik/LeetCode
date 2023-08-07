class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        sum1 = sum2 = 0
        for i in nums:
            sum1 += i
            sum2 += self.digit_sum(i)
        return abs(sum1 - sum2)
    
    def digit_sum(self, n: int) -> int:
        sum = 0
        while n:
            sum += int(n % 10)
            n //= 10
        return sum