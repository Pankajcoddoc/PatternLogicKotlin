package starpatterns

/*

    * * * * *
     * * * *
      * * *
       * *
        *

*/
fun main() {


    val row = 5
    val mColumn = row * 2 - 1

    for (i in 0 until row) {
        var update = row - i
        for (j in 0 until mColumn) {
            if ((j >= i && i == j) || ((j>i)&&((i + j) < row * 2 - 1) && (i + j) % 2 == 0)) {
                print("*")

            } else print(" ")

        }
        println()
    }
}