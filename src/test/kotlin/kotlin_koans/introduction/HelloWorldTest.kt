package kotlin_koans.introduction

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HelloWorldTest {
    @Test
    fun helloWorldTest() {
        Assertions.assertEquals("OK", start())
    }
}