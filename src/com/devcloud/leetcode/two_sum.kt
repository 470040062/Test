package com.devcloud.leetcode;


class Solution{
    fun twosum(nums: IntArray, target: Int): IntArray{
        //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
        //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
        var hashMap = hashMapOf<Int, Int>()
        for ((i,num) in nums.withIndex()){
            var remain = target - num
            var j:Int? = hashMap.get(remain)
            j.let {
                if(hashMap.contains(remain)){
                    return intArrayOf(j!!,i)
                }
            }
            hashMap[num] = i
        }
        return intArrayOf()
    }
}

fun main(args: Array<String>){
    //println("hello world!")
    val a = Solution().twosum(intArrayOf(2,7,11,15), 26)
    for (i in a.indices){
        println(a[i])
    }
}