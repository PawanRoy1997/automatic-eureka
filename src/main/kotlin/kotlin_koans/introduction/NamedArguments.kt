package kotlin_koans.introduction

fun joinOptions(options: Collection<String>) = options.joinToString(
    prefix = "[", postfix = "]", separator = ","
)