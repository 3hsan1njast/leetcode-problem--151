fun main() {
    val s = "Ayo! Fuck You!"
    val splitStr = s.split(' ')
    val result = reverseList(makeListMutable(splitStr)).joinToString(" ")
    println(result)
}

fun makeListMutable(list: List<String>): MutableList<String> {
    val mutableList = mutableListOf<String>()
    list.forEach { mutableList.add(it) }
    return mutableList
}

fun reverseList(list: MutableList<String>): MutableList<String> {
    val reversedList = mutableListOf<String>()
    for (i in list.size - 1 downTo 0) {
        reversedList.add(list[i])
    }
    return reversedList
}
