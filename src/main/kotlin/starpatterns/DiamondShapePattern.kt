/*

Diamond Shape pyramid Pattern, when n = 4
---*---
--*-*--
-*-*-*-
*-*-*-*
-*-*-*-
--*-*--
---*---


*/
fun main() {
    val n = 4
    val secondIte = (n * 2) - 1
    var reverse = 0
    var reverseUpdate = 1
    for (i in 0 until secondIte) {
        var update = secondIte / 2
        var count = 0
        var reverseCount = i + reverseUpdate
        for (j in 0 until secondIte) {

            if (i == n) {
                reverse = 1
            }
            if (reverse <= 0) {
                if ((i + j) == update && count <= i) {
                    update += 2
                    print("*")
                    count++
                } else
                    print(" ")
            } else {
                if ((i + j) == reverseCount && (n * 2 + 1) >= (i + j)) {
                    reverseCount += 2
                    print("*")
                } else
                    print(" ")
            }
        }
        if (reverse > 0)
            reverseUpdate++
        println()
    }
}