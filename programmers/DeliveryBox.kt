import java.util.*

fun main(args: Array<String>) {
    val order : IntArray = intArrayOf(2, 1, 4, 3, 6, 5, 8, 7, 10, 9)
    print(solution(order))
}
private fun solution(order: IntArray): Int {
    var answer: Int = 0

    val subBelt = Stack<Int>()
    var idx = 0
    for(box in 1 .. order.size){
        if(order[idx] != box){
            subBelt.push(box)
            continue
        }

        idx++
        answer++


        while(subBelt.isNotEmpty() && order[idx] == subBelt.peek()){
            subBelt.pop()
            answer++
            idx++
        }
    }

    return answer
}
