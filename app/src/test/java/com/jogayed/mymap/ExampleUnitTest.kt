package com.jogayed.mymap

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testcase_1() {
        val arrA = intArrayOf(1, 3, 6, 8, 15)
        val arrB = intArrayOf(1, 3, 15)

        testIsArrBisSubSetOfArrA(arrA, arrB, true)
    }

    @Test
    fun testcase_2() {
        val arrA = intArrayOf(1, 3, 6, 8, 15)
        val arrB = intArrayOf(1, 3, 3)

        testIsArrBisSubSetOfArrA(arrA, arrB, false)
    }

    @Test
    fun testcase_3() {
        val arrA = intArrayOf(1, 3, 6, 8, 15)
        val arrB = intArrayOf(1, 3, 16)

        testIsArrBisSubSetOfArrA(arrA, arrB, false)
    }

    @Test
    fun testcase_4() {
        val arrA = intArrayOf(1, 3, 6, 8, 15)
        val arrB = intArrayOf(1, 3, 6, 8, 15)

        testIsArrBisSubSetOfArrA(arrA, arrB, true)
    }

    @Test
    fun testcase_5() {
        val arrA = intArrayOf(1, 3, 6, 8, 15)
        val arrB = intArrayOf(1, 3, 6, 8, 15,19)

        testIsArrBisSubSetOfArrA(arrA, arrB, false)
    }


    private fun testIsArrBisSubSetOfArrA(arrA: IntArray, arrB: IntArray, expectedResult: Boolean) {
        val isSubsetArray = isSubSetOf(arrA, arrB)
        assertEquals(expectedResult, isSubsetArray)
    }

    private fun isSubSetOf(arrA: IntArray, arrB: IntArray): Boolean {
        var a = 0
        var b = 0
        while (a < arrA.size && b < arrB.size) {
            when {
                arrA[a] < arrB[b] -> {
                    a += 1
                }
                arrA[a] == arrB[b] -> {
                    a += 1
                    b += 1
                }
                arrA[a] > arrB[b] -> {
                    return false
                }
            }
        }

        return b == arrB.size
    }
}