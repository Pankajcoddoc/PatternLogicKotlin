package starpatterns
/*
output :- n=5

    *   *   *   *   *
      *   *   *   *
        *   *   *
          *   *
            *
          *   *
        *   *   *
      *   *   *   *
    *   *   *   *   *

*/

fun main() {
    val n = 5
    var reverse = 0
    var reverseCount = 0
    for (i in 0 until n * 2 - 1) {
        for (j in 0 until n * 2 - 1) {

            if (reverse == 0) {
                if ((j > i) && (i == j) || (((i + j) < n * 2 - 1) && ((i + j) % 2 == 0) && j >= i)) {
                    print("* ")

                } else {

                    print("  ")
                }
            } else {
                if ((j >= reverseCount) && (reverseCount == j) || (((reverseCount + j) < n * 2 - 1) && ((reverseCount + j) % 2 == 0) && j >= reverseCount)) {
                    print("* ")

                } else {

                    print("  ")
                }

            }
        }
        println()

        if (reverse > 0)
            reverseCount--
        if (i == n - 1) {
            reverse++
            reverseCount = n / 2 + 1
        }
    }

}