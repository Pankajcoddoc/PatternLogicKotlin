/*
when row = 5
         *
        * *
       * * *
      * * * *
     * * * * *
*/
fun main() {
    val row = 5
    val column = row * 2 - 1
    for (i in 0 until row) {
        var update = column / 2
        var maxCount = 0
        for (j in 0 until column) {
            if ((i + j) == update && maxCount <= i) {
                update += 2
                print("*")
                maxCount++
            } else {
                print(" ")
            }
        }
        println()
    }
}