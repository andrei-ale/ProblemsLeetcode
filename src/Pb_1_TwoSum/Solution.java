class Solution:
        def twoSum(self, nums: List[int], target: int) -> List[int]:
        output = []
        for i in range(len(nums)):
        if len(output) == 2:
        break
        for j in range(len(nums)):
        if i != j:
        if nums[i] + nums[j] == target:
        output.append(i)
        output.append(j)
        return output
        
