package kotlin_koans.introduction

// In kotlin we can set the values of parameters of a function like this if we don't know the arrangement
// or not interested to know them. Just take the name and assign the value.1
fun joinOptions(options: Collection<String>) = options.joinToString(
    prefix = "[", postfix = "]"
)