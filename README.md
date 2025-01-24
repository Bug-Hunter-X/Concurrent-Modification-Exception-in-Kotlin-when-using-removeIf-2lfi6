# Concurrent Modification Exception in Kotlin when using removeIf
This example demonstrates a common error in Kotlin when using the `removeIf` function with mutable collections like `MutableList` and `MutableMap`. Modifying a collection during iteration can lead to unexpected results or exceptions.

The code in `bug.kt` shows the issue, while `bugSolution.kt` provides a solution.  The issue stems from the fact that the `removeIf` predicate modifies the collection during iteration which can lead to elements being skipped or the iterator to throw a `ConcurrentModificationException`.