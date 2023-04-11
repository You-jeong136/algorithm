package level1

fun main(args: Array<String>) {
    var answer = 0;
    val babblings = arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa");

    for(babbling in babblings){
        var before = ""
        var str = ""
        for(bab in babbling){
            str += bab
            val check : Boolean = (str == "aya" || str == "ye" || str == "woo" || str == "ma")
            if(before != str && check){
                before = str
                str = ""
            }
        }
        if(str.isEmpty()){
            answer++;
        }
    }

    print(answer)
}