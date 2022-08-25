package starpatterns
/*


        *
       * *
      *   *
     *     *
      *   *
       * *
        *

*/

fun main() {

    val n = 5;
    var reverseOrder = 0
    var count = 1
    for (i in 0 until n * 2 - 1) {

        for (j in 0 until n * 2 - 1) {
            if (reverseOrder <= 0) {
                if ((i + j) == (((n * 2 - 1) / 2)) || ((i + j) == (((n * 2 - 1) / 2) + (i * 2)))) {
                    print("*")
                } else print(" ")
            } else {
                if (((i + j) == (((n * 2 - 1) / 2) + (((n * 2 - 1) / 2) * 2))) || (i + j) == (((n * 2 - 1) / 2) + (count * 2))) {
                    print("*")
                } else print(" ")
            }
        }
        if (reverseOrder > 0) {

            count++
        }
        if (i == n - 1) {
            reverseOrder = 1
        }
        println()
    }

}