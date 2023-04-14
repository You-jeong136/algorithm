
fun main(args : Array<String>){
    val topping : IntArray = intArrayOf(1, 2, 1, 3, 1, 4, 1, 2)
    print(solution(topping))
}
private fun solution(topping: IntArray): Int {
    var answer: Int = 0

    val a = HashMap<Int, Int>()
    val b = HashMap<Int, Int>()
    for (top in topping) b[top] = b.getOrDefault(top, 0) + 1

    for (i in topping.indices) {
        a[topping[i]] = a.getOrDefault(topping[i], 0) + 1
        b[topping[i]] = b.getOrDefault(topping[i], 0) - 1
        if (b.getOrDefault(topping[i], 0) == 0){
            b.remove(topping[i])
        }
        if (a.size == b.size) {
            answer++
        }
    }
    return answer

}


