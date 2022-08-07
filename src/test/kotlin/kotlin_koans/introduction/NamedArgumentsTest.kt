package kotlin_koans.introduction

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class NamedArgumentsTest {
    @Test
    fun caseOne() {
        val alphabets : Collection<String> = arrayListOf(
            "A", "B", "C", "D", "E", "F",
            "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X",
            "Y", "Z"
        )

        val expected = "[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z]"

        Assertions.assertEquals(expected, joinOptions(alphabets))
    }
}