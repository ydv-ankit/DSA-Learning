// ques no : 1
// Given an array of integers nums and an integer target, return indices
// of the two numbers such that they add up to target

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    i = arr.length;
                    break;
                }
            }
        }
        return ans;
        
    }
}

// explaination
/*
    to get indices of elements that sum up to target, traverse arr using for loop (outer-loop here) and
    again one step ahead (so that same element doesn't come again) traverse array using inner-loop and check if sum of both the elements
    makes target or not, if sum equals target then set indices of ans array with indices that makes target and end the inner-loop, make i = arr.length so that
    outer-loop also ends, return the array ans.
*/