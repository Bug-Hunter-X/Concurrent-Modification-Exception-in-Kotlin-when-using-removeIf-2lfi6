fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    list.forEach { if (it > 2) toRemove.add(it) }
    toRemove.forEach { list.remove(it) }
    println(list) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    map.forEach { if (it.value > 2) keysToRemove.add(it.key) }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, b=2}

    //Alternative using filterTo
    val newList = list.filter { it <=2 }.toMutableList()
    println(newList) // Output: [1,2]
    val newMap = map.filter { it.value <= 2 }.toMutableMap()
    println(newMap) // Output: {a=1, b=2}
} 