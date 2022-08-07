package kotlin_koans.introduction

/**
 * Let's say we have following func
 *
 * public String foo(String name, int number, boolean toUpperCase) {
 *    return (toUpperCase ? name.toUpperCase() : name) + number;
 * }
 *
 * public String foo(String name, int number) {
 *    return foo(name, number, false);
 * }
 *
 * public String foo(String name, boolean toUpperCase) {
 *    return foo(name, 42, toUpperCase);
 * }
 *
 * public String foo(String name) {
 *    return foo(name, 42);
 * }
 */

// Reduce them to single function

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.uppercase() else name) + number
}

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)