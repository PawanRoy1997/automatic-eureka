package kotlin_koans.introduction

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class DefaultArgumentTest{
    @Test
    fun defaultCase(){
        val expected = listOf(
            "a42",
            "b1",
            "C42",
            "D2",
        )
        Assertions.assertEquals(expected, useFoo())
    }
}